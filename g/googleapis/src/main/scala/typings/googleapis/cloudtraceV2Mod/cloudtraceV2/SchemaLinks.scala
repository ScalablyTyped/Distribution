package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinks extends StObject {
  
  /**
    * The number of dropped links after the maximum size was enforced. If this value is 0, then no links were dropped.
    */
  var droppedLinksCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A collection of links.
    */
  var link: js.UndefOr[js.Array[SchemaLink]] = js.undefined
}
object SchemaLinks {
  
  inline def apply(): SchemaLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinks]
  }
  
  extension [Self <: SchemaLinks](x: Self) {
    
    inline def setDroppedLinksCount(value: Double): Self = StObject.set(x, "droppedLinksCount", value.asInstanceOf[js.Any])
    
    inline def setDroppedLinksCountNull: Self = StObject.set(x, "droppedLinksCount", null)
    
    inline def setDroppedLinksCountUndefined: Self = StObject.set(x, "droppedLinksCount", js.undefined)
    
    inline def setLink(value: js.Array[SchemaLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: SchemaLink*): Self = StObject.set(x, "link", js.Array(value*))
  }
}
