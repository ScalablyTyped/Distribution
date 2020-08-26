package typings.looksSame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame function
  */
@js.native
trait LooksSameOptions extends js.Object {
  /**
    * Sometimes the antialiasing algorithm can work incorrectly due to some features of the browser rendering engine.
    * Use the option antialiasingTolerance to make the algorithm less strict.
    * With this option you can specify the minimum difference in brightness (zero by default)
    * between the darkest/lightest pixel (which is adjacent to the antialiasing pixel) and theirs adjacent pixels.
    *
    * We recommend that you don't increase this value above 10. If you need to increase more than 10 then this is definitely not antialiasing.
    */
  var antialiasingTolerance: js.UndefOr[Double] = js.native
  /**
    * Radius for every diff cluster
    */
  var clustersSize: js.UndefOr[Double] = js.native
  /**
    * Some images has difference while comparing because of antialiasing.
    * These diffs will be ignored by default. You can use ignoreAntialiasing option with false value to disable ignoring such diffs.
    * In that way antialiased pixels will be marked as diffs.
    */
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
  /**
    * Text caret in text input elements it is a pain for visual regression tasks, because it is always blinks.
    * These diffs will be ignored by default. You can use `ignoreCaret` option with `false` value to disable ignoring such diffs.
    * In that way text caret will be marked as diffs.
    */
  var ignoreCaret: js.UndefOr[Boolean] = js.native
  /**
    * Some devices can have different proportion between physical and logical screen resolutions also known as pixel ratio.
    * Default value for this proportion is 1.
    * This param also affects the comparison result, so it can be set manually with pixelRatio option.
    */
  var pixelRatio: js.UndefOr[Double] = js.native
  /**
    * Responsible for diff bounds clustering
    */
  var shouldCluster: js.UndefOr[Boolean] = js.native
  /**
    * Responsible for diff area which will be returned  when comparing images.
    * Diff bounds will contain the whole diff if stopOnFirstFail is false and only first diff pixel - otherwise.
    */
  var stopOnFirstFail: js.UndefOr[Boolean] = js.native
  /**
    * By default, it will detect only noticeable differences. If you wish to detect any difference, use strict options.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * You can also adjust the ΔE value that will be treated as error in non-strict mode.
    */
  var tolerance: js.UndefOr[Double] = js.native
}

object LooksSameOptions {
  @scala.inline
  def apply(): LooksSameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LooksSameOptions]
  }
  @scala.inline
  implicit class LooksSameOptionsOps[Self <: LooksSameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAntialiasingTolerance(value: Double): Self = this.set("antialiasingTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialiasingTolerance: Self = this.set("antialiasingTolerance", js.undefined)
    @scala.inline
    def setClustersSize(value: Double): Self = this.set("clustersSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClustersSize: Self = this.set("clustersSize", js.undefined)
    @scala.inline
    def setIgnoreAntialiasing(value: Boolean): Self = this.set("ignoreAntialiasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreAntialiasing: Self = this.set("ignoreAntialiasing", js.undefined)
    @scala.inline
    def setIgnoreCaret(value: Boolean): Self = this.set("ignoreCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCaret: Self = this.set("ignoreCaret", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setShouldCluster(value: Boolean): Self = this.set("shouldCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldCluster: Self = this.set("shouldCluster", js.undefined)
    @scala.inline
    def setStopOnFirstFail(value: Boolean): Self = this.set("stopOnFirstFail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnFirstFail: Self = this.set("stopOnFirstFail", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
  
}

