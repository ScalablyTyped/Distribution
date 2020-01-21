package typings.jupyterlabOutputarea.widgetMod.OutputArea

import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
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
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

