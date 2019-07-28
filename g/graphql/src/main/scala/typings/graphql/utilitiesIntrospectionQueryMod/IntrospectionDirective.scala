package typings.graphql.utilitiesIntrospectionQueryMod

import typings.graphql.languageDirectiveLocationMod.DirectiveLocationEnum
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionDirective extends js.Object {
  val args: js.Array[IntrospectionInputValue]
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val locations: js.Array[DirectiveLocationEnum]
  val name: String
}

object IntrospectionDirective {
  @scala.inline
  def apply(
    args: js.Array[IntrospectionInputValue],
    locations: js.Array[DirectiveLocationEnum],
    name: String,
    description: Maybe[String] = null
  ): IntrospectionDirective = {
    val __obj = js.Dynamic.literal(args = args, locations = locations, name = name)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionDirective]
  }
}

