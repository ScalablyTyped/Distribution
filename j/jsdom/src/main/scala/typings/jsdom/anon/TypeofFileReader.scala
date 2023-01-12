package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFileReader extends StObject {
  
  /* standard dom */
  val DONE: Double
  
  /* standard dom */
  val EMPTY: Double
  
  /* standard dom */
  val LOADING: Double
}
object TypeofFileReader {
  
  inline def apply(DONE: Double, EMPTY: Double, LOADING: Double): TypeofFileReader = {
    val __obj = js.Dynamic.literal(DONE = DONE.asInstanceOf[js.Any], EMPTY = EMPTY.asInstanceOf[js.Any], LOADING = LOADING.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFileReader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFileReader] (val x: Self) extends AnyVal {
    
    inline def setDONE(value: Double): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
    
    inline def setEMPTY(value: Double): Self = StObject.set(x, "EMPTY", value.asInstanceOf[js.Any])
    
    inline def setLOADING(value: Double): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
  }
}
