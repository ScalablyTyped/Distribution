package typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabApplication.Anon_App
import typings.atJupyterlabApplication.Anon_AppSettings
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for URL and directory paths used by a Jupyter front-end.
  */
trait IPaths extends js.Object {
  /**
    * The server directories used by the application, for user information
    * only.
    *
    * #### Notes
    * These are for user information and user interface hints only and should
    * not be relied on in code. A server may set these to empty strings if it
    * does not want to expose this information.
    *
    * Examples of appropriate use include displaying a help dialog for a user
    * listing the paths, or a tooltip in a filebrowser displaying the server
    * root. Examples of inapproriate use include using one of these paths in a
    * terminal command, generating code using these paths, or using one of
    * these paths in a request to the server (it would be better to write a
    * server extension to handle these cases).
    */
  val directories: Anon_AppSettings
  /**
    * The urls used by the application.
    */
  val urls: Anon_App
}

/**
  * The application paths dictionary token.
  */
@JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd.IPaths")
@js.native
object IPaths extends TopLevel[Token[IPaths]]

