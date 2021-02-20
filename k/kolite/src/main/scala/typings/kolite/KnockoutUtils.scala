package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutUtils extends StObject {
  
  def wrapAccessor(accessor: js.Any): js.Function = js.native
}
object KnockoutUtils {
  
  @scala.inline
  def apply(wrapAccessor: js.Any => js.Function): KnockoutUtils = {
    val __obj = js.Dynamic.literal(wrapAccessor = js.Any.fromFunction1(wrapAccessor))
    __obj.asInstanceOf[KnockoutUtils]
  }
  
  @scala.inline
  implicit class KnockoutUtilsMutableBuilder[Self <: KnockoutUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapAccessor(value: js.Any => js.Function): Self = StObject.set(x, "wrapAccessor", js.Any.fromFunction1(value))
  }
}
