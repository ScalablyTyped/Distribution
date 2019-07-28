package typings.graphqlDashConfig.libGraphQLConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlDashConfig.libGraphQLProjectConfigMod.GraphQLProjectConfig
import typings.graphqlDashConfig.libTypesMod.GraphQLConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/GraphQLConfig", "GraphQLConfig")
@js.native
class GraphQLConfig protected () extends js.Object {
  def this(config: GraphQLConfigData, configPath: String) = this()
  var config: GraphQLConfigData = js.native
  val configDir: String = js.native
  var configPath: String = js.native
  def getConfigForFile(filePath: String): js.UndefOr[GraphQLProjectConfig] = js.native
  def getProjectConfig(): GraphQLProjectConfig = js.native
  def getProjectConfig(projectName: String): GraphQLProjectConfig = js.native
  def getProjectNameForFile(filePath: String): js.UndefOr[String] = js.native
  def getProjects(): js.UndefOr[StringDictionary[GraphQLProjectConfig]] = js.native
  def saveConfig(newConfig: GraphQLConfigData): Unit = js.native
  def saveConfig(newConfig: GraphQLConfigData, projectName: String): Unit = js.native
}

