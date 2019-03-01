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
    recordEvent: js.Function2[java.lang.String, js.Object, js.Promise[keenDashTrackingLib.Anon_Created]],
    recordEvents: js.Function1[
      org.scalablytyped.runtime.StringDictionary[js.Array[js.Object]], 
      js.Promise[org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean]]]
    ]
  ): KeenTracking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recordEvent")(recordEvent)
    __obj.updateDynamic("recordEvents")(recordEvents)
    __obj.asInstanceOf[KeenTracking]
  }
}

