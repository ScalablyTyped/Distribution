package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var objectType: (graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | graphqlLib.graphqlMod.GraphQLInterfaceType
}

object Anon_Key {
  @scala.inline
  def apply(
    objectType: (graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | graphqlLib.graphqlMod.GraphQLInterfaceType
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

