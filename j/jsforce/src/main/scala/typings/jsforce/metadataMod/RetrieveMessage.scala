package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveMessage extends js.Object {
  var fileName: String
  var problem: String
}

object RetrieveMessage {
  @scala.inline
  def apply(fileName: String, problem: String): RetrieveMessage = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], problem = problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMessage]
  }
}

