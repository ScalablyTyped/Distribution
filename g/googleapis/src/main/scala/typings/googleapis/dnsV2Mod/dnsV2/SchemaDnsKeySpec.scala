package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsKeySpec extends StObject {
  
  /**
    * String mnemonic specifying the DNSSEC algorithm of this key.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Length of the keys in bits.
    */
  var keyLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
    */
  var keyType: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDnsKeySpec {
  
  inline def apply(): SchemaDnsKeySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKeySpec]
  }
  
  extension [Self <: SchemaDnsKeySpec](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthNull: Self = StObject.set(x, "keyLength", null)
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeNull: Self = StObject.set(x, "keyType", null)
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
