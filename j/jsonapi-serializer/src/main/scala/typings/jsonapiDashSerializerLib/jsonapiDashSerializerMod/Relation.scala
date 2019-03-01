package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var included: js.UndefOr[scala.Boolean] = js.undefined
  var ref: java.lang.String | RefFunction
}

object Relation {
  @scala.inline
  def apply(
    ref: java.lang.String | RefFunction,
    attributes: js.Array[java.lang.String] = null,
    included: js.UndefOr[scala.Boolean] = js.undefined
  ): Relation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    __obj.asInstanceOf[Relation]
  }
}

