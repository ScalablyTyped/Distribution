package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkedContentReference extends StObject {
  
  /**
    * A reference to the linked chart.
    */
  var sheetsChartReference: js.UndefOr[SchemaSheetsChartReference] = js.undefined
}
object SchemaLinkedContentReference {
  
  inline def apply(): SchemaLinkedContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedContentReference]
  }
  
  extension [Self <: SchemaLinkedContentReference](x: Self) {
    
    inline def setSheetsChartReference(value: SchemaSheetsChartReference): Self = StObject.set(x, "sheetsChartReference", value.asInstanceOf[js.Any])
    
    inline def setSheetsChartReferenceUndefined: Self = StObject.set(x, "sheetsChartReference", js.undefined)
  }
}
