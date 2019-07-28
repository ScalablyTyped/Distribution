package typings.jsreportDashCore.jsreportDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStore extends js.Object {
  def collection(name: String): Collection
}

object DocumentStore {
  @scala.inline
  def apply(collection: String => Collection): DocumentStore = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection))
  
    __obj.asInstanceOf[DocumentStore]
  }
}

