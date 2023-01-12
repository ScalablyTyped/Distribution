package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastsave extends StObject {
  
  var lastsave: js.Date
  
  var savecount: Double
  
  var value: String
}
object Lastsave {
  
  inline def apply(lastsave: js.Date, savecount: Double, value: String): Lastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave.asInstanceOf[js.Any], savecount = savecount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastsave]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lastsave] (val x: Self) extends AnyVal {
    
    inline def setLastsave(value: js.Date): Self = StObject.set(x, "lastsave", value.asInstanceOf[js.Any])
    
    inline def setSavecount(value: Double): Self = StObject.set(x, "savecount", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
