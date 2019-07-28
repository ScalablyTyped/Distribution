package typings.atJupyterlabCells.libModelMod.CellModelNs

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IBaseCell
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `CellModel`.
  */
trait IOptions extends js.Object {
  /**
    * The source cell data.
    */
  var cell: js.UndefOr[IBaseCell] = js.undefined
  /**
    * A unique identifier for this cell.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * An IModelDB in which to store cell data.
    */
  var modelDB: js.UndefOr[IModelDB] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(cell: IBaseCell = null, id: String = null, modelDB: IModelDB = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB)
    __obj.asInstanceOf[IOptions]
  }
}

