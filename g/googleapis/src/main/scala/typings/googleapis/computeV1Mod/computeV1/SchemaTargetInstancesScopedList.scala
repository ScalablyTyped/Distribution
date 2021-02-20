package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetInstancesScopedList extends StObject {
  
  /**
    * A list of target instances contained in this scope.
    */
  var targetInstances: js.UndefOr[js.Array[SchemaTargetInstance]] = js.native
  
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaTargetInstancesScopedList {
  
  @scala.inline
  def apply(): SchemaTargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetInstancesScopedList]
  }
  
  @scala.inline
  implicit class SchemaTargetInstancesScopedListMutableBuilder[Self <: SchemaTargetInstancesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetInstances(value: js.Array[SchemaTargetInstance]): Self = StObject.set(x, "targetInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetInstancesUndefined: Self = StObject.set(x, "targetInstances", js.undefined)
    
    @scala.inline
    def setTargetInstancesVarargs(value: SchemaTargetInstance*): Self = StObject.set(x, "targetInstances", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
