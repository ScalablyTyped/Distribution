package typings.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLSchema
import typings.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointConfig
import typings.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointsMapData
import typings.graphqlConfig.graphqlConfigStrings.Dotgraphqlconfig
import typings.graphqlConfig.graphqlConfigStrings.DotgraphqlconfigDotyaml
import typings.graphqlConfig.typesMod.GraphQLConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ConfigNotFoundError protected ()
    extends typings.graphqlConfig.errorsMod.ConfigNotFoundError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLConfig protected ()
    extends typings.graphqlConfig.graphQLConfigMod.GraphQLConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLEndpoint protected ()
    extends typings.graphqlConfig.extensionsMod.GraphQLEndpoint {
    def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  }
  
  @js.native
  class GraphQLEndpointsExtension protected ()
    extends typings.graphqlConfig.extensionsMod.GraphQLEndpointsExtension {
    def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLProjectConfig protected ()
    extends typings.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
    def this(config: GraphQLConfigData, configPath: String, projectName: String) = this()
  }
  
  val GRAPHQL_CONFIG_NAME: Dotgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: DotgraphqlconfigDotyaml = js.native
  def findGraphQLConfigFile(filePath: String): String = js.native
  def getGraphQLConfig(): typings.graphqlConfig.graphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLConfig(rootDir: String): typings.graphqlConfig.graphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLProjectConfig(): typings.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String): typings.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String, projectName: String): typings.graphqlConfig.graphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getSchemaExtensions(path: String): StringDictionary[String] = js.native
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
  def validateConfig(config: GraphQLConfigData): Unit = js.native
  def writeSchema(path: String, schema: GraphQLSchema): js.Promise[Unit] = js.native
  def writeSchema(path: String, schema: GraphQLSchema, schemaExtensions: StringDictionary[String]): js.Promise[Unit] = js.native
}

