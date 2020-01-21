package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHot extends js.Object {
  var hot: Boolean
  var pageviews: Double
  var unreviewed_annotations: Double
}

object AnonHot {
  @scala.inline
  def apply(hot: Boolean, pageviews: Double, unreviewed_annotations: Double): AnonHot = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHot]
  }
}

