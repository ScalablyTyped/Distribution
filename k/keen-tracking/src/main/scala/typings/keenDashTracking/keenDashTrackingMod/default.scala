package typings.keenDashTracking.keenDashTrackingMod

import org.scalablytyped.runtime.StringDictionary
import typings.keenDashTracking.Anon_Created
import typings.keenDashTracking.Anon_ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keen-tracking", JSImport.Default)
@js.native
class default protected () extends KeenTracking {
  def this(options: Anon_ProjectId) = this()
  /* CompleteClass */
  override def recordEvent(collectionName: String, event: js.Object): js.Promise[Anon_Created] = js.native
  /* CompleteClass */
  override def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]] = js.native
}

