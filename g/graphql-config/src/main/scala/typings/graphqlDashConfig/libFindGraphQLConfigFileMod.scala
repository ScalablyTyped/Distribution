package typings.graphqlDashConfig

import typings.graphqlDashConfig.graphqlDashConfigStrings.DOTgraphqlconfig
import typings.graphqlDashConfig.graphqlDashConfigStrings.DOTgraphqlconfigDOTyaml
import typings.graphqlDashConfig.graphqlDashConfigStrings.DOTgraphqlconfigDOTyml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/findGraphQLConfigFile", JSImport.Namespace)
@js.native
object libFindGraphQLConfigFileMod extends js.Object {
  val GRAPHQL_CONFIG_NAME: DOTgraphqlconfig = js.native
  val GRAPHQL_CONFIG_YAML_NAME: DOTgraphqlconfigDOTyaml = js.native
  val GRAPHQL_CONFIG_YML_NAME: DOTgraphqlconfigDOTyml = js.native
  def findGraphQLConfigFile(filePath: String): String = js.native
}

