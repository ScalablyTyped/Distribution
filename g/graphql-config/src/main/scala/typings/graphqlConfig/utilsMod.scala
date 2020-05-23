package typings.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLSchema
import typings.graphqlConfig.anon.IntrospectionQueryerrorsu
import typings.graphqlConfig.typesMod.GraphQLConfigData
import typings.graphqlConfig.typesMod.IntrospectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-config/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getSchemaExtensions(path: String): StringDictionary[String] = js.native
  def introspectionToSchema(introspection: IntrospectionQueryerrorsu): GraphQLSchema = js.native
  def introspectionToSchema(introspection: IntrospectionResult): GraphQLSchema = js.native
  def matchesGlobs(filePath: String, configDir: String): Boolean = js.native
  def matchesGlobs(filePath: String, configDir: String, globs: js.Array[String]): Boolean = js.native
  def mergeConfigs(dest: GraphQLConfigData, src: GraphQLConfigData): GraphQLConfigData = js.native
  def normalizeGlob(glob: String): String = js.native
  def readConfig(configPath: String): GraphQLConfigData = js.native
  def readSchema(path: js.Any): GraphQLSchema = js.native
  def schemaToIntrospection(schema: GraphQLSchema): js.Promise[IntrospectionResult] = js.native
  def validateConfig(config: GraphQLConfigData): Unit = js.native
  def writeConfig(configPath: String, config: GraphQLConfigData): Unit = js.native
  def writeSchema(path: String, schema: GraphQLSchema): js.Promise[Unit] = js.native
  def writeSchema(path: String, schema: GraphQLSchema, schemaExtensions: StringDictionary[String]): js.Promise[Unit] = js.native
}

