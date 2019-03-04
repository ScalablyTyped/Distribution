package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAnnotation extends js.Object {
  var attrs: org.scalablytyped.runtime.StringDictionary[js.Any]
  var end: scala.Double
  var start: scala.Double
}

object TextAnnotation {
  @scala.inline
  def apply(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], end: scala.Double, start: scala.Double): TextAnnotation = {
    val __obj = js.Dynamic.literal(attrs = attrs, end = end, start = start)
  
    __obj.asInstanceOf[TextAnnotation]
  }
}

