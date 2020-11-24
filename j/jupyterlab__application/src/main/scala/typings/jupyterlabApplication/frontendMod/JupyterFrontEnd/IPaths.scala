package typings.jupyterlabApplication.frontendMod.JupyterFrontEnd

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApplication.anon.App
import typings.jupyterlabApplication.anon.AppSettings
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for URL and directory paths used by a Jupyter front-end.
  */
@js.native
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
  val directories: AppSettings = js.native
  
  /**
    * The urls used by the application.
    */
  val urls: App = js.native
}
/**
  * The application paths dictionary token.
  */
@JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd.IPaths")
@js.native
object IPaths extends TopLevel[Token[IPaths]]
