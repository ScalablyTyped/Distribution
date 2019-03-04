package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELang database (LocalStorage) functionality with Singleton instance
trait IELangDBOptions extends js.Object {
  var autocompleteRows: scala.Double
}

object IELangDBOptions {
  @scala.inline
  def apply(autocompleteRows: scala.Double): IELangDBOptions = {
    val __obj = js.Dynamic.literal(autocompleteRows = autocompleteRows)
  
    __obj.asInstanceOf[IELangDBOptions]
  }
}

