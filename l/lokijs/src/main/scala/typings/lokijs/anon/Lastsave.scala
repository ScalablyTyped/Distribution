package typings.lokijs.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastsave extends StObject {
  
  var lastsave: Date
  
  var savecount: Double
  
  var value: String
}
object Lastsave {
  
  inline def apply(lastsave: Date, savecount: Double, value: String): Lastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave.asInstanceOf[js.Any], savecount = savecount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastsave]
  }
  
  extension [Self <: Lastsave](x: Self) {
    
    inline def setLastsave(value: Date): Self = StObject.set(x, "lastsave", value.asInstanceOf[js.Any])
    
    inline def setSavecount(value: Double): Self = StObject.set(x, "savecount", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
