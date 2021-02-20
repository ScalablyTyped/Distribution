package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceEvent extends StObject {
  
  var sender: js.UndefOr[DataSource] = js.native
}
object DataSourceEvent {
  
  @scala.inline
  def apply(): DataSourceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceEvent]
  }
  
  @scala.inline
  implicit class DataSourceEventMutableBuilder[Self <: DataSourceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSender(value: DataSource): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
