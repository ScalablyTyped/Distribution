package typings.jqueryGrowl

import typings.jqueryGrowl.growl.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def growl(options: Options): Unit
  @JSName("growl")
  var growl_Original: growl
}
object JQueryStatic {
  
  @scala.inline
  def apply(growl: growl): JQueryStatic = {
    val __obj = js.Dynamic.literal(growl = growl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrowl(value: growl): Self = StObject.set(x, "growl", value.asInstanceOf[js.Any])
  }
}
