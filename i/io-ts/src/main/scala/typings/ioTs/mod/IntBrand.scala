package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntBrand extends StObject {
  
  val Int: js.Symbol
}
object IntBrand {
  
  @scala.inline
  def apply(Int: js.Symbol): IntBrand = {
    val __obj = js.Dynamic.literal(Int = Int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntBrand]
  }
  
  @scala.inline
  implicit class IntBrandMutableBuilder[Self <: IntBrand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInt(value: js.Symbol): Self = StObject.set(x, "Int", value.asInstanceOf[js.Any])
  }
}
