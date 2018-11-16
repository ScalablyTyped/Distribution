package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISearchIndex extends js.Object {
  def indexDocument(token: java.lang.String, uid: java.lang.String, document: js.Object): scala.Unit
  def search(tokens: js.Array[java.lang.String], corpus: js.Array[js.Object]): js.Array[js.Object]
}

