package typings.graphqlToolsUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mutation extends js.Object {
  var mutation: String | (GraphQLObjectType[_, _, StringDictionary[_]]) | Null
  var query: String | (GraphQLObjectType[_, _, StringDictionary[_]]) | Null
  var subscription: String | (GraphQLObjectType[_, _, StringDictionary[_]]) | Null
}

object Mutation {
  @scala.inline
  def apply(
    mutation: String | (GraphQLObjectType[_, _, StringDictionary[_]]) = null,
    query: String | (GraphQLObjectType[_, _, StringDictionary[_]]) = null,
    subscription: String | (GraphQLObjectType[_, _, StringDictionary[_]]) = null
  ): Mutation = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutation]
  }
}

