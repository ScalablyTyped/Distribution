package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SyncHost")
@js.native
class SyncHost ()
  extends grammarkdownLib.distHostMod.SyncHost {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: grammarkdownLib.distHostMod.SyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: java.lang.String): grammarkdownLib.distHostMod.SyncSingleFileHost = js.native
  def forFile(content: java.lang.String, file: java.lang.String): grammarkdownLib.distHostMod.SyncSingleFileHost = js.native
  def forFile(
    content: java.lang.String,
    file: java.lang.String,
    hostFallback: grammarkdownLib.distHostMod.SyncHost
  ): grammarkdownLib.distHostMod.SyncSingleFileHost = js.native
}

