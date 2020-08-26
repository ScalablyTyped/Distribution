package typings.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotateStringOptions extends js.Object {
  var includeAnnotationIndices: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
}

object AnnotateStringOptions {
  @scala.inline
  def apply(): AnnotateStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateStringOptions]
  }
  @scala.inline
  implicit class AnnotateStringOptionsOps[Self <: AnnotateStringOptions] (val x: Self) extends AnyVal {
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
    def setIncludeAnnotationIndices(value: Boolean): Self = this.set("includeAnnotationIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAnnotationIndices: Self = this.set("includeAnnotationIndices", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

