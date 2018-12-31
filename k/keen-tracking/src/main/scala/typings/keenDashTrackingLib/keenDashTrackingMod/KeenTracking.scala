package typings
package keenDashTrackingLib.keenDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeenTracking extends js.Object {
  def recordEvent(collectionName: java.lang.String, event: js.Object): js.Promise[keenDashTrackingLib.Anon_Created]
  def recordEvents(events: org.scalablytyped.runtime.StringDictionary[js.Array[js.Object]]): js.Promise[org.scalablytyped.runtime.StringDictionary[js.Array[scala.Boolean]]]
}

