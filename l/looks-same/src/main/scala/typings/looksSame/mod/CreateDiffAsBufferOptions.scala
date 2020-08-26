package typings.looksSame.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame.createDiff function without diff
  */
@js.native
trait CreateDiffAsBufferOptions extends js.Object {
  /**
    * makes the search algorithm of the antialiasing less strict
    */
  var antialiasingTolerance: js.UndefOr[Double] = js.native
  /**
    * The current image
    */
  var current: String | Buffer | BoundedImage = js.native
  /**
    * Color to highlight the differences
    * e.g. '#ff00ff'
    */
  var highlightColor: String = js.native
  /**
    * Ability to ignore antialiasing
    */
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
  /**
    * Ability to ignore text caret
    */
  var ignoreCaret: js.UndefOr[Boolean] = js.native
  /**
    * The baseline image
    */
  var reference: String | Buffer | BoundedImage = js.native
  /**
    * strict comparsion
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * ΔE value that will be treated as error in non-strict mode
    */
  var tolerance: js.UndefOr[Double] = js.native
}

object CreateDiffAsBufferOptions {
  @scala.inline
  def apply(
    current: String | Buffer | BoundedImage,
    highlightColor: String,
    reference: String | Buffer | BoundedImage
  ): CreateDiffAsBufferOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiffAsBufferOptions]
  }
  @scala.inline
  implicit class CreateDiffAsBufferOptionsOps[Self <: CreateDiffAsBufferOptions] (val x: Self) extends AnyVal {
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
    def setCurrent(value: String | Buffer | BoundedImage): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: String | Buffer | BoundedImage): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setAntialiasingTolerance(value: Double): Self = this.set("antialiasingTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialiasingTolerance: Self = this.set("antialiasingTolerance", js.undefined)
    @scala.inline
    def setIgnoreAntialiasing(value: Boolean): Self = this.set("ignoreAntialiasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreAntialiasing: Self = this.set("ignoreAntialiasing", js.undefined)
    @scala.inline
    def setIgnoreCaret(value: Boolean): Self = this.set("ignoreCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCaret: Self = this.set("ignoreCaret", js.undefined)
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

