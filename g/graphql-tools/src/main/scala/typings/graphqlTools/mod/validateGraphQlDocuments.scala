package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.loadersMod.Source
import typings.graphqlToolsUtils.validateDocumentsMod.LoadDocumentError
import typings.graphqlToolsUtils.validateDocumentsMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "validateGraphQlDocuments")
@js.native
object validateGraphQlDocuments extends js.Object {
  def apply(schema: GraphQLSchema, documentFiles: js.Array[Source]): js.Promise[js.Array[LoadDocumentError]] = js.native
  def apply(schema: GraphQLSchema, documentFiles: js.Array[Source], effectiveRules: js.Array[ValidationRule]): js.Promise[js.Array[LoadDocumentError]] = js.native
}

