package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceErrorEvent extends DataSourceEvent {
  
  var errorThrown: js.Any = js.native
  
  var errors: js.UndefOr[js.Any] = js.native
  
  var status: String = js.native
  
  var xhr: JQueryXHR = js.native
}
object DataSourceErrorEvent {
  
  @scala.inline
  def apply(errorThrown: js.Any, status: String, xhr: JQueryXHR): DataSourceErrorEvent = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceErrorEvent]
  }
  
  @scala.inline
  implicit class DataSourceErrorEventMutableBuilder[Self <: DataSourceErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorThrown(value: js.Any): Self = StObject.set(x, "errorThrown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhr(value: JQueryXHR): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}
