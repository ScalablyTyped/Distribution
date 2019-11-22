package typings.hummusDashRecipe.hummusDashRecipeMod

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
    val __obj = js.Dynamic.literal(pages = pages)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Metadata]
  }
}

