package typings.grammarkdown.mod

import typings.grammarkdown.hostMod.CoreSyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "CoreSyncHost")
@js.native
class CoreSyncHost protected ()
  extends typings.grammarkdown.hostMod.CoreSyncHost {
  /**
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(options: CoreSyncHostOptions) = this()
  def this(options: CoreSyncHostOptions, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost) = this()
}
/* static members */
@JSImport("grammarkdown", "CoreSyncHost")
@js.native
object CoreSyncHost extends js.Object {
  
  /**
    * Creates a {@link StringSyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def forFile(content: String): typings.grammarkdown.hostMod.StringSyncHost = js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost
  ): typings.grammarkdown.hostMod.StringSyncHost = js.native
  def forFile(content: String, file: String): typings.grammarkdown.hostMod.StringSyncHost = js.native
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): typings.grammarkdown.hostMod.StringSyncHost = js.native
  
  /**
    * Creates a `CoreSyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def from(options: CoreSyncHostOptions): typings.grammarkdown.hostMod.CoreSyncHost = js.native
  def from(options: CoreSyncHostOptions, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): typings.grammarkdown.hostMod.CoreSyncHost = js.native
}
