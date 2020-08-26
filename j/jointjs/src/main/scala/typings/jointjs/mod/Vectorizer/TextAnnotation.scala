package typings.jointjs.mod.Vectorizer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAnnotation extends js.Object {
  var attrs: StringDictionary[js.Any] = js.native
  var end: Double = js.native
  var start: Double = js.native
}

object TextAnnotation {
  @scala.inline
  def apply(attrs: StringDictionary[js.Any], end: Double, start: Double): TextAnnotation = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAnnotation]
  }
  @scala.inline
  implicit class TextAnnotationOps[Self <: TextAnnotation] (val x: Self) extends AnyVal {
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
    def setAttrs(value: StringDictionary[js.Any]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

