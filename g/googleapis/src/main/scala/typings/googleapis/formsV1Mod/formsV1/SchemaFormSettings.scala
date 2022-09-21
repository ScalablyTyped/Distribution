package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFormSettings extends StObject {
  
  /**
    * Settings related to quiz forms and grading.
    */
  var quizSettings: js.UndefOr[SchemaQuizSettings] = js.undefined
}
object SchemaFormSettings {
  
  inline def apply(): SchemaFormSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormSettings]
  }
  
  extension [Self <: SchemaFormSettings](x: Self) {
    
    inline def setQuizSettings(value: SchemaQuizSettings): Self = StObject.set(x, "quizSettings", value.asInstanceOf[js.Any])
    
    inline def setQuizSettingsUndefined: Self = StObject.set(x, "quizSettings", js.undefined)
  }
}
