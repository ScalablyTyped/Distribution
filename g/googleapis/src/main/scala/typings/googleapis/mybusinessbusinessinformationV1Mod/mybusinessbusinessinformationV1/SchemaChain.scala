package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChain extends StObject {
  
  /**
    * Names of the chain.
    */
  var chainNames: js.UndefOr[js.Array[SchemaChainName]] = js.undefined
  
  /**
    * Number of locations that are part of this chain.
    */
  var locationCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The chain's resource name, in the format `chains/{chain_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Websites of the chain.
    */
  var websites: js.UndefOr[js.Array[SchemaChainUri]] = js.undefined
}
object SchemaChain {
  
  inline def apply(): SchemaChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChain]
  }
  
  extension [Self <: SchemaChain](x: Self) {
    
    inline def setChainNames(value: js.Array[SchemaChainName]): Self = StObject.set(x, "chainNames", value.asInstanceOf[js.Any])
    
    inline def setChainNamesUndefined: Self = StObject.set(x, "chainNames", js.undefined)
    
    inline def setChainNamesVarargs(value: SchemaChainName*): Self = StObject.set(x, "chainNames", js.Array(value*))
    
    inline def setLocationCount(value: Double): Self = StObject.set(x, "locationCount", value.asInstanceOf[js.Any])
    
    inline def setLocationCountNull: Self = StObject.set(x, "locationCount", null)
    
    inline def setLocationCountUndefined: Self = StObject.set(x, "locationCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWebsites(value: js.Array[SchemaChainUri]): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
    
    inline def setWebsitesUndefined: Self = StObject.set(x, "websites", js.undefined)
    
    inline def setWebsitesVarargs(value: SchemaChainUri*): Self = StObject.set(x, "websites", js.Array(value*))
  }
}
