package typings.graphqlToolsResolversComposition

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/resolvers-composition/resolvers-composition", JSImport.Namespace)
@js.native
object resolversCompositionMod extends js.Object {
  def composeResolvers[Resolvers /* <: Record[String, _] */](resolvers: Resolvers): Resolvers = js.native
  def composeResolvers[Resolvers /* <: Record[String, _] */](resolvers: Resolvers, mapping: ResolversComposerMapping[Resolvers]): Resolvers = js.native
  type ResolversComposerMapping[Resolvers /* <: Record[String, _] */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ TypeName in keyof Resolvers ]:? {[ FieldName in keyof Resolvers[TypeName] ]: Resolvers[TypeName][FieldName] extends graphql.graphql/type/definition.GraphQLFieldResolver<any, any, {[argName: string] : any}>? @graphql-tools/resolvers-composition.@graphql-tools/resolvers-composition/resolvers-composition.ResolversComposition<Resolvers[TypeName][FieldName]> | std.Array<@graphql-tools/resolvers-composition.@graphql-tools/resolvers-composition/resolvers-composition.ResolversComposition<Resolvers[TypeName][FieldName]>> : @graphql-tools/resolvers-composition.@graphql-tools/resolvers-composition/resolvers-composition.ResolversComposition<graphql.graphql/type/definition.GraphQLFieldResolver<any, any, {[argName: string] : any}>> | std.Array<@graphql-tools/resolvers-composition.@graphql-tools/resolvers-composition/resolvers-composition.ResolversComposition<graphql.graphql/type/definition.GraphQLFieldResolver<any, any, {[argName: string] : any}>>>}}
    */ typings.graphqlToolsResolversComposition.graphqlToolsResolversCompositionStrings.ResolversComposerMapping with TopLevel[js.Any]) | (StringDictionary[
    (ResolversComposition[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]) | (js.Array[
      ResolversComposition[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]
    ])
  ])
  type ResolversComposition[Resolver /* <: GraphQLFieldResolver[_, _, StringDictionary[_]] */] = js.Function1[/* next */ Resolver, Resolver]
}

