package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image annotation.
  */
trait SchemaImageAnnotation extends StObject {
  
  /**
    * The list of polygons outlining the sensitive regions in the image.
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaBoundingPoly]] = js.undefined
}
object SchemaImageAnnotation {
  
  inline def apply(): SchemaImageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageAnnotation]
  }
  
  extension [Self <: SchemaImageAnnotation](x: Self) {
    
    inline def setBoundingPolys(value: js.Array[SchemaBoundingPoly]): Self = StObject.set(x, "boundingPolys", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolysUndefined: Self = StObject.set(x, "boundingPolys", js.undefined)
    
    inline def setBoundingPolysVarargs(value: SchemaBoundingPoly*): Self = StObject.set(x, "boundingPolys", js.Array(value :_*))
  }
}
