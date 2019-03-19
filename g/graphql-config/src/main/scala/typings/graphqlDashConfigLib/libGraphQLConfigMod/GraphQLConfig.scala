package typings
package graphqlDashConfigLib.libGraphQLConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/GraphQLConfig", "GraphQLConfig")
@js.native
class GraphQLConfig protected () extends js.Object {
  def this(config: graphqlDashConfigLib.libTypesMod.GraphQLConfigData, configPath: java.lang.String) = this()
  var config: graphqlDashConfigLib.libTypesMod.GraphQLConfigData = js.native
  val configDir: java.lang.String = js.native
  var configPath: java.lang.String = js.native
  def getConfigForFile(filePath: java.lang.String): js.UndefOr[graphqlDashConfigLib.libGraphQLProjectConfigMod.GraphQLProjectConfig] = js.native
  def getProjectConfig(): graphqlDashConfigLib.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getProjectConfig(projectName: java.lang.String): graphqlDashConfigLib.libGraphQLProjectConfigMod.GraphQLProjectConfig = js.native
  def getProjectNameForFile(filePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getProjects(): js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[graphqlDashConfigLib.libGraphQLProjectConfigMod.GraphQLProjectConfig]
  ] = js.native
  def saveConfig(newConfig: graphqlDashConfigLib.libTypesMod.GraphQLConfigData): scala.Unit = js.native
  def saveConfig(newConfig: graphqlDashConfigLib.libTypesMod.GraphQLConfigData, projectName: java.lang.String): scala.Unit = js.native
}

