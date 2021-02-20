package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewLink extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var heading: js.UndefOr[Double] = js.native
  
  var pano: js.UndefOr[String] = js.native
}
object StreetViewLink {
  
  @scala.inline
  def apply(): StreetViewLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLink]
  }
  
  @scala.inline
  implicit class StreetViewLinkMutableBuilder[Self <: StreetViewLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
  }
}
