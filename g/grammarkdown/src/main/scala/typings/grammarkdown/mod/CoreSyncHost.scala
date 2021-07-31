package typings.grammarkdown.mod

import typings.grammarkdown.hostMod.CoreSyncHostOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object CoreSyncHost {
  
  @JSImport("grammarkdown", "CoreSyncHost")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a {@link StringSyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  @scala.inline
  def forFile(content: String): typings.grammarkdown.hostMod.StringSyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.hostMod.StringSyncHost]
  @scala.inline
  def forFile(content: String, file: String): typings.grammarkdown.hostMod.StringSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.hostMod.StringSyncHost]
  @scala.inline
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): typings.grammarkdown.hostMod.StringSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.hostMod.StringSyncHost]
  @scala.inline
  def forFile(content: String, file: Unit, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): typings.grammarkdown.hostMod.StringSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.hostMod.StringSyncHost]
  
  /**
    * Creates a `CoreSyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  @scala.inline
  def from(options: CoreSyncHostOptions): typings.grammarkdown.hostMod.CoreSyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(options.asInstanceOf[js.Any]).asInstanceOf[typings.grammarkdown.hostMod.CoreSyncHost]
  @scala.inline
  def from(options: CoreSyncHostOptions, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): typings.grammarkdown.hostMod.CoreSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typings.grammarkdown.hostMod.CoreSyncHost]
}
