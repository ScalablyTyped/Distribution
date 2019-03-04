package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionField extends js.Object {
  val args: js.Array[IntrospectionInputValue]
  val deprecationReason: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val isDeprecated: scala.Boolean
  val name: java.lang.String
  val `type`: IntrospectionOutputTypeRef
}

object IntrospectionField {
  @scala.inline
  def apply(
    args: js.Array[IntrospectionInputValue],
    isDeprecated: scala.Boolean,
    name: java.lang.String,
    `type`: IntrospectionOutputTypeRef,
    deprecationReason: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionField = {
    val __obj = js.Dynamic.literal(args = args, isDeprecated = isDeprecated, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionField]
  }
}

