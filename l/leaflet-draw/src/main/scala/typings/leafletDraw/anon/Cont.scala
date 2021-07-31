package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cont extends StObject {
  
  var cont: String
  
  var end: String
  
  var start: String
}
object Cont {
  
  @scala.inline
  def apply(cont: String, end: String, start: String): Cont = {
    val __obj = js.Dynamic.literal(cont = cont.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cont]
  }
  
  @scala.inline
  implicit class ContMutableBuilder[Self <: Cont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCont(value: String): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
