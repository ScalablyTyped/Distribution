package typings.jsWorkerSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchApi extends js.Object {
  def indexDocument(uid: String, text: String): Unit
  def search(query: String): js.Promise[js.Array[String]]
}

object SearchApi {
  @scala.inline
  def apply(indexDocument: (String, String) => Unit, search: String => js.Promise[js.Array[String]]): SearchApi = {
    val __obj = js.Dynamic.literal(indexDocument = js.Any.fromFunction2(indexDocument), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[SearchApi]
  }
}

