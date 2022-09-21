package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLayoutProperties extends StObject {
  
  /**
    * The human-readable name of the layout.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object ID of the master that this layout is based on.
    */
  var masterObjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the layout.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaLayoutProperties {
  
  inline def apply(): SchemaLayoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutProperties]
  }
  
  extension [Self <: SchemaLayoutProperties](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
    
    inline def setMasterObjectIdNull: Self = StObject.set(x, "masterObjectId", null)
    
    inline def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
