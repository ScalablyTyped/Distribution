package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hot extends js.Object {
  var hot: Boolean
  var pageviews: Double
  var unreviewed_annotations: Double
}

object Anon_Hot {
  @scala.inline
  def apply(hot: Boolean, pageviews: Double, unreviewed_annotations: Double): Anon_Hot = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hot]
  }
}

