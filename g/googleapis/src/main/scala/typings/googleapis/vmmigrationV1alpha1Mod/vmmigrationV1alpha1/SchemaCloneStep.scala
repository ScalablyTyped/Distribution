package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloneStep extends StObject {
  
  /**
    * Adapting OS step.
    */
  var adaptingOs: js.UndefOr[SchemaAdaptingOSStep] = js.undefined
  
  /**
    * The time the step has ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instantiating migrated VM step.
    */
  var instantiatingMigratedVm: js.UndefOr[SchemaInstantiatingMigratedVMStep] = js.undefined
  
  /**
    * Preparing VM disks step.
    */
  var preparingVmDisks: js.UndefOr[SchemaPreparingVMDisksStep] = js.undefined
  
  /**
    * The time the step has started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloneStep {
  
  inline def apply(): SchemaCloneStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneStep]
  }
  
  extension [Self <: SchemaCloneStep](x: Self) {
    
    inline def setAdaptingOs(value: SchemaAdaptingOSStep): Self = StObject.set(x, "adaptingOs", value.asInstanceOf[js.Any])
    
    inline def setAdaptingOsUndefined: Self = StObject.set(x, "adaptingOs", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInstantiatingMigratedVm(value: SchemaInstantiatingMigratedVMStep): Self = StObject.set(x, "instantiatingMigratedVm", value.asInstanceOf[js.Any])
    
    inline def setInstantiatingMigratedVmUndefined: Self = StObject.set(x, "instantiatingMigratedVm", js.undefined)
    
    inline def setPreparingVmDisks(value: SchemaPreparingVMDisksStep): Self = StObject.set(x, "preparingVmDisks", value.asInstanceOf[js.Any])
    
    inline def setPreparingVmDisksUndefined: Self = StObject.set(x, "preparingVmDisks", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
