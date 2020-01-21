package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a list of strings.
  */
@js.native
trait SchemaStringList extends js.Object {
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[String]] = js.native
}

object SchemaStringList {
  @scala.inline
  def apply(elements: js.Array[String] = null): SchemaStringList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStringList]
  }
}

