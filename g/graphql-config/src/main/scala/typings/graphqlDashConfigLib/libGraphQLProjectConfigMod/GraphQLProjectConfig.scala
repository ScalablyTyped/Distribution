package typings
package graphqlDashConfigLib.libGraphQLProjectConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/GraphQLProjectConfig", "GraphQLProjectConfig")
@js.native
class GraphQLProjectConfig protected () extends js.Object {
  def this(config: graphqlDashConfigLib.libTypesMod.GraphQLConfigData, configPath: java.lang.String) = this()
  def this(config: graphqlDashConfigLib.libTypesMod.GraphQLConfigData, configPath: java.lang.String, projectName: java.lang.String) = this()
  var config: graphqlDashConfigLib.libTypesMod.GraphQLResolvedConfigData = js.native
  val configDir: java.lang.String = js.native
  var configPath: java.lang.String = js.native
  val endpointsExtension: graphqlDashConfigLib.libExtensionsMod.GraphQLEndpointsExtension | scala.Null = js.native
  val excludes: js.Array[java.lang.String] = js.native
  val extensions: graphqlDashConfigLib.libTypesMod.GraphQLConfigExtensions = js.native
  val includes: js.Array[java.lang.String] = js.native
  var projectName: js.UndefOr[java.lang.String] = js.native
  val schemaPath: java.lang.String | scala.Null = js.native
  def getSchema(): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def getSchemaSDL(): java.lang.String = js.native
  def includesFile(fileUri: java.lang.String): scala.Boolean = js.native
  def resolveConfigPath(relativePath: java.lang.String): java.lang.String = js.native
  def resolveIntrospection(): js.Promise[graphqlDashConfigLib.libTypesMod.IntrospectionResult] = js.native
}

