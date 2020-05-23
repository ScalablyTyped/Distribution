package typings.graphql.introspectionQueryMod

import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionEnumValue extends js.Object {
  val deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val isDeprecated: Boolean
  val name: String
}

object IntrospectionEnumValue {
  @scala.inline
  def apply(
    isDeprecated: Boolean,
    name: String,
    deprecationReason: js.UndefOr[Null | Maybe[String]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecationReason)) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumValue]
  }
}

