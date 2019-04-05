package typings
package lyricistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hot extends js.Object {
  var hot: scala.Boolean
  var pageviews: scala.Double
  var unreviewed_annotations: scala.Double
}

object Anon_Hot {
  @scala.inline
  def apply(hot: scala.Boolean, pageviews: scala.Double, unreviewed_annotations: scala.Double): Anon_Hot = {
    val __obj = js.Dynamic.literal(hot = hot, pageviews = pageviews, unreviewed_annotations = unreviewed_annotations)
  
    __obj.asInstanceOf[Anon_Hot]
  }
}

