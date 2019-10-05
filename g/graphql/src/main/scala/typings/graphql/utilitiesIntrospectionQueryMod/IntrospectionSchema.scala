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
    queryType: IntrospectionNamedTypeRef[IntrospectionObjectType],
    types: js.Array[IntrospectionType],
    mutationType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]] = null,
    subscriptionType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]] = null
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives, queryType = queryType, types = types)
    if (mutationType != null) __obj.updateDynamic("mutationType")(mutationType.asInstanceOf[js.Any])
    if (subscriptionType != null) __obj.updateDynamic("subscriptionType")(subscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionSchema]
  }
}

