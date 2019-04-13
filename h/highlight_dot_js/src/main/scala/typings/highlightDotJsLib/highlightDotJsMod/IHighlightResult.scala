package typings
package highlightDotJsLib.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlightResult extends IHighlightResultBase {
  var top: ICompiledMode
}

object IHighlightResult {
  @scala.inline
  def apply(language: java.lang.String, relevance: scala.Double, top: ICompiledMode, value: java.lang.String): IHighlightResult = {
    val __obj = js.Dynamic.literal(language = language, relevance = relevance, top = top, value = value)
  
    __obj.asInstanceOf[IHighlightResult]
  }
}

