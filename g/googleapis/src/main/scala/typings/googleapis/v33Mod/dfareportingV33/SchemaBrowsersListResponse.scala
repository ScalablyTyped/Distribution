package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Browser List Response
  */
trait SchemaBrowsersListResponse extends StObject {
  
  /**
    * Browser collection.
    */
  var browsers: js.UndefOr[js.Array[SchemaBrowser]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBrowsersListResponse {
  
  inline def apply(): SchemaBrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowsersListResponse]
  }
  
  extension [Self <: SchemaBrowsersListResponse](x: Self) {
    
    inline def setBrowsers(value: js.Array[SchemaBrowser]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: SchemaBrowser*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
