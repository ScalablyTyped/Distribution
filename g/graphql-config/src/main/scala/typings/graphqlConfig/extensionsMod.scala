package typings.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointConfig
import typings.graphqlConfig.endpointsExtensionMod.GraphQLConfigEnpointsMapData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/extensions", JSImport.Namespace)
@js.native
object extensionsMod extends js.Object {
  @js.native
  class GraphQLEndpoint protected ()
    extends typings.graphqlConfig.endpointsMod.GraphQLEndpoint {
    def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  }
  
  @js.native
  class GraphQLEndpointsExtension protected ()
    extends typings.graphqlConfig.endpointsMod.GraphQLEndpointsExtension {
    def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  }
  
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
}

