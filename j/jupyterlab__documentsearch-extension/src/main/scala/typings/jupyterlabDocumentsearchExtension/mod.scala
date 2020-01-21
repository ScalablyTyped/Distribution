package typings.jupyterlabDocumentsearchExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry
import typings.phosphorApplication.mod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ISearchProviderRegistry | Unit]] = js.native
}

