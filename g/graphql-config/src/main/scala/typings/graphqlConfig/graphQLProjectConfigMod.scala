package typings.graphqlConfig

import typings.graphql.mod.GraphQLSchema
import typings.graphqlConfig.extensionsMod.GraphQLEndpointsExtension
import typings.graphqlConfig.typesMod.GraphQLConfigData
import typings.graphqlConfig.typesMod.GraphQLConfigExtensions
import typings.graphqlConfig.typesMod.GraphQLResolvedConfigData
import typings.graphqlConfig.typesMod.IntrospectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/GraphQLProjectConfig", JSImport.Namespace)
@js.native
object graphQLProjectConfigMod extends js.Object {
  @js.native
  class GraphQLProjectConfig protected () extends js.Object {
    def this(config: GraphQLConfigData, configPath: String) = this()
    def this(config: GraphQLConfigData, configPath: String, projectName: String) = this()
    var config: GraphQLResolvedConfigData = js.native
    val configDir: String = js.native
    var configPath: String = js.native
    val endpointsExtension: GraphQLEndpointsExtension | Null = js.native
    val excludes: js.Array[String] = js.native
    val extensions: GraphQLConfigExtensions = js.native
    val includes: js.Array[String] = js.native
    var projectName: js.UndefOr[String] = js.native
    val schemaPath: String | Null = js.native
    def getSchema(): GraphQLSchema = js.native
    def getSchemaSDL(): String = js.native
    def includesFile(fileUri: String): Boolean = js.native
    def resolveConfigPath(relativePath: String): String = js.native
    def resolveIntrospection(): js.Promise[IntrospectionResult] = js.native
  }
  
}

