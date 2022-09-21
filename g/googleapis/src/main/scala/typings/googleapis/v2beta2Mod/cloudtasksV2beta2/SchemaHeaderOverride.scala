package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHeaderOverride extends StObject {
  
  /**
    * header embodying a key and a value.
    */
  var header: js.UndefOr[SchemaHeader] = js.undefined
}
object SchemaHeaderOverride {
  
  inline def apply(): SchemaHeaderOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeaderOverride]
  }
  
  extension [Self <: SchemaHeaderOverride](x: Self) {
    
    inline def setHeader(value: SchemaHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
