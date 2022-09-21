package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosTestLoop extends StObject {
  
  /**
    * Bundle ID of the app.
    */
  var bundleId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIosTestLoop {
  
  inline def apply(): SchemaIosTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosTestLoop]
  }
  
  extension [Self <: SchemaIosTestLoop](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
  }
}
