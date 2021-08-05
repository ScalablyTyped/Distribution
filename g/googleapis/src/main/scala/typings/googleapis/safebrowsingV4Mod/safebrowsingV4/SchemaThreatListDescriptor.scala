package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes an individual threat list. A list is defined by three parameters:
  * the type of threat posed, the type of platform targeted by the threat, and
  * the type of entries in the list.
  */
trait SchemaThreatListDescriptor extends StObject {
  
  /**
    * The platform type targeted by the list&#39;s entries.
    */
  var platformType: js.UndefOr[String] = js.undefined
  
  /**
    * The entry types contained in the list.
    */
  var threatEntryType: js.UndefOr[String] = js.undefined
  
  /**
    * The threat type posed by the list&#39;s entries.
    */
  var threatType: js.UndefOr[String] = js.undefined
}
object SchemaThreatListDescriptor {
  
  inline def apply(): SchemaThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatListDescriptor]
  }
  
  extension [Self <: SchemaThreatListDescriptor](x: Self) {
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    inline def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
