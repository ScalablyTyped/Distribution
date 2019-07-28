package typings.kythe.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VName extends js.Object {
  var corpus: String
  var language: String
  var path: String
  var root: String
  var signature: String
}

object VName {
  @scala.inline
  def apply(corpus: String, language: String, path: String, root: String, signature: String): VName = {
    val __obj = js.Dynamic.literal(corpus = corpus, language = language, path = path, root = root, signature = signature)
  
    __obj.asInstanceOf[VName]
  }
}

