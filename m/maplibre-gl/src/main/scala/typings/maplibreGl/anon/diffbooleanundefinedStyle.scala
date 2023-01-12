package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  diff :boolean | undefined} & maplibre-gl.maplibre-gl.StyleOptions */
trait diffbooleanundefinedStyle extends StObject {
  
  var diff: js.UndefOr[Boolean] = js.undefined
  
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[Boolean] = js.undefined
}
object diffbooleanundefinedStyle {
  
  inline def apply(): diffbooleanundefinedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[diffbooleanundefinedStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: diffbooleanundefinedStyle] (val x: Self) extends AnyVal {
    
    inline def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
    
    inline def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    inline def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
