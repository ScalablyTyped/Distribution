package typings.jupyterlabApplication.labMod.JupyterLab

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApplication.anon.Matches
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The information about a JupyterLab application.
  */
@js.native
trait IInfo extends js.Object {
  
  /**
    * The collection of deferred extension patterns and matched extensions.
    */
  val deferred: Matches = js.native
  
  /**
    * Whether the application is in dev mode.
    */
  val devMode: Boolean = js.native
  
  /**
    * The collection of disabled extension patterns and matched extensions.
    */
  val disabled: Matches = js.native
  
  /**
    * Whether files are cached on the server.
    */
  val filesCached: Boolean = js.native
  
  /**
    * The mime renderer extensions.
    */
  val mimeExtensions: js.Array[IExtensionModule] = js.native
}
/**
  * The layout restorer token.
  */
@JSImport("@jupyterlab/application/lib/lab", "JupyterLab.IInfo")
@js.native
object IInfo extends TopLevel[Token[IInfo]]
