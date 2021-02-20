package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image annotation.
  */
@js.native
trait SchemaImageAnnotation extends StObject {
  
  /**
    * The list of polygons outlining the sensitive regions in the image.
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaBoundingPoly]] = js.native
}
object SchemaImageAnnotation {
  
  @scala.inline
  def apply(): SchemaImageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageAnnotation]
  }
  
  @scala.inline
  implicit class SchemaImageAnnotationMutableBuilder[Self <: SchemaImageAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPolys(value: js.Array[SchemaBoundingPoly]): Self = StObject.set(x, "boundingPolys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolysUndefined: Self = StObject.set(x, "boundingPolys", js.undefined)
    
    @scala.inline
    def setBoundingPolysVarargs(value: SchemaBoundingPoly*): Self = StObject.set(x, "boundingPolys", js.Array(value :_*))
  }
}
