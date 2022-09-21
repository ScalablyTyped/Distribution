package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDefaultSnatStatus extends StObject {
  
  /**
    * Disables cluster default sNAT rules.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDefaultSnatStatus {
  
  inline def apply(): SchemaDefaultSnatStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefaultSnatStatus]
  }
  
  extension [Self <: SchemaDefaultSnatStatus](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
