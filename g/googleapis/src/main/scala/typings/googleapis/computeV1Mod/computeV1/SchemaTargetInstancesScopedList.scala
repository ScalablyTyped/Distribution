package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetInstancesScopedList extends StObject {
  
  /**
    * A list of target instances contained in this scope.
    */
  var targetInstances: js.UndefOr[js.Array[SchemaTargetInstance]] = js.undefined
  
  /**
    * Informational warning which replaces the list of addresses when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaTargetInstancesScopedList {
  
  inline def apply(): SchemaTargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetInstancesScopedList]
  }
  
  extension [Self <: SchemaTargetInstancesScopedList](x: Self) {
    
    inline def setTargetInstances(value: js.Array[SchemaTargetInstance]): Self = StObject.set(x, "targetInstances", value.asInstanceOf[js.Any])
    
    inline def setTargetInstancesUndefined: Self = StObject.set(x, "targetInstances", js.undefined)
    
    inline def setTargetInstancesVarargs(value: SchemaTargetInstance*): Self = StObject.set(x, "targetInstances", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
