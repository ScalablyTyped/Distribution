package typings.graphqlDashConfig

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashConfig.graphqlDashConfigStrings.Dotgraphqlconfig
import typings.graphqlDashConfig.graphqlDashConfigStrings.DotgraphqlconfigDotyaml
import typings.graphqlDashConfig.libExtensionsEndpointsEndpointsExtensionMod.GraphQLConfigEnpointConfig
import typings.graphqlDashConfig.libExtensionsEndpointsEndpointsExtensionMod.GraphQLConfigEnpointsMapData
import typings.graphqlDashConfig.libTypesMod.GraphQLConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config", JSImport.Namespace)
@js.native
object graphqlDashConfigMod extends js.Object {
  @js.native
  class ConfigNotFoundError protected ()
    extends typings.graphqlDashConfig.libErrorsMod.ConfigNotFoundError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLConfig protected ()
    extends typings.graphqlDashConfig.libGraphQLConfigMod.GraphQLConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLEndpoint protected ()
    extends typings.graphqlDashConfig.libExtensionsMod.GraphQLEndpoint {
    def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  }
  
  @js.native
  class GraphQLEndpointsExtension protected ()
    extends typings.graphqlDashConfig.libExtensionsMod.GraphQLEndpointsExtension {
    def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  }
  
  @js.native
  class GraphQLProjectConfig protected ()
    extends typings.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig {
    def this(config: GraphQLConfigData, configPath: String) = this()
    def this(config: GraphQLConfigData, configPath: String, projectName: String) = this()
  }
  
  val GRAPHQL_CONFIG_NAME: Dotgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: DotgraphqlconfigDotyaml = js.native
  def findGraphQLConfigFile(filePath: String): String = js.native
  def getGraphQLConfig(): typings.graphqlDashConfig.libGraphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLConfig(rootDir: String): typings.graphqlDashConfig.libGraphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLProjectConfig(): typings.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String): typings.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: String, projectName: String): typings.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getSchemaExtensions(path: String): StringDictionary[String] = js.native
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
  def validateConfig(config: GraphQLConfigData): Unit = js.native
  def writeSchema(path: String, schema: GraphQLSchema): js.Promise[Unit] = js.native
  def writeSchema(path: String, schema: GraphQLSchema, schemaExtensions: StringDictionary[String]): js.Promise[Unit] = js.native
}

