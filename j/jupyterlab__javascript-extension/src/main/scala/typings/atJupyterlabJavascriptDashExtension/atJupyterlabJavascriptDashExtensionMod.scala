package typings.atJupyterlabJavascriptDashExtension

import typings.atJupyterlabJavascriptDashExtension.atJupyterlabJavascriptDashExtensionStrings.applicationSlashjavascript
import typings.atJupyterlabJavascriptDashExtension.atJupyterlabJavascriptDashExtensionStrings.textSlashjavascript
import typings.atJupyterlabRendermime.atJupyterlabRendermimeMod.RenderedJavaScript
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtension
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/javascript-extension", JSImport.Namespace)
@js.native
object atJupyterlabJavascriptDashExtensionMod extends js.Object {
  @js.native
  class ExperimentalRenderedJavascript () extends RenderedJavaScript
  
  val APPLICATION_JAVASCRIPT_MIMETYPE: applicationSlashjavascript = js.native
  val TEXT_JAVASCRIPT_MIMETYPE: textSlashjavascript = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

