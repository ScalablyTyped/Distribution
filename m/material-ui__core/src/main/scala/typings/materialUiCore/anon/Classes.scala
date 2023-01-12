package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes[StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */] extends StObject {
  
  var classes: ClassNameMap[ClassKeyOfStyles[StylesOrClassKey]]
}
object Classes {
  
  inline def apply[StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */](classes: ClassNameMap[ClassKeyOfStyles[StylesOrClassKey]]): Classes[StylesOrClassKey] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[StylesOrClassKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classes[?], StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */] (val x: Self & Classes[StylesOrClassKey]) extends AnyVal {
    
    inline def setClasses(value: ClassNameMap[ClassKeyOfStyles[StylesOrClassKey]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
  }
}
