package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.materialUiCore.withStylesMod.StyleRules
import typings.materialUiCore.withStylesMod.StyleRulesCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classes[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] extends StObject {
  
  var classes: ClassNameMap[_ | T] = js.native
}
object Classes {
  
  @scala.inline
  def apply[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */](classes: ClassNameMap[_ | T]): Classes[T] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[T]]
  }
  
  @scala.inline
  implicit class ClassesMutableBuilder[Self <: Classes[_], T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] (val x: Self with Classes[T]) extends AnyVal {
    
    @scala.inline
    def setClasses(value: ClassNameMap[_ | T]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
  }
}
