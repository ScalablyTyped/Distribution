package typings.graphqlConfig.endpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/extensions/endpoints/EndpointsExtension", "GraphQLEndpointsExtension")
@js.native
class GraphQLEndpointsExtension protected () extends js.Object {
  def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: String) = this()
  var configPath: js.Any = js.native
  var raw: GraphQLConfigEnpointsMapData = js.native
  def getEndpoint(endpointName: String): GraphQLEndpoint = js.native
  def getEndpoint(endpointName: String, env: StringDictionary[js.UndefOr[String]]): GraphQLEndpoint = js.native
  def getEnvVarsForEndpoint(endpointName: String): StringDictionary[String | Null] = js.native
  /* private */ def getRawEndpoint(): js.Any = js.native
  /* private */ def getRawEndpoint(endpointName: js.Any): js.Any = js.native
  def getRawEndpointsMap(): GraphQLConfigEnpointsMap = js.native
}

