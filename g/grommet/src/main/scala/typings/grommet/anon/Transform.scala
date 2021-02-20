package typings.grommet.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends StObject {
  
  var property: String = js.native
  
  def transform(args: js.Any*): ReactNode = js.native
}
object Transform {
  
  @scala.inline
  def apply(property: String, transform: /* repeated */ js.Any => ReactNode): Transform = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: /* repeated */ js.Any => ReactNode): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
  }
}
