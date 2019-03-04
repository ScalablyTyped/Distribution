package typings
package lowlightLib.lowlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightResult extends js.Object {
  var language: java.lang.String
  var relevance: scala.Double
  var value: js.Array[HastNode]
}

object HighlightResult {
  @scala.inline
  def apply(language: java.lang.String, relevance: scala.Double, value: js.Array[HastNode]): HighlightResult = {
    val __obj = js.Dynamic.literal(language = language, relevance = relevance, value = value)
  
    __obj.asInstanceOf[HighlightResult]
  }
}

