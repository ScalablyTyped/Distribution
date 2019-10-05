package typings.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightResult extends js.Object {
  var language: String
  var relevance: Double
  var value: js.Array[HastNode]
}

object HighlightResult {
  @scala.inline
  def apply(language: String, relevance: Double, value: js.Array[HastNode]): HighlightResult = {
    val __obj = js.Dynamic.literal(language = language, relevance = relevance, value = value)
  
    __obj.asInstanceOf[HighlightResult]
  }
}

