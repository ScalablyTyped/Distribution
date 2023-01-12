package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSettingsPaging
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Whether when a new page of data is requested we should append the new data to the existing data
    *
    */
  var appendPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Paging is not enabled by default
    *
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Current page index
    *
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page index
    *
    */
  var pageIndexUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * Number of records on each page
    *
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page size
    *
    */
  var pageSizeUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * Type for the paging operation
    *
    *
    * Valid values:
    * "local" Data is paged client-side.
    * "remote" A remote request is done and URL params encoded
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceSettingsPaging {
  
  inline def apply(): DataSourceSettingsPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsPaging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSettingsPaging] (val x: Self) extends AnyVal {
    
    inline def setAppendPage(value: Boolean): Self = StObject.set(x, "appendPage", value.asInstanceOf[js.Any])
    
    inline def setAppendPageUndefined: Self = StObject.set(x, "appendPage", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
    
    inline def setPageIndexUrlKey(value: String): Self = StObject.set(x, "pageIndexUrlKey", value.asInstanceOf[js.Any])
    
    inline def setPageIndexUrlKeyUndefined: Self = StObject.set(x, "pageIndexUrlKey", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageSizeUrlKey(value: String): Self = StObject.set(x, "pageSizeUrlKey", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUrlKeyUndefined: Self = StObject.set(x, "pageSizeUrlKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
