package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInterfaceType
  extends IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val fields: js.Array[IntrospectionField]
  val kind: graphqlLib.graphqlLibStrings.INTERFACE
  val name: java.lang.String
  val possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]]
}

object IntrospectionInterfaceType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    kind: graphqlLib.graphqlLibStrings.INTERFACE,
    name: java.lang.String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields, kind = kind, name = name, possibleTypes = possibleTypes)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInterfaceType]
  }
}

