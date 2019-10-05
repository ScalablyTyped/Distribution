package typings.atJupyterlabCells.libModelMod.AttachmentsCellModel

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IBaseCell
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `AttachmentsCellModel`.
  */
trait IOptions
  extends typings.atJupyterlabCells.libModelMod.CellModel.IOptions {
  /**
    * The factory for attachment model creation.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    cell: IBaseCell = null,
    contentFactory: IContentFactory = null,
    id: String = null,
    modelDB: IModelDB = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB)
    __obj.asInstanceOf[IOptions]
  }
}

