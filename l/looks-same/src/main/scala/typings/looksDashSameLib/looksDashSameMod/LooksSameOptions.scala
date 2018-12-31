package typings
package looksDashSameLib.looksDashSameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame function
  */
trait LooksSameOptions extends js.Object {
  /**
    * Sometimes the antialiasing algorithm can work incorrectly due to some features of the browser rendering engine.
    * Use the option antialiasingTolerance to make the algorithm less strict.
    * With this option you can specify the minimum difference in brightness (zero by default)
    * between the darkest/lightest pixel (which is adjacent to the antialiasing pixel) and theirs adjacent pixels.
    *
    * We recommend that you don't increase this value above 10. If you need to increase more than 10 then this is definitely not antialiasing.
    */
  var antialiasingTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Some images has difference while comparing because of antialiasing.
    * These diffs will be ignored by default. You can use ignoreAntialiasing option with false value to disable ignoring such diffs.
    * In that way antialiased pixels will be marked as diffs.
    */
  var ignoreAntialiasing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For visual regression tasks it may be useful to ignore text caret in text input elements. You can do it with ignoreCaret option.
    */
  var ignoreCaret: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Some devices can have different proportion between physical and logical screen resolutions also known as pixel ratio.
    * Default value for this proportion is 1.
    * This param also affects the comparison result, so it can be set manually with pixelRatio option.
    */
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * By default, it will detect only noticeable differences. If you wish to detect any difference, use strict options.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You can also adjust the ΔE value that will be treated as error in non-strict mode.
    */
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

