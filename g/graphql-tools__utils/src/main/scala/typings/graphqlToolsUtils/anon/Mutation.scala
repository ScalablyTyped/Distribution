package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mutation extends js.Object {
  var mutation: String | (GraphQLObjectType[_, _]) | Null = js.native
  var query: String | (GraphQLObjectType[_, _]) | Null = js.native
  var subscription: String | (GraphQLObjectType[_, _]) | Null = js.native
}

object Mutation {
  @scala.inline
  def apply(): Mutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mutation]
  }
  @scala.inline
  implicit class MutationOps[Self <: Mutation] (val x: Self) extends AnyVal {
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
    def setMutation(value: String | (GraphQLObjectType[_, _])): Self = this.set("mutation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutationNull: Self = this.set("mutation", null)
    @scala.inline
    def setQuery(value: String | (GraphQLObjectType[_, _])): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setSubscription(value: String | (GraphQLObjectType[_, _])): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionNull: Self = this.set("subscription", null)
  }
  
}

