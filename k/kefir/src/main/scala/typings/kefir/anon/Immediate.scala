package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Immediate extends StObject {
  
  var immediate: Boolean
}
object Immediate {
  
  @scala.inline
  def apply(immediate: Boolean): Immediate = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immediate]
  }
  
  @scala.inline
  implicit class ImmediateMutableBuilder[Self <: Immediate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
  }
}
