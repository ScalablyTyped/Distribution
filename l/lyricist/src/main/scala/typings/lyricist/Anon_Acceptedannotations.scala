package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acceptedannotations extends js.Object {
  var accepted_annotations: Double
  var contributors: Double
  var hot: Boolean
  var iq_earners: Double
  var pageviews: Double
  var transcribers: Double
  var unreviewed_annotations: Double
  var verified_annotations: Double
}

object Anon_Acceptedannotations {
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
  ): Anon_Acceptedannotations = {
    val __obj = js.Dynamic.literal(accepted_annotations = accepted_annotations, contributors = contributors, hot = hot, iq_earners = iq_earners, pageviews = pageviews, transcribers = transcribers, unreviewed_annotations = unreviewed_annotations, verified_annotations = verified_annotations)
  
    __obj.asInstanceOf[Anon_Acceptedannotations]
  }
}

