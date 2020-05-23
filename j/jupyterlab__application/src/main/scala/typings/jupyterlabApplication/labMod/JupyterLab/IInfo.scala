package typings.jupyterlabApplication.labMod.JupyterLab

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApplication.anon.Matches
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information about a JupyterLab application.
  */
trait IInfo extends js.Object {
  /**
    * The collection of deferred extension patterns and matched extensions.
    */
  val deferred: Matches
  /**
    * Whether the application is in dev mode.
    */
  val devMode: Boolean
  /**
    * The collection of disabled extension patterns and matched extensions.
    */
  val disabled: Matches
  /**
    * Whether files are cached on the server.
    */
  val filesCached: Boolean
  /**
    * The mime renderer extensions.
    */
  val mimeExtensions: js.Array[IExtensionModule]
}

/**
  * The layout restorer token.
  */
@JSImport("@jupyterlab/application/lib/lab", "JupyterLab.IInfo")
@js.native
object IInfo extends TopLevel[Token[IInfo]]

