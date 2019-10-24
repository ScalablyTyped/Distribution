package typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer

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
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<DocumentRegistry.IModel> */ js.Any
  /**
    * The renderer instance.
    */
  var renderer: IRenderer
}

object IOptions {
  @scala.inline
  def apply(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<DocumentRegistry.IModel> */ js.Any,
    renderer: IRenderer
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context, renderer = renderer)
  
    __obj.asInstanceOf[IOptions]
  }
}

