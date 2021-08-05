package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acceptedannotations extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Acceptedannotations](x: Self) {
    
    inline def setAccepted_annotations(value: Double): Self = StObject.set(x, "accepted_annotations", value.asInstanceOf[js.Any])
    
    inline def setContributors(value: Double): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    inline def setIq_earners(value: Double): Self = StObject.set(x, "iq_earners", value.asInstanceOf[js.Any])
    
    inline def setPageviews(value: Double): Self = StObject.set(x, "pageviews", value.asInstanceOf[js.Any])
    
    inline def setTranscribers(value: Double): Self = StObject.set(x, "transcribers", value.asInstanceOf[js.Any])
    
    inline def setUnreviewed_annotations(value: Double): Self = StObject.set(x, "unreviewed_annotations", value.asInstanceOf[js.Any])
    
    inline def setVerified_annotations(value: Double): Self = StObject.set(x, "verified_annotations", value.asInstanceOf[js.Any])
  }
}
