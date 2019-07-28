package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType
}

object Anon_Key {
  @scala.inline
  def apply(objectType: (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLInterfaceType): Anon_Key = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key]
  }
}

