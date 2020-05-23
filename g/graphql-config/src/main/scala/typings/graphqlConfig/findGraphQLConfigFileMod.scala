package typings.graphqlConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/findGraphQLConfigFile", JSImport.Namespace)
@js.native
object findGraphQLConfigFileMod extends js.Object {
  val GRAPHQL_CONFIG_NAME: /* ".graphqlconfig" */ String = js.native
  val GRAPHQL_CONFIG_YAML_NAME: /* ".graphqlconfig.yaml" */ String = js.native
  val GRAPHQL_CONFIG_YML_NAME: /* ".graphqlconfig.yml" */ String = js.native
  def findGraphQLConfigFile(filePath: String): String = js.native
}

