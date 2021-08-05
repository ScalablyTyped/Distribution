package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.materialUiCore.withStylesMod.StyleRules
import typings.materialUiCore.withStylesMod.StyleRulesCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] extends StObject {
  
  var classes: ClassNameMap[js.Any | T]
}
object Classes {
  
  inline def apply[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */](classes: ClassNameMap[js.Any | T]): Classes[T] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[T]]
  }
  
  extension [Self <: Classes[?], T /* <: String | StyleRules[String] | StyleRulesCallback[String] */](x: Self & Classes[T]) {
    
    inline def setClasses(value: ClassNameMap[js.Any | T]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
  }
}
