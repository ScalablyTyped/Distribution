package typings.graphql.utilitiesIntrospectionQueryMod

import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionSchema extends js.Object {
  val directives: js.Array[IntrospectionDirective]
  val mutationType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  val queryType: IntrospectionNamedTypeRef[IntrospectionObjectType]
  val subscriptionType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  val types: js.Array[IntrospectionType]
}

object IntrospectionSchema {
  @scala.inline
  def apply(
    directives: js.Array[IntrospectionDirective],
    mutationType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    queryType: IntrospectionNamedTypeRef[IntrospectionObjectType],
    subscriptionType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]],
    types: js.Array[IntrospectionType]
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives, mutationType = mutationType.asInstanceOf[js.Any], queryType = queryType, subscriptionType = subscriptionType.asInstanceOf[js.Any], types = types)
  
    __obj.asInstanceOf[IntrospectionSchema]
  }
}

