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

object IntrospectionSchema {
  @scala.inline
  def apply(
    directives: js.Array[IntrospectionDirective],
    mutationType: graphqlLib.tsutilsMaybeMod.Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    queryType: IntrospectionNamedTypeRef[IntrospectionObjectType],
    subscriptionType: graphqlLib.tsutilsMaybeMod.Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    types: js.Array[IntrospectionType]
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives, mutationType = mutationType.asInstanceOf[js.Any], queryType = queryType, subscriptionType = subscriptionType.asInstanceOf[js.Any], types = types)
  
    __obj.asInstanceOf[IntrospectionSchema]
  }
}

