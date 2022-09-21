package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuccessDetail extends StObject {
  
  /**
    * If a native process other than the app crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSuccessDetail {
  
  inline def apply(): SchemaSuccessDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuccessDetail]
  }
  
  extension [Self <: SchemaSuccessDetail](x: Self) {
    
    inline def setOtherNativeCrash(value: Boolean): Self = StObject.set(x, "otherNativeCrash", value.asInstanceOf[js.Any])
    
    inline def setOtherNativeCrashNull: Self = StObject.set(x, "otherNativeCrash", null)
    
    inline def setOtherNativeCrashUndefined: Self = StObject.set(x, "otherNativeCrash", js.undefined)
  }
}
