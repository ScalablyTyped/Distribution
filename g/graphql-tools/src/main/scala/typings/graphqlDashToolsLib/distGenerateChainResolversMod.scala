package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/chainResolvers", JSImport.Namespace)
@js.native
object distGenerateChainResolversMod extends js.Object {
  def chainResolvers(
    resolvers: js.Array[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ): js.Function4[
    /* root */ js.Any, 
    /* args */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    /* ctx */ js.Any, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    _
  ] = js.native
}

