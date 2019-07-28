package typings.graphqlDashConfig.graphqlDashConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashConfig.graphqlDashConfigStrings.DOTgraphqlconfig
import typings.graphqlDashConfig.graphqlDashConfigStrings.DOTgraphqlconfigDOTyaml
import typings.graphqlDashConfig.libTypesMod.GraphQLConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GRAPHQL_CONFIG_NAME: DOTgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: DOTgraphqlconfigDOTyaml = js.native
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

