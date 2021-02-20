package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineOptions extends PathOptions {
  
  var noClip: js.UndefOr[Boolean] = js.native
  
  var smoothFactor: js.UndefOr[Double] = js.native
}
object PolylineOptions {
  
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  @scala.inline
  implicit class PolylineOptionsMutableBuilder[Self <: PolylineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoClip(value: Boolean): Self = StObject.set(x, "noClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoClipUndefined: Self = StObject.set(x, "noClip", js.undefined)
    
    @scala.inline
    def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
  }
}
