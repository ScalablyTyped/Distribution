package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRange extends StObject {
  
  /* standard dom */
  val END_TO_END: Double
  
  /* standard dom */
  val END_TO_START: Double
  
  /* standard dom */
  val START_TO_END: Double
  
  /* standard dom */
  val START_TO_START: Double
}
object TypeofRange {
  
  inline def apply(END_TO_END: Double, END_TO_START: Double, START_TO_END: Double, START_TO_START: Double): TypeofRange = {
    val __obj = js.Dynamic.literal(END_TO_END = END_TO_END.asInstanceOf[js.Any], END_TO_START = END_TO_START.asInstanceOf[js.Any], START_TO_END = START_TO_END.asInstanceOf[js.Any], START_TO_START = START_TO_START.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRange] (val x: Self) extends AnyVal {
    
    inline def setEND_TO_END(value: Double): Self = StObject.set(x, "END_TO_END", value.asInstanceOf[js.Any])
    
    inline def setEND_TO_START(value: Double): Self = StObject.set(x, "END_TO_START", value.asInstanceOf[js.Any])
    
    inline def setSTART_TO_END(value: Double): Self = StObject.set(x, "START_TO_END", value.asInstanceOf[js.Any])
    
    inline def setSTART_TO_START(value: Double): Self = StObject.set(x, "START_TO_START", value.asInstanceOf[js.Any])
  }
}
