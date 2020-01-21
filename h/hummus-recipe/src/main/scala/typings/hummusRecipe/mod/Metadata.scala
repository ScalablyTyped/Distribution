package typings.hummusRecipe.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends /* PagesIndex */ NumberDictionary[PageInfo] {
  var pages: Double
}

object Metadata {
  @scala.inline
  def apply(pages: Double, NumberDictionary: /* PagesIndex */ NumberDictionary[PageInfo] = null): Metadata = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Metadata]
  }
}

