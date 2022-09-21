package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJSON extends StObject {
  
  var raw: js.UndefOr[String | Null] = js.undefined
}
object SchemaJSON {
  
  inline def apply(): SchemaJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJSON]
  }
  
  extension [Self <: SchemaJSON](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawNull: Self = StObject.set(x, "raw", null)
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
