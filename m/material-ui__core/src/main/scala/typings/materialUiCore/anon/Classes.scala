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
  
  @scala.inline
  def apply[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */](classes: ClassNameMap[js.Any | T]): Classes[T] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[T]]
  }
  
  @scala.inline
  implicit class ClassesMutableBuilder[Self <: Classes[?], T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] (val x: Self & Classes[T]) extends AnyVal {
    
    @scala.inline
    def setClasses(value: ClassNameMap[js.Any | T]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
  }
}
