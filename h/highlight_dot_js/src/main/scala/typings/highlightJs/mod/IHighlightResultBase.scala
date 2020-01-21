package typings.highlightJs.mod

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
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHighlightResultBase]
  }
}

