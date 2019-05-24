package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VName extends js.Object {
  var corpus: java.lang.String
  var language: java.lang.String
  var path: java.lang.String
  var root: java.lang.String
  var signature: java.lang.String
}

object VName {
  @scala.inline
  def apply(
    corpus: java.lang.String,
    language: java.lang.String,
    path: java.lang.String,
    root: java.lang.String,
    signature: java.lang.String
  ): VName = {
    val __obj = js.Dynamic.literal(corpus = corpus, language = language, path = path, root = root, signature = signature)
  
    __obj.asInstanceOf[VName]
  }
}

