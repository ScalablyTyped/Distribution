package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionDirective extends js.Object {
  val args: js.Array[IntrospectionInputValue]
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val locations: js.Array[graphqlLib.languageDirectiveLocationMod.DirectiveLocationEnum]
  val name: java.lang.String
}

object IntrospectionDirective {
  @scala.inline
  def apply(
    args: js.Array[IntrospectionInputValue],
    locations: js.Array[graphqlLib.languageDirectiveLocationMod.DirectiveLocationEnum],
    name: java.lang.String,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionDirective = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("locations")(locations)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionDirective]
  }
}

