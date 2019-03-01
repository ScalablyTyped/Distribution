package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionEnumType
  extends IntrospectionInputType
     with IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val enumValues: js.Array[IntrospectionEnumValue]
  val kind: graphqlLib.graphqlLibStrings.ENUM
  val name: java.lang.String
}

object IntrospectionEnumType {
  @scala.inline
  def apply(
    enumValues: js.Array[IntrospectionEnumValue],
    kind: graphqlLib.graphqlLibStrings.ENUM,
    name: java.lang.String,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): IntrospectionEnumType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enumValues")(enumValues)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumType]
  }
}

