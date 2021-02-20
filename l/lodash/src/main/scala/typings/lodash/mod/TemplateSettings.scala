package typings.lodash.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * By default, the template delimiters used by Lo-Dash are similar to those in embedded Ruby
  * (ERB). Change the following template settings to use alternative delimiters.
  **/
@js.native
trait TemplateSettings extends StObject {
  
  /**
    * The "escape" delimiter.
    **/
  var escape: js.UndefOr[RegExp] = js.native
  
  /**
    * The "evaluate" delimiter.
    **/
  var evaluate: js.UndefOr[RegExp] = js.native
  
  /**
    * An object to import into the template as local variables.
    */
  var imports: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * The "interpolate" delimiter.
    */
  var interpolate: js.UndefOr[RegExp] = js.native
  
  /**
    * Used to reference the data object in the template text.
    */
  var variable: js.UndefOr[java.lang.String] = js.native
}
object TemplateSettings {
  
  @scala.inline
  def apply(): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSettings]
  }
  
  @scala.inline
  implicit class TemplateSettingsMutableBuilder[Self <: TemplateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscape(value: RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    @scala.inline
    def setEvaluate(value: RegExp): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
    
    @scala.inline
    def setImports(value: Dictionary[_]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setInterpolate(value: RegExp): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    @scala.inline
    def setVariable(value: java.lang.String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
