package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EaseLookup extends StObject {
  
  def find(name: String): Ease = js.native
}
object EaseLookup {
  
  @scala.inline
  def apply(find: String => Ease): EaseLookup = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[EaseLookup]
  }
  
  @scala.inline
  implicit class EaseLookupMutableBuilder[Self <: EaseLookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFind(value: String => Ease): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
  }
}
