package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hot extends js.Object {
  var hot: Boolean
  var pageviews: Double
  var unreviewed_annotations: Double
}

object Hot {
  @scala.inline
  def apply(hot: Boolean, pageviews: Double, unreviewed_annotations: Double): Hot = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hot]
  }
}

