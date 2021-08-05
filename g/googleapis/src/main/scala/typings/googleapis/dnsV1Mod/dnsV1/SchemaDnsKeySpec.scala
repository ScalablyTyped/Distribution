package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsKeySpec extends StObject {
  
  var algorithm: js.UndefOr[String] = js.undefined
  
  var keyLength: js.UndefOr[Double] = js.undefined
  
  var keyType: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#dnsKeySpec&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDnsKeySpec {
  
  inline def apply(): SchemaDnsKeySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKeySpec]
  }
  
  extension [Self <: SchemaDnsKeySpec](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
