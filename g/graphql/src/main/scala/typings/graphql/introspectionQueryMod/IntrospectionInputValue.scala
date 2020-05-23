package typings.graphql.introspectionQueryMod

import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInputValue extends js.Object {
  val defaultValue: js.UndefOr[Maybe[String]] = js.undefined
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val name: String
  val `type`: IntrospectionInputTypeRef
}

object IntrospectionInputValue {
  @scala.inline
  def apply(
    name: String,
    `type`: IntrospectionInputTypeRef,
    defaultValue: js.UndefOr[Null | Maybe[String]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionInputValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputValue]
  }
}

