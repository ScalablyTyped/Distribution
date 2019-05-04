package typings
package atJupyterlabCellsLib.libWidgetMod.RawCellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a base cell widget.
  */
trait IOptions
  extends atJupyterlabCellsLib.libWidgetMod.CellNs.IOptions {
  /**
    * The model used by the cell.
    */
  @JSName("model")
  var model_IOptions: atJupyterlabCellsLib.libModelMod.IRawCellModel
}

object IOptions {
  @scala.inline
  def apply(
    model: atJupyterlabCellsLib.libModelMod.IRawCellModel,
    contentFactory: atJupyterlabCellsLib.libWidgetMod.CellNs.IContentFactory = null,
    editorConfig: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IConfig */ _
    ] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig)
    __obj.asInstanceOf[IOptions]
  }
}

