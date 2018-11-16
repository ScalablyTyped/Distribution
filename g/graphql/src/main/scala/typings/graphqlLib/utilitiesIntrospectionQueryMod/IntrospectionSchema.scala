package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IntrospectionSchema extends js.Object {
  val directives: js.Array[IntrospectionDirective]
  val mutationType: graphqlLib.tsutilsMaybeMod.Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  val queryType: IntrospectionNamedTypeRef[IntrospectionObjectType]
  val subscriptionType: graphqlLib.tsutilsMaybeMod.Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  val types: js.Array[IntrospectionType]
}

