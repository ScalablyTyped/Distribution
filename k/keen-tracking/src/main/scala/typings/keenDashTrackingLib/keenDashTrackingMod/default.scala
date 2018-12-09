package typings
package keenDashTrackingLib.keenDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keen-tracking", JSImport.Default)
@js.native
class default protected () extends KeenTracking {
  def this(options: keenDashTrackingLib.Anon_WriteKey) = this()
  /* CompleteClass */
  override def recordEvent(collectionName: java.lang.String, event: js.Object): js.Promise[keenDashTrackingLib.Anon_Created] = js.native
  /* CompleteClass */
  override def recordEvents(events: ScalablyTyped.runtime.StringDictionary[js.Array[js.Object]]): js.Promise[ScalablyTyped.runtime.StringDictionary[js.Array[scala.Boolean]]] = js.native
}

