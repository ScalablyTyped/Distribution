package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceSplitShard extends StObject {
  
  /**
    * DEPRECATED
    */
  var derivationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DEPRECATED
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaSourceSplitShard {
  
  inline def apply(): SchemaSourceSplitShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitShard]
  }
  
  extension [Self <: SchemaSourceSplitShard](x: Self) {
    
    inline def setDerivationMode(value: String): Self = StObject.set(x, "derivationMode", value.asInstanceOf[js.Any])
    
    inline def setDerivationModeNull: Self = StObject.set(x, "derivationMode", null)
    
    inline def setDerivationModeUndefined: Self = StObject.set(x, "derivationMode", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
