package typings
package highlightDotJsLib.highlightDotJsMod.hljsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlightResultBase extends js.Object {
  var language: java.lang.String
  var relevance: scala.Double
  var value: java.lang.String
}

object IHighlightResultBase {
  @scala.inline
  def apply(language: java.lang.String, relevance: scala.Double, value: java.lang.String): IHighlightResultBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("relevance")(relevance)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IHighlightResultBase]
  }
}

