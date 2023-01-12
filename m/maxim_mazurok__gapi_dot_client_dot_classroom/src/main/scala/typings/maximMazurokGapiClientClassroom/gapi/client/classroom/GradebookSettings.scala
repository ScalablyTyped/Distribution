package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradebookSettings extends StObject {
  
  /** Indicates how the overall grade is calculated. */
  var calculationType: js.UndefOr[String] = js.undefined
  
  /** Indicates who can see the overall grade.. */
  var displaySetting: js.UndefOr[String] = js.undefined
  
  /** Grade categories that are available for coursework in the course. */
  var gradeCategories: js.UndefOr[js.Array[GradeCategory]] = js.undefined
}
object GradebookSettings {
  
  inline def apply(): GradebookSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradebookSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradebookSettings] (val x: Self) extends AnyVal {
    
    inline def setCalculationType(value: String): Self = StObject.set(x, "calculationType", value.asInstanceOf[js.Any])
    
    inline def setCalculationTypeUndefined: Self = StObject.set(x, "calculationType", js.undefined)
    
    inline def setDisplaySetting(value: String): Self = StObject.set(x, "displaySetting", value.asInstanceOf[js.Any])
    
    inline def setDisplaySettingUndefined: Self = StObject.set(x, "displaySetting", js.undefined)
    
    inline def setGradeCategories(value: js.Array[GradeCategory]): Self = StObject.set(x, "gradeCategories", value.asInstanceOf[js.Any])
    
    inline def setGradeCategoriesUndefined: Self = StObject.set(x, "gradeCategories", js.undefined)
    
    inline def setGradeCategoriesVarargs(value: GradeCategory*): Self = StObject.set(x, "gradeCategories", js.Array(value*))
  }
}
