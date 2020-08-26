package typings.jointjs.mod.Vectorizer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  var annotations: js.UndefOr[js.Array[TextAnnotation]] = js.native
  var displayEmpty: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var includeAnnotationIndices: js.UndefOr[Boolean] = js.native
  var lineHeight: js.UndefOr[Double | String] = js.native
  var textPath: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  var textVerticalAnchor: js.UndefOr[TextVerticalAnchor | Double | String] = js.native
  var x: js.UndefOr[Double | String] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
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
    def setAnnotationsVarargs(value: TextAnnotation*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: js.Array[TextAnnotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    @scala.inline
    def setDisplayEmpty(value: Boolean): Self = this.set("displayEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayEmpty: Self = this.set("displayEmpty", js.undefined)
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    @scala.inline
    def setIncludeAnnotationIndices(value: Boolean): Self = this.set("includeAnnotationIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAnnotationIndices: Self = this.set("includeAnnotationIndices", js.undefined)
    @scala.inline
    def setLineHeight(value: Double | String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setTextPath(value: String | StringDictionary[js.Any]): Self = this.set("textPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPath: Self = this.set("textPath", js.undefined)
    @scala.inline
    def setTextVerticalAnchor(value: TextVerticalAnchor | Double | String): Self = this.set("textVerticalAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextVerticalAnchor: Self = this.set("textVerticalAnchor", js.undefined)
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
  
}

