package typings.jsforce.apiMetadataMod

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
    val __obj = js.Dynamic.literal(fileName = fileName, problem = problem)
  
    __obj.asInstanceOf[RetrieveMessage]
  }
}

