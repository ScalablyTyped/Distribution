package typings.atMaterialGridDashList.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialGridDashList.atMaterialGridDashListStrings.`DOTmdc-grid-list__tiles`
import typings.atMaterialGridDashList.atMaterialGridDashListStrings.`DOTmdc-grid-tile`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var TILES_SELECTOR: `DOTmdc-grid-list__tiles`
  var TILE_SELECTOR: `DOTmdc-grid-tile`
}

object strings {
  @scala.inline
  def apply(
    TILES_SELECTOR: `DOTmdc-grid-list__tiles`,
    TILE_SELECTOR: `DOTmdc-grid-tile`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR, TILE_SELECTOR = TILE_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

