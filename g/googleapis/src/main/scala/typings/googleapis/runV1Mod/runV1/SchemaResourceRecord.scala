package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceRecord extends StObject {
  
  /**
    * Relative name of the object affected by this record. Only applicable for `CNAME` records. Example: 'www'.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1).
    */
  var rrdata: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource record type. Example: `AAAA`.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceRecord {
  
  inline def apply(): SchemaResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecord]
  }
  
  extension [Self <: SchemaResourceRecord](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRrdata(value: String): Self = StObject.set(x, "rrdata", value.asInstanceOf[js.Any])
    
    inline def setRrdataNull: Self = StObject.set(x, "rrdata", null)
    
    inline def setRrdataUndefined: Self = StObject.set(x, "rrdata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
