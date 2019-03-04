package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionEnumValue extends js.Object {
  val deprecationReason: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val isDeprecated: scala.Boolean
  val name: java.lang.String
}

object IntrospectionEnumValue {
  @scala.inline
  def apply(
    isDeprecated: scala.Boolean,
    name: java.lang.String,
    deprecationReason: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated, name = name)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumValue]
  }
}

