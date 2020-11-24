package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewDataSourceOptionsFlatDataOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.native
  
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it.
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  
  /**
    * Optional="false" An object containing processing instructions for the $.ig.DataSource data.
    */
  var metadata: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadata] = js.native
  
  /**
    * See $.ig.DataSource.
    * string  Specifies the name of the property in which data records are held if the response is wrapped.
    * null  Option is ignored.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  
  /**
    * String  Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    * null  Option is ignored.
    */
  var responseDataType: js.UndefOr[String] = js.native
}
object IgPivotViewDataSourceOptionsFlatDataOptions {
  
  @scala.inline
  def apply(): IgPivotViewDataSourceOptionsFlatDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptions]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSourceOptionsFlatDataOptionsOps[Self <: IgPivotViewDataSourceOptionsFlatDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    
    @scala.inline
    def setMetadata(value: IgPivotViewDataSourceOptionsFlatDataOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    
    @scala.inline
    def setResponseDataType(value: String): Self = this.set("responseDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseDataType: Self = this.set("responseDataType", js.undefined)
  }
}
