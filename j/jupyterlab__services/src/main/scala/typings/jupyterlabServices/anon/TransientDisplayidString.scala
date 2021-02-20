package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransientDisplayidString extends StObject {
  
  var transient: DisplayidString = js.native
}
object TransientDisplayidString {
  
  @scala.inline
  def apply(transient: DisplayidString): TransientDisplayidString = {
    val __obj = js.Dynamic.literal(transient = transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransientDisplayidString]
  }
  
  @scala.inline
  implicit class TransientDisplayidStringMutableBuilder[Self <: TransientDisplayidString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransient(value: DisplayidString): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
  }
}
