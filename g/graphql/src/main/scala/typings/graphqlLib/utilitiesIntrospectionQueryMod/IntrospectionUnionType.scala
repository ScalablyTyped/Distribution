package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionUnionType
  extends IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val kind: graphqlLib.graphqlLibStrings.UNION
  val name: java.lang.String
  val possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]]
}

object IntrospectionUnionType {
  @scala.inline
  def apply(
    kind: graphqlLib.graphqlLibStrings.UNION,
    name: java.lang.String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, possibleTypes = possibleTypes)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionUnionType]
  }
}

