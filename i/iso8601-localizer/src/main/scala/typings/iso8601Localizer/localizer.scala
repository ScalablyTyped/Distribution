package typings.iso8601Localizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait localizer extends StObject {
  
  def localize(): String = js.native
  
  def returnAs(as: String): localizer = js.native
  
  def to(offset: Double): localizer = js.native
}
object localizer {
  
  @scala.inline
  def apply(localize: () => String, returnAs: String => localizer, to: Double => localizer): localizer = {
    val __obj = js.Dynamic.literal(localize = js.Any.fromFunction0(localize), returnAs = js.Any.fromFunction1(returnAs), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[localizer]
  }
  
  @scala.inline
  implicit class localizerMutableBuilder[Self <: localizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalize(value: () => String): Self = StObject.set(x, "localize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReturnAs(value: String => localizer): Self = StObject.set(x, "returnAs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: Double => localizer): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
  }
}
