package typings.jsDashSearch.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchIndex extends js.Object {
  def indexDocument(token: String, uid: String, document: js.Object): Unit
  def search(tokens: js.Array[String], corpus: js.Array[js.Object]): js.Array[js.Object]
}

object ISearchIndex {
  @scala.inline
  def apply(
    indexDocument: (String, String, js.Object) => Unit,
    search: (js.Array[String], js.Array[js.Object]) => js.Array[js.Object]
  ): ISearchIndex = {
    val __obj = js.Dynamic.literal(indexDocument = js.Any.fromFunction3(indexDocument), search = js.Any.fromFunction2(search))
  
    __obj.asInstanceOf[ISearchIndex]
  }
}

