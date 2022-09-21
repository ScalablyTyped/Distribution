package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSDKInfo extends StObject {
  
  /**
    * Required. The SDK Language.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The SDK version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaSDKInfo {
  
  inline def apply(): SchemaSDKInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSDKInfo]
  }
  
  extension [Self <: SchemaSDKInfo](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
