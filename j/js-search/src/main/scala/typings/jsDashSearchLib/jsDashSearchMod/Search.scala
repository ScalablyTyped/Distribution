package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "Search")
@js.native
class Search protected () extends js.Object {
  def this(uidFieldName: java.lang.String) = this()
  def this(uidFieldName: js.Array[java.lang.String]) = this()
  var indexStrategy: IIndexStrategy = js.native
  var sanitizer: ISanitizer = js.native
  var searchIndex: ISearchIndex = js.native
  var tokenizer: ITokenizer = js.native
  def addDocument(document: js.Object): scala.Unit = js.native
  def addDocuments(documents: js.Array[js.Object]): scala.Unit = js.native
  def addIndex(field: java.lang.String): scala.Unit = js.native
  def addIndex(field: js.Array[java.lang.String]): scala.Unit = js.native
  def search(query: java.lang.String): js.Array[js.Object] = js.native
}

