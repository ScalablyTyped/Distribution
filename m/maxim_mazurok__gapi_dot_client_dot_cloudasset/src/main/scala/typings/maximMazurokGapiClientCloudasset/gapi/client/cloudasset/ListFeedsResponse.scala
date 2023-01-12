package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFeedsResponse extends StObject {
  
  /** A list of feeds. */
  var feeds: js.UndefOr[js.Array[Feed]] = js.undefined
}
object ListFeedsResponse {
  
  inline def apply(): ListFeedsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeedsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFeedsResponse] (val x: Self) extends AnyVal {
    
    inline def setFeeds(value: js.Array[Feed]): Self = StObject.set(x, "feeds", value.asInstanceOf[js.Any])
    
    inline def setFeedsUndefined: Self = StObject.set(x, "feeds", js.undefined)
    
    inline def setFeedsVarargs(value: Feed*): Self = StObject.set(x, "feeds", js.Array(value*))
  }
}
