package typings.ionic

import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/monitoring/syncmaps", JSImport.Namespace)
@js.native
object commandsMonitoringSyncmapsMod extends js.Object {
  @js.native
  class MonitoringSyncSourcemapsCommand () extends Command {
    def syncSourcemap(
      file: String,
      snapshotId: String,
      appVersion: String,
      commitHash: String,
      appflowId: String,
      token: String
    ): js.Promise[Unit] = js.native
    def uploadSourcemap(sourcemap: APIResponseSuccess, file: String): js.Promise[Unit] = js.native
  }
  
}

