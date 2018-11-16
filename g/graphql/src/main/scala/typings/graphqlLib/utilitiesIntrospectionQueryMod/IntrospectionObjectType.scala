package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IntrospectionObjectType extends js.Object {
  val description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  val fields: js.Array[IntrospectionField]
  val interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]]
  val kind: graphqlLib.graphqlLibStrings.OBJECT
  val name: java.lang.String
}

