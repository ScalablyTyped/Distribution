package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IntrospectionField extends js.Object {
  val args: js.Array[IntrospectionInputValue]
  val deprecationReason: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val isDeprecated: scala.Boolean
  val name: java.lang.String
  val `type`: IntrospectionOutputTypeRef
}

