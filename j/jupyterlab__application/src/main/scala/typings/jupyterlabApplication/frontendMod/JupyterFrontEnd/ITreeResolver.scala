package typings.jupyterlabApplication.frontendMod.JupyterFrontEnd

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApplication.anon.Browser
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver.Paths
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a front-end tree route resolver.
  */
trait ITreeResolver extends js.Object {
  /**
    * A promise that resolves to the routed tree paths or null.
    */
  val paths: js.Promise[Paths]
}

/**
  * A namespace for tree resolver types.
  */
@JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd.ITreeResolver")
@js.native
object ITreeResolver extends TopLevel[Token[ITreeResolver]] {
  /**
    * The browser and file paths if the tree resolver encountered and handled
    * a tree URL or `null` if not. Empty string paths should be ignored.
    */
  type Paths = Browser | Null
}

