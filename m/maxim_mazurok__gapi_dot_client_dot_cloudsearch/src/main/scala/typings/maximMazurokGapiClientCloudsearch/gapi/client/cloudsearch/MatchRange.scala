package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchRange extends StObject {
  
  /** End of the match in the snippet. */
  var end: js.UndefOr[Double] = js.native
  
  /** Starting position of the match in the snippet. */
  var start: js.UndefOr[Double] = js.native
}
object MatchRange {
  
  @scala.inline
  def apply(): MatchRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRange]
  }
  
  @scala.inline
  implicit class MatchRangeMutableBuilder[Self <: MatchRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
