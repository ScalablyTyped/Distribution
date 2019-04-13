package typings
package highlightDotJsLib.highlightDotJsMod

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
    val __obj = js.Dynamic.literal(language = language, relevance = relevance, value = value)
  
    __obj.asInstanceOf[IHighlightResultBase]
  }
}

