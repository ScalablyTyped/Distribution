package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Duplicates the contents of a sheet.
  */
@js.native
trait SchemaDuplicateSheetRequest extends js.Object {
  /**
    * The zero-based index where the new sheet should be inserted. The index of
    * all sheets after this are incremented.
    */
  var insertSheetIndex: js.UndefOr[Double] = js.native
  /**
    * If set, the ID of the new sheet. If not set, an ID is chosen. If set, the
    * ID must not conflict with any existing sheet ID. If set, it must be
    * non-negative.
    */
  var newSheetId: js.UndefOr[Double] = js.native
  /**
    * The name of the new sheet.  If empty, a new name is chosen for you.
    */
  var newSheetName: js.UndefOr[String] = js.native
  /**
    * The sheet to duplicate.
    */
  var sourceSheetId: js.UndefOr[Double] = js.native
}

object SchemaDuplicateSheetRequest {
  @scala.inline
  def apply(
    insertSheetIndex: js.UndefOr[Double] = js.undefined,
    newSheetId: js.UndefOr[Double] = js.undefined,
    newSheetName: String = null,
    sourceSheetId: js.UndefOr[Double] = js.undefined
  ): SchemaDuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertSheetIndex)) __obj.updateDynamic("insertSheetIndex")(insertSheetIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newSheetId)) __obj.updateDynamic("newSheetId")(newSheetId.get.asInstanceOf[js.Any])
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceSheetId)) __obj.updateDynamic("sourceSheetId")(sourceSheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDuplicateSheetRequest]
  }
}

