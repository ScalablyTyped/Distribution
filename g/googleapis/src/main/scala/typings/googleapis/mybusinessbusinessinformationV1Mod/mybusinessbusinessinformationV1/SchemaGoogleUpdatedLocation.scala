package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleUpdatedLocation extends StObject {
  
  /**
    * The fields that Google updated.
    */
  var diffMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google-updated version of this location.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * The fields that have pending edits that haven't yet been pushed to Maps and Search.
    */
  var pendingMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleUpdatedLocation {
  
  inline def apply(): SchemaGoogleUpdatedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleUpdatedLocation]
  }
  
  extension [Self <: SchemaGoogleUpdatedLocation](x: Self) {
    
    inline def setDiffMask(value: String): Self = StObject.set(x, "diffMask", value.asInstanceOf[js.Any])
    
    inline def setDiffMaskNull: Self = StObject.set(x, "diffMask", null)
    
    inline def setDiffMaskUndefined: Self = StObject.set(x, "diffMask", js.undefined)
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPendingMask(value: String): Self = StObject.set(x, "pendingMask", value.asInstanceOf[js.Any])
    
    inline def setPendingMaskNull: Self = StObject.set(x, "pendingMask", null)
    
    inline def setPendingMaskUndefined: Self = StObject.set(x, "pendingMask", js.undefined)
  }
}
