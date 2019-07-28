package typings.graphql.utilitiesIntrospectionQueryMod

import typings.graphql.graphqlStrings.UNION
import typings.graphql.tsutilsMaybeMod.Maybe
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
    description: Maybe[String] = null
  ): IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, possibleTypes = possibleTypes)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionUnionType]
  }
}

