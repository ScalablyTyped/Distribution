package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInputObjectType
  extends IntrospectionInputType
     with IntrospectionType {
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val inputFields: js.Array[IntrospectionInputValue]
  val kind: graphqlLib.graphqlLibStrings.INPUT_OBJECT
  val name: java.lang.String
}

object IntrospectionInputObjectType {
  @scala.inline
  def apply(
    inputFields: js.Array[IntrospectionInputValue],
    kind: graphqlLib.graphqlLibStrings.INPUT_OBJECT,
    name: java.lang.String,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields, kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputObjectType]
  }
}

