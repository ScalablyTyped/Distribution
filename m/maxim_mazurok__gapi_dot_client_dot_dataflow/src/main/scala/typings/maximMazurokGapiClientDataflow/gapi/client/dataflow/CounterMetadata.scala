package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterMetadata extends StObject {
  
  /** Human-readable description of the counter semantics. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Counter aggregation kind. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A string referring to the unit type. */
  var otherUnits: js.UndefOr[String] = js.undefined
  
  /** System defined Units, see above enum. */
  var standardUnits: js.UndefOr[String] = js.undefined
}
object CounterMetadata {
  
  @scala.inline
  def apply(): CounterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterMetadata]
  }
  
  @scala.inline
  implicit class CounterMetadataMutableBuilder[Self <: CounterMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOtherUnits(value: String): Self = StObject.set(x, "otherUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherUnitsUndefined: Self = StObject.set(x, "otherUnits", js.undefined)
    
    @scala.inline
    def setStandardUnits(value: String): Self = StObject.set(x, "standardUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUnitsUndefined: Self = StObject.set(x, "standardUnits", js.undefined)
  }
}
