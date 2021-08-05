package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsKey extends StObject {
  
  var algorithm: js.UndefOr[String] = js.undefined
  
  var creationTime: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var digests: js.UndefOr[js.Array[SchemaDnsKeyDigest]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  var keyLength: js.UndefOr[Double] = js.undefined
  
  var keyTag: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#dnsKey&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var publicKey: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDnsKey {
  
  inline def apply(): SchemaDnsKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKey]
  }
  
  extension [Self <: SchemaDnsKey](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDigests(value: js.Array[SchemaDnsKeyDigest]): Self = StObject.set(x, "digests", value.asInstanceOf[js.Any])
    
    inline def setDigestsUndefined: Self = StObject.set(x, "digests", js.undefined)
    
    inline def setDigestsVarargs(value: SchemaDnsKeyDigest*): Self = StObject.set(x, "digests", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setKeyTag(value: Double): Self = StObject.set(x, "keyTag", value.asInstanceOf[js.Any])
    
    inline def setKeyTagUndefined: Self = StObject.set(x, "keyTag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
