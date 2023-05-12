package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  backgroundColor :string,   border :std.Partial<{  width :number,   radius :number,   color :string}>}> */
trait PartialbackgroundColorstr extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[Partialwidthnumberradiusn] = js.undefined
}
object PartialbackgroundColorstr {
  
  inline def apply(): PartialbackgroundColorstr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialbackgroundColorstr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialbackgroundColorstr] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: Partialwidthnumberradiusn): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
