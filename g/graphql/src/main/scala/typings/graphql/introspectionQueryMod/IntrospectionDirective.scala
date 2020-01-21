package typings.graphql.introspectionQueryMod

import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import typings.graphql.maybeMod.Maybe
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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionDirective]
  }
}

