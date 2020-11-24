package typings.keenTracking.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keenTracking.anon.Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeenTracking extends js.Object {
  
  def recordEvent(collectionName: String, event: js.Object): js.Promise[Created] = js.native
  
  def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]] = js.native
}
object KeenTracking {
  
  @scala.inline
  def apply(
    recordEvent: (String, js.Object) => js.Promise[Created],
    recordEvents: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]
  ): KeenTracking = {
    val __obj = js.Dynamic.literal(recordEvent = js.Any.fromFunction2(recordEvent), recordEvents = js.Any.fromFunction1(recordEvents))
    __obj.asInstanceOf[KeenTracking]
  }
  
  @scala.inline
  implicit class KeenTrackingOps[Self <: KeenTracking] (val x: Self) extends AnyVal {
    
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
    def setRecordEvent(value: (String, js.Object) => js.Promise[Created]): Self = this.set("recordEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRecordEvents(value: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]): Self = this.set("recordEvents", js.Any.fromFunction1(value))
  }
}
