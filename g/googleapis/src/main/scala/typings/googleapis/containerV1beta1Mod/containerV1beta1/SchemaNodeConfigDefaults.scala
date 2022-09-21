package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeConfigDefaults extends StObject {
  
  /**
    * GCFS (Google Container File System, also known as Riptide) options.
    */
  var gcfsConfig: js.UndefOr[SchemaGcfsConfig] = js.undefined
}
object SchemaNodeConfigDefaults {
  
  inline def apply(): SchemaNodeConfigDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeConfigDefaults]
  }
  
  extension [Self <: SchemaNodeConfigDefaults](x: Self) {
    
    inline def setGcfsConfig(value: SchemaGcfsConfig): Self = StObject.set(x, "gcfsConfig", value.asInstanceOf[js.Any])
    
    inline def setGcfsConfigUndefined: Self = StObject.set(x, "gcfsConfig", js.undefined)
  }
}
