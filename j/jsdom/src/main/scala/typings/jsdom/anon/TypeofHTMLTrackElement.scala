package typings.jsdom.anon

import typings.jsdom.jsdomInts.`0`
import typings.jsdom.jsdomInts.`1`
import typings.jsdom.jsdomInts.`2`
import typings.jsdom.jsdomInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHTMLTrackElement extends StObject {
  
  /* standard dom */
  val ERROR: `3`
  
  /* standard dom */
  val LOADED: `2`
  
  /* standard dom */
  val LOADING: `1`
  
  /* standard dom */
  val NONE: `0`
}
object TypeofHTMLTrackElement {
  
  inline def apply(): TypeofHTMLTrackElement = {
    val __obj = js.Dynamic.literal(ERROR = 3, LOADED = 2, LOADING = 1, NONE = 0)
    __obj.asInstanceOf[TypeofHTMLTrackElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofHTMLTrackElement] (val x: Self) extends AnyVal {
    
    inline def setERROR(value: `3`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setLOADED(value: `2`): Self = StObject.set(x, "LOADED", value.asInstanceOf[js.Any])
    
    inline def setLOADING(value: `1`): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
  }
}
