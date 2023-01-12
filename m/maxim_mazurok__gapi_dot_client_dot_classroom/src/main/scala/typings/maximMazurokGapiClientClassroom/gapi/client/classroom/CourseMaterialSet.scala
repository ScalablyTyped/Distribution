package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CourseMaterialSet extends StObject {
  
  /** Materials attached to this set. */
  var materials: js.UndefOr[js.Array[CourseMaterial]] = js.undefined
  
  /** Title for this set. */
  var title: js.UndefOr[String] = js.undefined
}
object CourseMaterialSet {
  
  inline def apply(): CourseMaterialSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseMaterialSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CourseMaterialSet] (val x: Self) extends AnyVal {
    
    inline def setMaterials(value: js.Array[CourseMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: CourseMaterial*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
