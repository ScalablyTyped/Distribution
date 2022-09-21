package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4RawIndices extends StObject {
  
  /**
    * The indices to remove from a lexicographically-sorted local list.
    */
  var indices: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4RawIndices {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4RawIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4RawIndices]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4RawIndices](x: Self) {
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesNull: Self = StObject.set(x, "indices", null)
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
  }
}
