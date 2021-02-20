package typings.jupyterlabDocumentsearchExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/documentsearch-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[ISearchProviderRegistry | Unit]] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[ISearchProviderRegistry | Unit]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[ISearchProviderRegistry | Unit]] = default
}
