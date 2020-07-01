package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDiskTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of disk types contained in this scope.
    */
  var diskTypes: js.UndefOr[js.Array[SchemaDiskType]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of disk types
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaDiskTypesScopedList {
  @scala.inline
  def apply(diskTypes: js.Array[SchemaDiskType] = null, warning: Code = null): SchemaDiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (diskTypes != null) __obj.updateDynamic("diskTypes")(diskTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiskTypesScopedList]
  }
}

