package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Model

import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * The mimetype of the model.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * An optional modelDB for storing model state.
    */
  var modelDB: js.UndefOr[IModelDB] = js.undefined
  /**
    * The initial value of the model.
    */
  var value: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(mimeType: String = null, modelDB: IModelDB = null, value: String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

