package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleOptions extends StObject {
  
  var transition: js.UndefOr[Boolean] = js.native
}
object StyleOptions {
  
  @scala.inline
  def apply(): StyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOptions]
  }
  
  @scala.inline
  implicit class StyleOptionsMutableBuilder[Self <: StyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
