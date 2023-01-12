package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchRange extends StObject {
  
  /** End of the match in the snippet. */
  var end: js.UndefOr[Double] = js.undefined
  
  /** Starting position of the match in the snippet. */
  var start: js.UndefOr[Double] = js.undefined
}
object MatchRange {
  
  inline def apply(): MatchRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
