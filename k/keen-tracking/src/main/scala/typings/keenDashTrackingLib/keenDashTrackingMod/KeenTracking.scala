package typings
package keenDashTrackingLib.keenDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeenTracking extends js.Object {
  def recordEvent(collectionName: java.lang.String, event: js.Object): js.Promise[keenDashTrackingLib.Anon_Created]
  def recordEvents(events: org.scalablytyped.runtime.StringDictionary[js.Array[js.Object]]): js.Promise[org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean]]]
}

object KeenTracking {
  @scala.inline
  def apply(
    recordEvent: (java.lang.String, js.Object) => js.Promise[keenDashTrackingLib.Anon_Created],
    recordEvents: org.scalablytyped.runtime.StringDictionary[js.Array[js.Object]] => js.Promise[org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean]]]
  ): KeenTracking = {
    val __obj = js.Dynamic.literal(recordEvent = js.Any.fromFunction2(recordEvent), recordEvents = js.Any.fromFunction1(recordEvents))
  
    __obj.asInstanceOf[KeenTracking]
  }
}

