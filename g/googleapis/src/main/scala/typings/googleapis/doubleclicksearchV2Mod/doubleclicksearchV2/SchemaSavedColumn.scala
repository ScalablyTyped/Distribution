package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A saved column
  */
@js.native
trait SchemaSavedColumn extends js.Object {
  /**
    * Identifies this as a SavedColumn resource. Value: the fixed string
    * doubleclicksearch#savedColumn.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the saved column.
    */
  var savedColumnName: js.UndefOr[String] = js.native
  /**
    * The type of data this saved column will produce.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaSavedColumn {
  @scala.inline
  def apply(kind: String = null, savedColumnName: String = null, `type`: String = null): SchemaSavedColumn = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (savedColumnName != null) __obj.updateDynamic("savedColumnName")(savedColumnName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSavedColumn]
  }
}

