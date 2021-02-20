package typings.lokijs.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lastsave extends StObject {
  
  var lastsave: Date = js.native
  
  var savecount: Double = js.native
  
  var value: String = js.native
}
object Lastsave {
  
  @scala.inline
  def apply(lastsave: Date, savecount: Double, value: String): Lastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave.asInstanceOf[js.Any], savecount = savecount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastsave]
  }
  
  @scala.inline
  implicit class LastsaveMutableBuilder[Self <: Lastsave] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastsave(value: Date): Self = StObject.set(x, "lastsave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavecount(value: Double): Self = StObject.set(x, "savecount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
