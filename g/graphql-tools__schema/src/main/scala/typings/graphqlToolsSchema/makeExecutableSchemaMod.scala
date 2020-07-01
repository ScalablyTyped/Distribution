package typings.graphqlToolsSchema

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsSchema.typesMod.IExecutableSchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/makeExecutableSchema", JSImport.Namespace)
@js.native
object makeExecutableSchemaMod extends js.Object {
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesSchemaTransformsParseOptionsInheritResolversFromInterfacesPruningOptions: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}

