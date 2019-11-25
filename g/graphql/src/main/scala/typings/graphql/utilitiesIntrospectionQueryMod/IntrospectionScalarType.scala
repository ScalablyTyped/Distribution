package typings.graphql.utilitiesIntrospectionQueryMod

import typings.graphql.graphqlStrings.SCALAR
import typings.graphql.tsutilsMaybeMod.Maybe
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
  def apply(kind: SCALAR, name: String, description: Maybe[String] = null): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionScalarType]
  }
}

