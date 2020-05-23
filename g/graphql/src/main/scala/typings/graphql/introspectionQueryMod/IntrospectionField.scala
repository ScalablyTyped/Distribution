package typings.graphql.introspectionQueryMod

import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionField extends js.Object {
  val args: js.Array[IntrospectionInputValue]
  val deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val isDeprecated: Boolean
  val name: String
  val `type`: IntrospectionOutputTypeRef
}

object IntrospectionField {
  @scala.inline
  def apply(
    args: js.Array[IntrospectionInputValue],
    isDeprecated: Boolean,
    name: String,
    `type`: IntrospectionOutputTypeRef,
    deprecationReason: js.UndefOr[Null | Maybe[String]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecationReason)) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionField]
  }
}

