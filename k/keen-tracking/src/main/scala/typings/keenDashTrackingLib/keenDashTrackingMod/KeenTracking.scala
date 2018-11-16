package typings
package keenDashTrackingLib.keenDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeenTracking extends js.Object {
  def recordEvent(collectionName: java.lang.String, event: js.Object): stdLib.Promise[keenDashTrackingLib.Anon_Created]
  def recordEvents(events: ScalablyTyped.runtime.StringDictionary[js.Array[js.Object]]): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[js.Array[scala.Boolean]]]
}

