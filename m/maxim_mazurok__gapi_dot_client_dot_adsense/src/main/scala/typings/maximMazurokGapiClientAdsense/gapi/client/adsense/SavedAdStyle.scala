package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedAdStyle extends StObject {
  
  /** The AdStyle itself. */
  var adStyle: js.UndefOr[AdStyle] = js.native
  
  /** Unique identifier of this saved ad style. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.native
  
  /** Kind of resource this is, in this case adsense#savedAdStyle. */
  var kind: js.UndefOr[String] = js.native
  
  /** The user selected name of this SavedAdStyle. */
  var name: js.UndefOr[String] = js.native
}
object SavedAdStyle {
  
  @scala.inline
  def apply(): SavedAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedAdStyle]
  }
  
  @scala.inline
  implicit class SavedAdStyleMutableBuilder[Self <: SavedAdStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdStyle(value: AdStyle): Self = StObject.set(x, "adStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdStyleUndefined: Self = StObject.set(x, "adStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
