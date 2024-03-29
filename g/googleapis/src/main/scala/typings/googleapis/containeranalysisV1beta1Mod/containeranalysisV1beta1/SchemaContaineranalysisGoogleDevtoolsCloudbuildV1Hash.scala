package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash extends StObject {
  
  /**
    * The type of hash that was performed.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hash value.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Hash](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
