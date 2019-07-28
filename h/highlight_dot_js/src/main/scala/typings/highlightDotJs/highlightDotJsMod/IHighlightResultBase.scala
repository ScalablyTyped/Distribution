package typings.highlightDotJs.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlightResultBase extends js.Object {
  var language: String
  var relevance: Double
  var value: String
}

object IHighlightResultBase {
  @scala.inline
  def apply(language: String, relevance: Double, value: String): IHighlightResultBase = {
    val __obj = js.Dynamic.literal(language = language, relevance = relevance, value = value)
  
    __obj.asInstanceOf[IHighlightResultBase]
  }
}

