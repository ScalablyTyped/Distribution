package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import typings.jsdom.jsdomInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRange extends StObject {
  
  /* standard dom */
  val END_TO_END: `2`
  
  /* standard dom */
  val END_TO_START: `3`
  
  /* standard dom */
  val START_TO_END: `1`
  
  /* standard dom */
  val START_TO_START: `0`
}
object TypeofRange {
  
  inline def apply(): TypeofRange = {
    val __obj = js.Dynamic.literal(END_TO_END = 2, END_TO_START = 3, START_TO_END = 1, START_TO_START = 0)
    __obj.asInstanceOf[TypeofRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRange] (val x: Self) extends AnyVal {
    
    inline def setEND_TO_END(value: `2`): Self = StObject.set(x, "END_TO_END", value.asInstanceOf[js.Any])
    
    inline def setEND_TO_START(value: `3`): Self = StObject.set(x, "END_TO_START", value.asInstanceOf[js.Any])
    
    inline def setSTART_TO_END(value: `1`): Self = StObject.set(x, "START_TO_END", value.asInstanceOf[js.Any])
    
    inline def setSTART_TO_START(value: `0`): Self = StObject.set(x, "START_TO_START", value.asInstanceOf[js.Any])
  }
}
