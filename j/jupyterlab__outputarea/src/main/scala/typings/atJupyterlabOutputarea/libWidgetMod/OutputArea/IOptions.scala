package typings.atJupyterlabOutputarea.libWidgetMod.OutputArea

import typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options to create an `OutputArea`.
  */
trait IOptions extends js.Object {
  /**
    * The content factory used by the widget to create children.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * The model used by the widget.
    */
  var model: IOutputAreaModel
  /**
    * The rendermime instance used by the widget.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(model: IOutputAreaModel, rendermime: IRenderMimeRegistry, contentFactory: IContentFactory = null): IOptions = {
    val __obj = js.Dynamic.literal(model = model, rendermime = rendermime)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    __obj.asInstanceOf[IOptions]
  }
}

