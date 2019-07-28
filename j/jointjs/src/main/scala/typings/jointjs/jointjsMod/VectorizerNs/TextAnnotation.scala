package typings.jointjs.jointjsMod.VectorizerNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAnnotation extends js.Object {
  var attrs: StringDictionary[js.Any]
  var end: Double
  var start: Double
}

object TextAnnotation {
  @scala.inline
  def apply(attrs: StringDictionary[js.Any], end: Double, start: Double): TextAnnotation = {
    val __obj = js.Dynamic.literal(attrs = attrs, end = end, start = start)
  
    __obj.asInstanceOf[TextAnnotation]
  }
}

