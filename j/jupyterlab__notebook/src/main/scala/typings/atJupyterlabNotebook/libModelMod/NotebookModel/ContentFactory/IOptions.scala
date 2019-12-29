package typings.atJupyterlabNotebook.libModelMod.NotebookModel.ContentFactory

import typings.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `ContentFactory`.
  */
trait IOptions extends js.Object {
  /**
    * The factory for code cell model content.
    */
  var codeCellContentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * The modelDB in which to place new content.
    */
  var modelDB: js.UndefOr[IModelDB] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(codeCellContentFactory: IContentFactory = null, modelDB: IModelDB = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (codeCellContentFactory != null) __obj.updateDynamic("codeCellContentFactory")(codeCellContentFactory.asInstanceOf[js.Any])
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

