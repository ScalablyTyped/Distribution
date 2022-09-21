package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdInfoObject extends StObject {
  
  @JSName(" support-url ")
  var `Spacesupport-url `: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var os: js.UndefOr[String] = js.undefined
  
  var vendor: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object IdInfoObject {
  
  inline def apply(): IdInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdInfoObject]
  }
  
  extension [Self <: IdInfoObject](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def `setSpacesupport-url `(value: String): Self = StObject.set(x, " support-url ", value.asInstanceOf[js.Any])
    
    inline def `setSpacesupport-url Undefined`: Self = StObject.set(x, " support-url ", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
