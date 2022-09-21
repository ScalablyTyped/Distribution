package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfigDefaults extends StObject {
  
  /** GCFS (Google Container File System, also known as Riptide) options. */
  var gcfsConfig: js.UndefOr[GcfsConfig] = js.undefined
}
object NodeConfigDefaults {
  
  inline def apply(): NodeConfigDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigDefaults]
  }
  
  extension [Self <: NodeConfigDefaults](x: Self) {
    
    inline def setGcfsConfig(value: GcfsConfig): Self = StObject.set(x, "gcfsConfig", value.asInstanceOf[js.Any])
    
    inline def setGcfsConfigUndefined: Self = StObject.set(x, "gcfsConfig", js.undefined)
  }
}
