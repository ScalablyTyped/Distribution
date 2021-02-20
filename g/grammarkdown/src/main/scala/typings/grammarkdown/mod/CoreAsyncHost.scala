package typings.grammarkdown.mod

import typings.grammarkdown.hostMod.CoreAsyncHostOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "CoreAsyncHost")
@js.native
class CoreAsyncHost protected ()
  extends typings.grammarkdown.hostMod.CoreAsyncHost {
  /**
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(options: CoreAsyncHostOptions) = this()
  def this(options: CoreAsyncHostOptions, hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost) = this()
  def this(options: CoreAsyncHostOptions, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost) = this()
}
/* static members */
object CoreAsyncHost {
  
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(content: String): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost
  ): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost
  ): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(content: String, file: String): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  /**
    * Creates a {@link StringAsyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(content: js.Thenable[String]): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(
    content: js.Thenable[String],
    file: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost
  ): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(
    content: js.Thenable[String],
    file: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost
  ): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(content: js.Thenable[String], file: String): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(
    content: js.Thenable[String],
    file: String,
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost
  ): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.forFile")
  @js.native
  def forFile(
    content: js.Thenable[String],
    file: String,
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost
  ): typings.grammarkdown.hostMod.StringAsyncHost = js.native
  
  /**
    * Creates a `CoreAsyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  @JSImport("grammarkdown", "CoreAsyncHost.from")
  @js.native
  def from(custom: CoreAsyncHostOptions): typings.grammarkdown.hostMod.CoreAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.from")
  @js.native
  def from(custom: CoreAsyncHostOptions, hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost): typings.grammarkdown.hostMod.CoreAsyncHost = js.native
  @JSImport("grammarkdown", "CoreAsyncHost.from")
  @js.native
  def from(custom: CoreAsyncHostOptions, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): typings.grammarkdown.hostMod.CoreAsyncHost = js.native
}
