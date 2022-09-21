package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTombstoneMetadata extends StObject {
  
  /**
    * Indicates the type of Tombstone.
    */
  var tombstoneType: js.UndefOr[String | Null] = js.undefined
}
object SchemaTombstoneMetadata {
  
  inline def apply(): SchemaTombstoneMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTombstoneMetadata]
  }
  
  extension [Self <: SchemaTombstoneMetadata](x: Self) {
    
    inline def setTombstoneType(value: String): Self = StObject.set(x, "tombstoneType", value.asInstanceOf[js.Any])
    
    inline def setTombstoneTypeNull: Self = StObject.set(x, "tombstoneType", null)
    
    inline def setTombstoneTypeUndefined: Self = StObject.set(x, "tombstoneType", js.undefined)
  }
}
