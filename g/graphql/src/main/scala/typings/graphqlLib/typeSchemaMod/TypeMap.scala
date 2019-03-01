package typings
package graphqlLib.typeSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[graphqlLib.typeDefinitionMod.GraphQLNamedType]

object TypeMap {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[graphqlLib.typeDefinitionMod.GraphQLNamedType] = null
  ): TypeMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TypeMap]
  }
}

