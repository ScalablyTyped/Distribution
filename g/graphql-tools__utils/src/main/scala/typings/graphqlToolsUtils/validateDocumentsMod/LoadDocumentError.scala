package typings.graphqlToolsUtils.validateDocumentsMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadDocumentError extends js.Object {
  val errors: js.Array[GraphQLError] = js.native
  val filePath: String = js.native
}

object LoadDocumentError {
  @scala.inline
  def apply(errors: js.Array[GraphQLError], filePath: String): LoadDocumentError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadDocumentError]
  }
  @scala.inline
  implicit class LoadDocumentErrorOps[Self <: LoadDocumentError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
  }
  
}

