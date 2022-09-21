package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHTMLTrackElement extends StObject {
  
  /* standard dom */
  val ERROR: Double
  
  /* standard dom */
  val LOADED: Double
  
  /* standard dom */
  val LOADING: Double
  
  /* standard dom */
  val NONE: Double
}
object TypeofHTMLTrackElement {
  
  inline def apply(ERROR: Double, LOADED: Double, LOADING: Double, NONE: Double): TypeofHTMLTrackElement = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], LOADED = LOADED.asInstanceOf[js.Any], LOADING = LOADING.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHTMLTrackElement]
  }
  
  extension [Self <: TypeofHTMLTrackElement](x: Self) {
    
    inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setLOADED(value: Double): Self = StObject.set(x, "LOADED", value.asInstanceOf[js.Any])
    
    inline def setLOADING(value: Double): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
  }
}
