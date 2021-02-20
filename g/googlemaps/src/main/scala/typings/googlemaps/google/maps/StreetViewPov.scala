package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewPov extends StObject {
  
  var heading: js.UndefOr[Double] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
}
object StreetViewPov {
  
  @scala.inline
  def apply(): StreetViewPov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPov]
  }
  
  @scala.inline
  implicit class StreetViewPovMutableBuilder[Self <: StreetViewPov] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
  }
}
