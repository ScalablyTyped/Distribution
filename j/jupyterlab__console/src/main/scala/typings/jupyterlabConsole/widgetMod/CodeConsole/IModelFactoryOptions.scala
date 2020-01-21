package typings.jupyterlabConsole.widgetMod.CodeConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `ModelFactory`.
  */
trait IModelFactoryOptions extends js.Object {
  /**
    * The factory for output area models.
    */
  var codeCellContentFactory: js.UndefOr[typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory] = js.undefined
}

object IModelFactoryOptions {
  @scala.inline
  def apply(codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = null): IModelFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (codeCellContentFactory != null) __obj.updateDynamic("codeCellContentFactory")(codeCellContentFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelFactoryOptions]
  }
}

