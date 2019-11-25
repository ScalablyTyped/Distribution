package typings.knockoutDotMapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Copy extends js.Object {
  var copy: js.UndefOr[js.Array[String]] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
  var parentName: js.UndefOr[String] = js.undefined
  var visitedObjects: js.UndefOr[js.Any] = js.undefined
}

object Anon_Copy {
  @scala.inline
  def apply(
    copy: js.Array[String] = null,
    ignore: js.Array[String] = null,
    include: js.Array[String] = null,
    parentName: String = null,
    visitedObjects: js.Any = null
  ): Anon_Copy = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (parentName != null) __obj.updateDynamic("parentName")(parentName.asInstanceOf[js.Any])
    if (visitedObjects != null) __obj.updateDynamic("visitedObjects")(visitedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Copy]
  }
}

