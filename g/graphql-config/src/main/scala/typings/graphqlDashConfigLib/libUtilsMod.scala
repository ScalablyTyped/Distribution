package typings
package graphqlDashConfigLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  def getSchemaExtensions(path: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def introspectionToSchema(
    introspection: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery with graphqlDashConfigLib.Anon_Data
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def introspectionToSchema(introspection: graphqlDashConfigLib.libTypesMod.IntrospectionResult): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def matchesGlobs(filePath: java.lang.String, configDir: java.lang.String): scala.Boolean = js.native
  def matchesGlobs(filePath: java.lang.String, configDir: java.lang.String, globs: js.Array[java.lang.String]): scala.Boolean = js.native
  def mergeConfigs(
    dest: graphqlDashConfigLib.libTypesMod.GraphQLConfigData,
    src: graphqlDashConfigLib.libTypesMod.GraphQLConfigData
  ): graphqlDashConfigLib.libTypesMod.GraphQLConfigData = js.native
  def normalizeGlob(glob: java.lang.String): java.lang.String = js.native
  def readConfig(configPath: java.lang.String): graphqlDashConfigLib.libTypesMod.GraphQLConfigData = js.native
  def readSchema(path: js.Any): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def schemaToIntrospection(schema: graphqlLib.graphqlMod.GraphQLSchema): js.Promise[graphqlDashConfigLib.libTypesMod.IntrospectionResult] = js.native
  def validateConfig(config: graphqlDashConfigLib.libTypesMod.GraphQLConfigData): scala.Unit = js.native
  def writeConfig(configPath: java.lang.String, config: graphqlDashConfigLib.libTypesMod.GraphQLConfigData): scala.Unit = js.native
  def writeSchema(path: java.lang.String, schema: graphqlLib.graphqlMod.GraphQLSchema): js.Promise[scala.Unit] = js.native
  def writeSchema(
    path: java.lang.String,
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    schemaExtensions: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Promise[scala.Unit] = js.native
}

