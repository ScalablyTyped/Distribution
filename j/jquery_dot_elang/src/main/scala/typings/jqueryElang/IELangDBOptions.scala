package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELang database (LocalStorage) functionality with Singleton instance
trait IELangDBOptions extends js.Object {
  var autocompleteRows: Double
}

object IELangDBOptions {
  @scala.inline
  def apply(autocompleteRows: Double): IELangDBOptions = {
    val __obj = js.Dynamic.literal(autocompleteRows = autocompleteRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBOptions]
  }
}

