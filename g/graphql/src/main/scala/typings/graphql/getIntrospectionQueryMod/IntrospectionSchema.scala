package typings.graphql.getIntrospectionQueryMod

import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionSchema extends js.Object {
  val directives: js.Array[IntrospectionDirective] = js.native
  val mutationType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]] = js.native
  val queryType: IntrospectionNamedTypeRef[IntrospectionObjectType] = js.native
  val subscriptionType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]] = js.native
  val types: js.Array[IntrospectionType] = js.native
}

object IntrospectionSchema {
  @scala.inline
  def apply(
    directives: js.Array[IntrospectionDirective],
    queryType: IntrospectionNamedTypeRef[IntrospectionObjectType],
    types: js.Array[IntrospectionType]
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionSchema]
  }
  @scala.inline
  implicit class IntrospectionSchemaOps[Self <: IntrospectionSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectivesVarargs(value: IntrospectionDirective*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[IntrospectionDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryType(value: IntrospectionNamedTypeRef[IntrospectionObjectType]): Self = this.set("queryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: IntrospectionType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[IntrospectionType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutationType(value: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]): Self = this.set("mutationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutationType: Self = this.set("mutationType", js.undefined)
    @scala.inline
    def setMutationTypeNull: Self = this.set("mutationType", null)
    @scala.inline
    def setSubscriptionType(value: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]): Self = this.set("subscriptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionType: Self = this.set("subscriptionType", js.undefined)
    @scala.inline
    def setSubscriptionTypeNull: Self = this.set("subscriptionType", null)
  }
  
}

