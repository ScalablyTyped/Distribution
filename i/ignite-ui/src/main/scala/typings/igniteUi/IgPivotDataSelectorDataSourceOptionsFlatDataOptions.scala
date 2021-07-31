package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it.
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Optional="false" An object containing processing instructions for the $.ig.DataSource data.
    */
  var metadata: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata] = js.undefined
  
  /**
    * See $.ig.DataSource.
    * string Specifies the name of the property in which data records are held if the response is wrapped.
    * null Option is ignored.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  
  /**
    * String Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    * null Option is ignored.
    */
  var responseDataType: js.UndefOr[String] = js.undefined
}
object IgPivotDataSelectorDataSourceOptionsFlatDataOptions {
  
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptions]
  }
  
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMutableBuilder[Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    @scala.inline
    def setMetadata(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    @scala.inline
    def setResponseDataType(value: String): Self = StObject.set(x, "responseDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDataTypeUndefined: Self = StObject.set(x, "responseDataType", js.undefined)
  }
}
