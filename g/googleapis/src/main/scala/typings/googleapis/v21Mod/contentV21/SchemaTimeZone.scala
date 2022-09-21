package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeZone extends StObject {
  
  /**
    * IANA Time Zone Database time zone, e.g. "America/New_York".
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. IANA Time Zone Database version number, e.g. "2019a".
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeZone {
  
  inline def apply(): SchemaTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeZone]
  }
  
  extension [Self <: SchemaTimeZone](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
