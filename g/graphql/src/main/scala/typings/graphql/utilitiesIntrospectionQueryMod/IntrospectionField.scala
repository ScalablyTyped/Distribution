package typings.graphql.utilitiesIntrospectionQueryMod

import typings.graphql.tsutilsMaybeMod.Maybe
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
    deprecationReason: Maybe[String] = null,
    description: Maybe[String] = null
  ): IntrospectionField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionField]
  }
}

