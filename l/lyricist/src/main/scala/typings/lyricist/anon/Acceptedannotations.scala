package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acceptedannotations extends StObject {
  
  var accepted_annotations: Double = js.native
  
  var contributors: Double = js.native
  
  var hot: Boolean = js.native
  
  var iq_earners: Double = js.native
  
  var pageviews: Double = js.native
  
  var transcribers: Double = js.native
  
  var unreviewed_annotations: Double = js.native
  
  var verified_annotations: Double = js.native
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
  
  @scala.inline
  implicit class AcceptedannotationsMutableBuilder[Self <: Acceptedannotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepted_annotations(value: Double): Self = StObject.set(x, "accepted_annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributors(value: Double): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIq_earners(value: Double): Self = StObject.set(x, "iq_earners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageviews(value: Double): Self = StObject.set(x, "pageviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscribers(value: Double): Self = StObject.set(x, "transcribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreviewed_annotations(value: Double): Self = StObject.set(x, "unreviewed_annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_annotations(value: Double): Self = StObject.set(x, "verified_annotations", value.asInstanceOf[js.Any])
  }
}
