package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlatform extends StObject {
  
  /**
    * Platform name. Format is "{product\}/platforms/{platform\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of platform.
    */
  var platformType: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlatform {
  
  inline def apply(): SchemaPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatform]
  }
  
  extension [Self <: SchemaPlatform](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeNull: Self = StObject.set(x, "platformType", null)
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
  }
}
