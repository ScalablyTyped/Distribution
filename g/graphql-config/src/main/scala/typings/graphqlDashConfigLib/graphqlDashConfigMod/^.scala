package typings
package graphqlDashConfigLib.graphqlDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GRAPHQL_CONFIG_NAME: graphqlDashConfigLib.graphqlDashConfigLibStrings.DOTgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: graphqlDashConfigLib.graphqlDashConfigLibStrings.DOTgraphqlconfigDOTyaml = js.native
  def findGraphQLConfigFile(filePath: java.lang.String): java.lang.String = js.native
  def getGraphQLConfig(): graphqlDashConfigLib.libGraphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLConfig(rootDir: java.lang.String): graphqlDashConfigLib.libGraphQLConfigMod.GraphQLConfig = js.native
  def getGraphQLProjectConfig(): graphqlDashConfigLib.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: java.lang.String): graphqlDashConfigLib.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getGraphQLProjectConfig(rootDir: java.lang.String, projectName: java.lang.String): graphqlDashConfigLib.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getSchemaExtensions(path: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getUsedEnvs(config: js.Any): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def resolveEnvsInValues[T /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](config: T, env: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]): T = js.native
  def resolveRefString(str: java.lang.String): java.lang.String = js.native
  def resolveRefString(str: java.lang.String, values: js.Object): java.lang.String = js.native
  def validateConfig(config: graphqlDashConfigLib.libTypesMod.GraphQLConfigData): scala.Unit = js.native
  def writeSchema(path: java.lang.String, schema: graphqlLib.graphqlMod.GraphQLSchema): js.Promise[scala.Unit] = js.native
  def writeSchema(
    path: java.lang.String,
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    schemaExtensions: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Promise[scala.Unit] = js.native
}

