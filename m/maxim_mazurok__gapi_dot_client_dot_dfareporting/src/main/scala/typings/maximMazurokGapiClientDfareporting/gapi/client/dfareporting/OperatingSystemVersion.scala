package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatingSystemVersion extends StObject {
  
  /** ID of this operating system version. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemVersion". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Major version (leftmost number) of this operating system version. */
  var majorVersion: js.UndefOr[String] = js.undefined
  
  /** Minor version (number after the first dot) of this operating system version. */
  var minorVersion: js.UndefOr[String] = js.undefined
  
  /** Name of this operating system version. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Operating system of this operating system version. */
  var operatingSystem: js.UndefOr[OperatingSystem] = js.undefined
}
object OperatingSystemVersion {
  
  inline def apply(): OperatingSystemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemVersion]
  }
  
  extension [Self <: OperatingSystemVersion](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMinorVersion(value: String): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersionUndefined: Self = StObject.set(x, "minorVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
  }
}
