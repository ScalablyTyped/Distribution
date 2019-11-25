package typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer

import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MarkdownViewer.
  */
trait IOptions extends js.Object {
  /**
    * Context
    */
  var context: IContext[IModel]
  /**
    * The renderer instance.
    */
  var renderer: IRenderer
}

object IOptions {
  @scala.inline
  def apply(context: IContext[IModel], renderer: IRenderer): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

