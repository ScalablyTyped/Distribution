package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDsRecord extends StObject {
  
  /**
    * The algorithm used to generate the referenced DNSKEY.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The digest generated from the referenced DNSKEY.
    */
  var digest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hash function used to generate the digest of the referenced DNSKEY.
    */
  var digestType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The key tag of the record. Must be set in range 0 -- 65535.
    */
  var keyTag: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDsRecord {
  
  inline def apply(): SchemaDsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDsRecord]
  }
  
  extension [Self <: SchemaDsRecord](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestType(value: String): Self = StObject.set(x, "digestType", value.asInstanceOf[js.Any])
    
    inline def setDigestTypeNull: Self = StObject.set(x, "digestType", null)
    
    inline def setDigestTypeUndefined: Self = StObject.set(x, "digestType", js.undefined)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setKeyTag(value: Double): Self = StObject.set(x, "keyTag", value.asInstanceOf[js.Any])
    
    inline def setKeyTagNull: Self = StObject.set(x, "keyTag", null)
    
    inline def setKeyTagUndefined: Self = StObject.set(x, "keyTag", js.undefined)
  }
}
