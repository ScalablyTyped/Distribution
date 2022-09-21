package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAnnotationspecsetsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. AnnotationSpec resource name, format: `projects/{project_id\}/annotationSpecSets/{annotation_spec_set_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAnnotationspecsetsDelete {
  
  inline def apply(): ParamsResourceProjectsAnnotationspecsetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAnnotationspecsetsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsAnnotationspecsetsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
