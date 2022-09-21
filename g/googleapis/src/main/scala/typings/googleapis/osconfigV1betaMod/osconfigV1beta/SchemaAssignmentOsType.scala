package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssignmentOsType extends StObject {
  
  /**
    * Targets VM instances with OS Inventory enabled and having the following OS architecture.
    */
  var osArchitecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
    */
  var osShortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Targets VM instances with OS Inventory enabled and having the following following OS version.
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaAssignmentOsType {
  
  inline def apply(): SchemaAssignmentOsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignmentOsType]
  }
  
  extension [Self <: SchemaAssignmentOsType](x: Self) {
    
    inline def setOsArchitecture(value: String): Self = StObject.set(x, "osArchitecture", value.asInstanceOf[js.Any])
    
    inline def setOsArchitectureNull: Self = StObject.set(x, "osArchitecture", null)
    
    inline def setOsArchitectureUndefined: Self = StObject.set(x, "osArchitecture", js.undefined)
    
    inline def setOsShortName(value: String): Self = StObject.set(x, "osShortName", value.asInstanceOf[js.Any])
    
    inline def setOsShortNameNull: Self = StObject.set(x, "osShortName", null)
    
    inline def setOsShortNameUndefined: Self = StObject.set(x, "osShortName", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
  }
}
