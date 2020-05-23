package typings.graphql.introspectionQueryMod

import typings.graphql.graphqlStrings.UNION
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionUnionType
  extends IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val kind: UNION
  val name: String
  val possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]]
}

object IntrospectionUnionType {
  @scala.inline
  def apply(
    kind: UNION,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    description: js.UndefOr[Null | Maybe[String]] = js.undefined
  ): IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionUnionType]
  }
}

