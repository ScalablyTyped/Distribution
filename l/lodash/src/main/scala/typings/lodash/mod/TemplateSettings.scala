package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * By default, the template delimiters used by Lo-Dash are similar to those in embedded Ruby
  * (ERB). Change the following template settings to use alternative delimiters.
  **/
trait TemplateSettings extends StObject {
  
  /**
    * The "escape" delimiter.
    **/
  var escape: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * The "evaluate" delimiter.
    **/
  var evaluate: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * An object to import into the template as local variables.
    */
  var imports: js.UndefOr[Dictionary[Any]] = js.undefined
  
  /**
    * The "interpolate" delimiter.
    */
  var interpolate: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * Used to reference the data object in the template text.
    */
  var variable: js.UndefOr[java.lang.String] = js.undefined
}
object TemplateSettings {
  
  inline def apply(): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSettings]
  }
  
  extension [Self <: TemplateSettings](x: Self) {
    
    inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setEvaluate(value: js.RegExp): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
    
    inline def setImports(value: Dictionary[Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setInterpolate(value: js.RegExp): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setVariable(value: java.lang.String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
