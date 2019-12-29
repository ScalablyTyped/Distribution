package typings.graphqlDashConfig

import typings.graphqlDashConfig.graphqlDashConfigStrings.Dotgraphqlconfig
import typings.graphqlDashConfig.graphqlDashConfigStrings.DotgraphqlconfigDotyaml
import typings.graphqlDashConfig.graphqlDashConfigStrings.DotgraphqlconfigDotyml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/findGraphQLConfigFile", JSImport.Namespace)
@js.native
object libFindGraphQLConfigFileMod extends js.Object {
  val GRAPHQL_CONFIG_NAME: Dotgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: DotgraphqlconfigDotyaml = js.native
  val GRAPHQL_CONFIG_YML_NAME: DotgraphqlconfigDotyml = js.native
  def findGraphQLConfigFile(filePath: String): String = js.native
}

