package typings.atJupyterlabDocumentsearchDashExtension

import typings.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.atJupyterlabDocumentsearch.libTokensMod.ISearchProviderRegistry
import typings.atPhosphorApplication.atPhosphorApplicationMod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch-extension", JSImport.Namespace)
@js.native
object atJupyterlabDocumentsearchDashExtensionMod extends js.Object {
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ISearchProviderRegistry | Unit]] = js.native
}

