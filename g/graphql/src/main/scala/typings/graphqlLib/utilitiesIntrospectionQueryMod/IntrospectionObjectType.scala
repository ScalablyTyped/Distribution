package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionObjectType
  extends IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val fields: js.Array[IntrospectionField]
  val interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]]
  val kind: graphqlLib.graphqlLibStrings.OBJECT
  val name: java.lang.String
}

object IntrospectionObjectType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]],
    kind: graphqlLib.graphqlLibStrings.OBJECT,
    name: java.lang.String,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("interfaces")(interfaces)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionObjectType]
  }
}

