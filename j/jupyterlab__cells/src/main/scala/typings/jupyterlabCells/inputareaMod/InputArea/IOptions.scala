package typings.jupyterlabCells.inputareaMod.InputArea

import typings.jupyterlabCells.modelMod.ICellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an `InputArea`.
  */
trait IOptions extends js.Object {
  /**
    * The content factory used by the widget to create children.
    *
    * Defaults to one that uses CodeMirror.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * The model used by the widget.
    */
  var model: ICellModel
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateOnShow: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    model: ICellModel,
    contentFactory: IContentFactory = null,
    updateOnShow: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnShow)) __obj.updateDynamic("updateOnShow")(updateOnShow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

