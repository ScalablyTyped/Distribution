package typings.looksSame.mod

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
  var antialiasingTolerance: js.UndefOr[Double] = js.undefined
  /**
    * Radius for every diff cluster
    */
  var clustersSize: js.UndefOr[Double] = js.undefined
  /**
    * Some images has difference while comparing because of antialiasing.
    * These diffs will be ignored by default. You can use ignoreAntialiasing option with false value to disable ignoring such diffs.
    * In that way antialiased pixels will be marked as diffs.
    */
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined
  /**
    * Text caret in text input elements it is a pain for visual regression tasks, because it is always blinks.
    * These diffs will be ignored by default. You can use `ignoreCaret` option with `false` value to disable ignoring such diffs.
    * In that way text caret will be marked as diffs.
    */
  var ignoreCaret: js.UndefOr[Boolean] = js.undefined
  /**
    * Some devices can have different proportion between physical and logical screen resolutions also known as pixel ratio.
    * Default value for this proportion is 1.
    * This param also affects the comparison result, so it can be set manually with pixelRatio option.
    */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  /**
    * Responsible for diff bounds clustering
    */
  var shouldCluster: js.UndefOr[Boolean] = js.undefined
  /**
    * Responsible for diff area which will be returned  when comparing images.
    * Diff bounds will contain the whole diff if stopOnFirstFail is false and only first diff pixel - otherwise.
    */
  var stopOnFirstFail: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, it will detect only noticeable differences. If you wish to detect any difference, use strict options.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * You can also adjust the ΔE value that will be treated as error in non-strict mode.
    */
  var tolerance: js.UndefOr[Double] = js.undefined
}

object LooksSameOptions {
  @scala.inline
  def apply(
    antialiasingTolerance: js.UndefOr[Double] = js.undefined,
    clustersSize: js.UndefOr[Double] = js.undefined,
    ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined,
    ignoreCaret: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    shouldCluster: js.UndefOr[Boolean] = js.undefined,
    stopOnFirstFail: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    tolerance: js.UndefOr[Double] = js.undefined
  ): LooksSameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialiasingTolerance)) __obj.updateDynamic("antialiasingTolerance")(antialiasingTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clustersSize)) __obj.updateDynamic("clustersSize")(clustersSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCaret)) __obj.updateDynamic("ignoreCaret")(ignoreCaret.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCluster)) __obj.updateDynamic("shouldCluster")(shouldCluster.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnFirstFail)) __obj.updateDynamic("stopOnFirstFail")(stopOnFirstFail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LooksSameOptions]
  }
}

