package typings.legalEagle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var license: String
  var repository: String
  var source: String
  var sourceText: String
}

object Entry {
  @scala.inline
  def apply(license: String, repository: String, source: String, sourceText: String): Entry = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

