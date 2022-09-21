package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedulePolicy extends StObject {
  
  /**
    * The idle duration between replication stages.
    */
  var idleDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM's operating system undergoes changes and adaptations to fully function on Compute Engine.
    */
  var skipOsAdaptation: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSchedulePolicy {
  
  inline def apply(): SchemaSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulePolicy]
  }
  
  extension [Self <: SchemaSchedulePolicy](x: Self) {
    
    inline def setIdleDuration(value: String): Self = StObject.set(x, "idleDuration", value.asInstanceOf[js.Any])
    
    inline def setIdleDurationNull: Self = StObject.set(x, "idleDuration", null)
    
    inline def setIdleDurationUndefined: Self = StObject.set(x, "idleDuration", js.undefined)
    
    inline def setSkipOsAdaptation(value: Boolean): Self = StObject.set(x, "skipOsAdaptation", value.asInstanceOf[js.Any])
    
    inline def setSkipOsAdaptationNull: Self = StObject.set(x, "skipOsAdaptation", null)
    
    inline def setSkipOsAdaptationUndefined: Self = StObject.set(x, "skipOsAdaptation", js.undefined)
  }
}
