package typings.graphql.introspectionQueryMod

import typings.graphql.graphqlStrings.SCALAR
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionScalarType
  extends IntrospectionInputType
     with IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val kind: SCALAR
  val name: String
}

object IntrospectionScalarType {
  @scala.inline
  def apply(kind: SCALAR, name: String, description: js.UndefOr[Null | Maybe[String]] = js.undefined): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionScalarType]
  }
}

