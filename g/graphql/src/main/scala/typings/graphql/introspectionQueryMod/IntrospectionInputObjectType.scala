package typings.graphql.introspectionQueryMod

import typings.graphql.graphqlStrings.INPUT_OBJECT
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInputObjectType
  extends IntrospectionInputType
     with IntrospectionType {
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val inputFields: js.Array[IntrospectionInputValue]
  val kind: INPUT_OBJECT
  val name: String
}

object IntrospectionInputObjectType {
  @scala.inline
  def apply(
    inputFields: js.Array[IntrospectionInputValue],
    kind: INPUT_OBJECT,
    name: String,
    description: Maybe[String] = null
  ): IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputObjectType]
  }
}

