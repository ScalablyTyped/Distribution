package typings
package highlightDotJsLib.highlightDotJsMod.hljsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlightResult extends IHighlightResultBase {
  var top: ICompiledMode
}

object IHighlightResult {
  @scala.inline
  def apply(language: java.lang.String, relevance: scala.Double, top: ICompiledMode, value: java.lang.String): IHighlightResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("relevance")(relevance)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IHighlightResult]
  }
}

