package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthority extends StObject {
  
  /**
    * Hint hints at the purpose of the attestation authority.
    */
  var hint: js.UndefOr[SchemaHint] = js.undefined
}
object SchemaAuthority {
  
  inline def apply(): SchemaAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthority]
  }
  
  extension [Self <: SchemaAuthority](x: Self) {
    
    inline def setHint(value: SchemaHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
