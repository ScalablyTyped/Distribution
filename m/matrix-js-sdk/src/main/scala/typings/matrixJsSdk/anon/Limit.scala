package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  //  Token to paginate from
  var filter: Genericsearchterm
  
  //  The remote server to query for the room list. Optional. If unspecified, get the local home server's public room list.
  var limit: Double
  
  var server: String
  
  //  Maximum number of entries to return
  var since: String
}
object Limit {
  
  inline def apply(filter: Genericsearchterm, limit: Double, server: String, since: String): Limit = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  extension [Self <: Limit](x: Self) {
    
    inline def setFilter(value: Genericsearchterm): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
  }
}
