package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acceptedannotations extends js.Object {
  var accepted_annotations: Double
  var contributors: Double
  var hot: Boolean
  var iq_earners: Double
  var pageviews: Double
  var transcribers: Double
  var unreviewed_annotations: Double
  var verified_annotations: Double
}

object Acceptedannotations {
  @scala.inline
  def apply(
    accepted_annotations: Double,
    contributors: Double,
    hot: Boolean,
    iq_earners: Double,
    pageviews: Double,
    transcribers: Double,
    unreviewed_annotations: Double,
    verified_annotations: Double
  ): Acceptedannotations = {
    val __obj = js.Dynamic.literal(accepted_annotations = accepted_annotations.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], iq_earners = iq_earners.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], transcribers = transcribers.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any], verified_annotations = verified_annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceptedannotations]
  }
}

