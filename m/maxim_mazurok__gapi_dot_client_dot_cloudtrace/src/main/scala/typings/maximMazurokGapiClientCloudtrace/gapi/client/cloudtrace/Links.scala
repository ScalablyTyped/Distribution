package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  /** The number of dropped links after the maximum size was enforced. If this value is 0, then no links were dropped. */
  var droppedLinksCount: js.UndefOr[Double] = js.undefined
  
  /** A collection of links. */
  var link: js.UndefOr[js.Array[Link]] = js.undefined
}
object Links {
  
  inline def apply(): Links = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Links]
  }
  
  extension [Self <: Links](x: Self) {
    
    inline def setDroppedLinksCount(value: Double): Self = StObject.set(x, "droppedLinksCount", value.asInstanceOf[js.Any])
    
    inline def setDroppedLinksCountUndefined: Self = StObject.set(x, "droppedLinksCount", js.undefined)
    
    inline def setLink(value: js.Array[Link]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: Link*): Self = StObject.set(x, "link", js.Array(value*))
  }
}
