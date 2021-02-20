package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationStatuses extends StObject {
  
  var `destination-uri`: js.UndefOr[String] = js.native
  
  var `images-completed`: js.UndefOr[Double] = js.native
  
  var `transmission-status`: js.UndefOr[TransmissionStatus] = js.native
}
object DestinationStatuses {
  
  @scala.inline
  def apply(): DestinationStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationStatuses]
  }
  
  @scala.inline
  implicit class DestinationStatusesMutableBuilder[Self <: DestinationStatuses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setDestination-uri`(value: String): Self = StObject.set(x, "destination-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-uriUndefined`: Self = StObject.set(x, "destination-uri", js.undefined)
    
    @scala.inline
    def `setImages-completed`(value: Double): Self = StObject.set(x, "images-completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImages-completedUndefined`: Self = StObject.set(x, "images-completed", js.undefined)
    
    @scala.inline
    def `setTransmission-status`(value: TransmissionStatus): Self = StObject.set(x, "transmission-status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransmission-statusUndefined`: Self = StObject.set(x, "transmission-status", js.undefined)
  }
}
