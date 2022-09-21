package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceSitesResponse extends StObject {
  
  /**
    * The list of sites in the channel after replacing.
    */
  var sites: js.UndefOr[js.Array[SchemaSite]] = js.undefined
}
object SchemaReplaceSitesResponse {
  
  inline def apply(): SchemaReplaceSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceSitesResponse]
  }
  
  extension [Self <: SchemaReplaceSitesResponse](x: Self) {
    
    inline def setSites(value: js.Array[SchemaSite]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: SchemaSite*): Self = StObject.set(x, "sites", js.Array(value*))
  }
}
