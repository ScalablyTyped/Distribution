package typings.kythe.mod

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
    val __obj = js.Dynamic.literal(corpus = corpus.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VName]
  }
}

