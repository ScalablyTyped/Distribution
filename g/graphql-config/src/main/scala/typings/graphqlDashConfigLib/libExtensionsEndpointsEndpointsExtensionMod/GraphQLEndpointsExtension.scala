package typings
package graphqlDashConfigLib.libExtensionsEndpointsEndpointsExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/extensions/endpoints/EndpointsExtension", "GraphQLEndpointsExtension")
@js.native
class GraphQLEndpointsExtension protected () extends js.Object {
  def this(endpointConfig: GraphQLConfigEnpointsMapData, configPath: java.lang.String) = this()
  var configPath: js.Any = js.native
  var raw: GraphQLConfigEnpointsMapData = js.native
  def getEndpoint(endpointName: java.lang.String): GraphQLEndpoint = js.native
  def getEndpoint(
    endpointName: java.lang.String,
    env: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): GraphQLEndpoint = js.native
  def getEnvVarsForEndpoint(endpointName: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = js.native
  /* private */ def getRawEndpoint(): js.Any = js.native
  /* private */ def getRawEndpoint(endpointName: js.Any): js.Any = js.native
  def getRawEndpointsMap(): GraphQLConfigEnpointsMap = js.native
}

