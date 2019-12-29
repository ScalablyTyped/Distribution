package typings.atJupyterlabNotebook.libModelfactoryMod.NotebookModelFactory

import typings.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a NotebookModelFactory.
  */
trait IOptions extends js.Object {
  /**
    * The factory for code cell content.
    */
  var codeCellContentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * The content factory used by the NotebookModelFactory.  If
    * given, it will supersede the `codeCellContentFactory`.
    */
  var contentFactory: js.UndefOr[typings.atJupyterlabNotebook.libModelMod.NotebookModel.IContentFactory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    codeCellContentFactory: IContentFactory = null,
    contentFactory: typings.atJupyterlabNotebook.libModelMod.NotebookModel.IContentFactory = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (codeCellContentFactory != null) __obj.updateDynamic("codeCellContentFactory")(codeCellContentFactory.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

