package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to the external linked source content.
  */
trait SchemaLinkedContentReference extends StObject {
  
  /**
    * A reference to the linked chart.
    */
  var sheetsChartReference: js.UndefOr[SchemaSheetsChartReference] = js.undefined
}
object SchemaLinkedContentReference {
  
  @scala.inline
  def apply(): SchemaLinkedContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedContentReference]
  }
  
  @scala.inline
  implicit class SchemaLinkedContentReferenceMutableBuilder[Self <: SchemaLinkedContentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetsChartReference(value: SchemaSheetsChartReference): Self = StObject.set(x, "sheetsChartReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChartReferenceUndefined: Self = StObject.set(x, "sheetsChartReference", js.undefined)
  }
}
