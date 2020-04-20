package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlightResult extends IHighlightResultBase {
  var top: ICompiledMode
}

object IHighlightResult {
  @scala.inline
  def apply(language: String, relevance: Double, top: ICompiledMode, value: String): IHighlightResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighlightResult]
  }
}

