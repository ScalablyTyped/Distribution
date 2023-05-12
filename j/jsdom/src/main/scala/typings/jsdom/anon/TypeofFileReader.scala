package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFileReader extends StObject {
  
  /* standard dom */
  val DONE: `2`
  
  /* standard dom */
  val EMPTY: `0`
  
  /* standard dom */
  val LOADING: `1`
}
object TypeofFileReader {
  
  inline def apply(): TypeofFileReader = {
    val __obj = js.Dynamic.literal(DONE = 2, EMPTY = 0, LOADING = 1)
    __obj.asInstanceOf[TypeofFileReader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFileReader] (val x: Self) extends AnyVal {
    
    inline def setDONE(value: `2`): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
    
    inline def setEMPTY(value: `0`): Self = StObject.set(x, "EMPTY", value.asInstanceOf[js.Any])
    
    inline def setLOADING(value: `1`): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
  }
}
