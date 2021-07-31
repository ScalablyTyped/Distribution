package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Computed
trait KnockoutComputedStatic extends StObject {
  
  var deferUpdates: Boolean
}
object KnockoutComputedStatic {
  
  @scala.inline
  def apply(deferUpdates: Boolean): KnockoutComputedStatic = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutComputedStatic]
  }
  
  @scala.inline
  implicit class KnockoutComputedStaticMutableBuilder[Self <: KnockoutComputedStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferUpdates(value: Boolean): Self = StObject.set(x, "deferUpdates", value.asInstanceOf[js.Any])
  }
}
