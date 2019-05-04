package typings
package atJupyterlabNotebookLib.libModelfactoryMod.NotebookModelFactoryNs

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
  var codeCellContentFactory: js.UndefOr[atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory] = js.undefined
  /**
    * The content factory used by the NotebookModelFactory.  If
    * given, it will supersede the `codeCellContentFactory`.
    */
  var contentFactory: js.UndefOr[atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    codeCellContentFactory: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory = null,
    contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (codeCellContentFactory != null) __obj.updateDynamic("codeCellContentFactory")(codeCellContentFactory)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    __obj.asInstanceOf[IOptions]
  }
}

