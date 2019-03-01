package typings
package knockoutDotMappingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Copy extends js.Object {
  var copy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var parentName: js.UndefOr[java.lang.String] = js.undefined
  var visitedObjects: js.UndefOr[js.Any] = js.undefined
}

object Anon_Copy {
  @scala.inline
  def apply(
    copy: js.Array[java.lang.String] = null,
    ignore: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    parentName: java.lang.String = null,
    visitedObjects: js.Any = null
  ): Anon_Copy = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (include != null) __obj.updateDynamic("include")(include)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    if (visitedObjects != null) __obj.updateDynamic("visitedObjects")(visitedObjects)
    __obj.asInstanceOf[Anon_Copy]
  }
}

