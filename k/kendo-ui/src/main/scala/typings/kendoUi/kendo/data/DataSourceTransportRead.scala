package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransportRead extends JQueryAjaxSettings {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataType: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[js.Any] = js.native
}
object DataSourceTransportRead {
  
  @scala.inline
  def apply(): DataSourceTransportRead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportRead]
  }
  
  @scala.inline
  implicit class DataSourceTransportReadMutableBuilder[Self <: DataSourceTransportRead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
