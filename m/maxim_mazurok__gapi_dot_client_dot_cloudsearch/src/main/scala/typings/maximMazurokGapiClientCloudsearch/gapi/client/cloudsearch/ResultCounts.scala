package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultCounts extends StObject {
  
  /** Result count information for each source with results. */
  var sourceResultCounts: js.UndefOr[js.Array[SourceResultCount]] = js.native
}
object ResultCounts {
  
  @scala.inline
  def apply(): ResultCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultCounts]
  }
  
  @scala.inline
  implicit class ResultCountsMutableBuilder[Self <: ResultCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceResultCounts(value: js.Array[SourceResultCount]): Self = StObject.set(x, "sourceResultCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceResultCountsUndefined: Self = StObject.set(x, "sourceResultCounts", js.undefined)
    
    @scala.inline
    def setSourceResultCountsVarargs(value: SourceResultCount*): Self = StObject.set(x, "sourceResultCounts", js.Array(value :_*))
  }
}
