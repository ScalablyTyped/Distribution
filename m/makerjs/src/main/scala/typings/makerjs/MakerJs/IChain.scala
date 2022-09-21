package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A chain of paths which connect end to end.
  */
trait IChain extends StObject {
  
  /**
    * Chains that are contained within this chain. Populated when chains are found with the 'contain' option
    */
  var contains: js.UndefOr[js.Array[IChain]] = js.undefined
  
  /**
    * Flag if this chain forms a loop end to end.
    */
  var endless: Boolean
  
  /**
    * The links in this chain.
    */
  var links: js.Array[IChainLink]
  
  /**
    * Total length of all paths in the chain.
    */
  var pathLength: Double
}
object IChain {
  
  inline def apply(endless: Boolean, links: js.Array[IChainLink], pathLength: Double): IChain = {
    val __obj = js.Dynamic.literal(endless = endless.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChain]
  }
  
  extension [Self <: IChain](x: Self) {
    
    inline def setContains(value: js.Array[IChain]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setContainsVarargs(value: IChain*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setEndless(value: Boolean): Self = StObject.set(x, "endless", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[IChainLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: IChainLink*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
  }
}
