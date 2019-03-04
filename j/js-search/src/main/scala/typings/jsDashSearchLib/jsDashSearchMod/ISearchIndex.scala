package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchIndex extends js.Object {
  def indexDocument(token: java.lang.String, uid: java.lang.String, document: js.Object): scala.Unit
  def search(tokens: js.Array[java.lang.String], corpus: js.Array[js.Object]): js.Array[js.Object]
}

object ISearchIndex {
  @scala.inline
  def apply(
    indexDocument: js.Function3[java.lang.String, java.lang.String, js.Object, scala.Unit],
    search: js.Function2[js.Array[java.lang.String], js.Array[js.Object], js.Array[js.Object]]
  ): ISearchIndex = {
    val __obj = js.Dynamic.literal(indexDocument = indexDocument, search = search)
  
    __obj.asInstanceOf[ISearchIndex]
  }
}

