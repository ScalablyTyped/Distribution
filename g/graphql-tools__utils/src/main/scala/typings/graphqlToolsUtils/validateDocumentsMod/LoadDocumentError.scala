package typings.graphqlToolsUtils.validateDocumentsMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadDocumentError extends js.Object {
  val errors: js.Array[GraphQLError]
  val filePath: String
}

object LoadDocumentError {
  @scala.inline
  def apply(errors: js.Array[GraphQLError], filePath: String): LoadDocumentError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadDocumentError]
  }
}

