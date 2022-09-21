package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedulingConfig extends StObject {
  
  /**
    * Defines whether the node is preemptible.
    */
  var preemptible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the node is created under a reservation.
    */
  var reserved: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSchedulingConfig {
  
  inline def apply(): SchemaSchedulingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingConfig]
  }
  
  extension [Self <: SchemaSchedulingConfig](x: Self) {
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleNull: Self = StObject.set(x, "preemptible", null)
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedNull: Self = StObject.set(x, "reserved", null)
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
  }
}
