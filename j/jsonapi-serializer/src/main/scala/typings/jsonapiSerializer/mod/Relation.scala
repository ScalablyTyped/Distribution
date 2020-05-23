package typings.jsonapiSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  var included: js.UndefOr[Boolean] = js.undefined
  var ref: String | RefFunction
}

object Relation {
  @scala.inline
  def apply(
    ref: String | RefFunction,
    attributes: js.Array[String] = null,
    included: js.UndefOr[Boolean] = js.undefined
  ): Relation = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relation]
  }
}

