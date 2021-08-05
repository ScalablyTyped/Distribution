package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatingSystem extends StObject {
  
  /** DART ID of this operating system. This is the ID used for targeting. */
  var dartId: js.UndefOr[String] = js.undefined
  
  /** Whether this operating system is for desktop. */
  var desktop: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystem". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether this operating system is for mobile. */
  var mobile: js.UndefOr[Boolean] = js.undefined
  
  /** Name of this operating system. */
  var name: js.UndefOr[String] = js.undefined
}
object OperatingSystem {
  
  inline def apply(): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystem]
  }
  
  extension [Self <: OperatingSystem](x: Self) {
    
    inline def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    inline def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
