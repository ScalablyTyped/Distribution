package typings.jupyterlabJavascriptExtension

import typings.jupyterlabJavascriptExtension.jupyterlabJavascriptExtensionStrings.applicationSlashjavascript
import typings.jupyterlabJavascriptExtension.jupyterlabJavascriptExtensionStrings.textSlashjavascript
import typings.jupyterlabRendermime.mod.RenderedJavaScript
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/javascript-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ExperimentalRenderedJavascript () extends RenderedJavaScript
  
  val APPLICATION_JAVASCRIPT_MIMETYPE: applicationSlashjavascript = js.native
  val TEXT_JAVASCRIPT_MIMETYPE: textSlashjavascript = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

