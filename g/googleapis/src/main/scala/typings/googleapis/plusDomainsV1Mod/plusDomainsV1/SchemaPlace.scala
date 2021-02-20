package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.Latitude
import typings.googleapis.anon.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPlace extends StObject {
  
  /**
    * The physical address of the place.
    */
  var address: js.UndefOr[`8`] = js.native
  
  /**
    * The display name of the place.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The id of the place.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies this resource as a place. Value: &quot;plus#place&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The position of the place.
    */
  var position: js.UndefOr[Latitude] = js.native
}
object SchemaPlace {
  
  @scala.inline
  def apply(): SchemaPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlace]
  }
  
  @scala.inline
  implicit class SchemaPlaceMutableBuilder[Self <: SchemaPlace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: `8`): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPosition(value: Latitude): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
