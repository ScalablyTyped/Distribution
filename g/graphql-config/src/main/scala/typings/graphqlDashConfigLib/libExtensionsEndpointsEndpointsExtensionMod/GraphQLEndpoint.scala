package typings
package graphqlDashConfigLib.libExtensionsEndpointsEndpointsExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/extensions/endpoints/EndpointsExtension", "GraphQLEndpoint")
@js.native
class GraphQLEndpoint protected () extends js.Object {
  def this(resolvedConfig: GraphQLConfigEnpointConfig) = this()
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var subscription: GraphQLConfigEnpointsSubscription = js.native
  var url: java.lang.String = js.native
  def getClient(): graphqlDashRequestLib.graphqlDashRequestMod.GraphQLClient = js.native
  def getClient(clientOptions: js.Any): graphqlDashRequestLib.graphqlDashRequestMod.GraphQLClient = js.native
  def resolveIntrospection(): js.Promise[graphqlDashConfigLib.libTypesMod.IntrospectionResult] = js.native
  def resolveSchema(): js.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def resolveSchemaSDL(): js.Promise[java.lang.String] = js.native
}

