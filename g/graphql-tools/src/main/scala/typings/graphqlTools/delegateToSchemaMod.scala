package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.IDelegateToSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/delegateToSchema", JSImport.Namespace)
@js.native
object delegateToSchemaMod extends js.Object {
  def default(options: GraphQLSchema, args: js.Any*): js.Promise[_] = js.native
  def default(options: IDelegateToSchemaOptions[StringDictionary[_]], args: js.Any*): js.Promise[_] = js.native
}

