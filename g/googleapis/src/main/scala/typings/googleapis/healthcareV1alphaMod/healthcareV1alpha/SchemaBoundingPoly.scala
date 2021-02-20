package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaBoundingPoly extends StObject {
  
  var label: js.UndefOr[String] = js.native
  
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.native
}
object SchemaBoundingPoly {
  
  @scala.inline
  def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  
  @scala.inline
  implicit class SchemaBoundingPolyMutableBuilder[Self <: SchemaBoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setVertices(value: js.Array[SchemaVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: SchemaVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
