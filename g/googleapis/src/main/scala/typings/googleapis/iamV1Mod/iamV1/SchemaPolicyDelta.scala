package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The difference delta between two policies.
  */
@js.native
trait SchemaPolicyDelta extends StObject {
  
  /**
    * The delta for Bindings between two policies.
    */
  var bindingDeltas: js.UndefOr[js.Array[SchemaBindingDelta]] = js.native
}
object SchemaPolicyDelta {
  
  @scala.inline
  def apply(): SchemaPolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyDelta]
  }
  
  @scala.inline
  implicit class SchemaPolicyDeltaMutableBuilder[Self <: SchemaPolicyDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingDeltas(value: js.Array[SchemaBindingDelta]): Self = StObject.set(x, "bindingDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingDeltasUndefined: Self = StObject.set(x, "bindingDeltas", js.undefined)
    
    @scala.inline
    def setBindingDeltasVarargs(value: SchemaBindingDelta*): Self = StObject.set(x, "bindingDeltas", js.Array(value :_*))
  }
}
