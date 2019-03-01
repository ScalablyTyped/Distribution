package typings
package legalDashEagleLib.legalDashEagleMod.legalEagleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var license: java.lang.String
  var repository: java.lang.String
  var source: java.lang.String
  var sourceText: java.lang.String
}

object Entry {
  @scala.inline
  def apply(
    license: java.lang.String,
    repository: java.lang.String,
    source: java.lang.String,
    sourceText: java.lang.String
  ): Entry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("license")(license)
    __obj.updateDynamic("repository")(repository)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("sourceText")(sourceText)
    __obj.asInstanceOf[Entry]
  }
}

