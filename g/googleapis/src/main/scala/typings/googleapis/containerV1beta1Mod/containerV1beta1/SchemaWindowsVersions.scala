package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWindowsVersions extends StObject {
  
  /**
    * List of Windows server versions.
    */
  var windowsVersions: js.UndefOr[js.Array[SchemaWindowsVersion]] = js.undefined
}
object SchemaWindowsVersions {
  
  inline def apply(): SchemaWindowsVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsVersions]
  }
  
  extension [Self <: SchemaWindowsVersions](x: Self) {
    
    inline def setWindowsVersions(value: js.Array[SchemaWindowsVersion]): Self = StObject.set(x, "windowsVersions", value.asInstanceOf[js.Any])
    
    inline def setWindowsVersionsUndefined: Self = StObject.set(x, "windowsVersions", js.undefined)
    
    inline def setWindowsVersionsVarargs(value: SchemaWindowsVersion*): Self = StObject.set(x, "windowsVersions", js.Array(value*))
  }
}
