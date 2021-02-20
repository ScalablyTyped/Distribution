package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDnsKey extends StObject {
  
  var algorithm: js.UndefOr[String] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var digests: js.UndefOr[js.Array[SchemaDnsKeyDigest]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isActive: js.UndefOr[Boolean] = js.native
  
  var keyLength: js.UndefOr[Double] = js.native
  
  var keyTag: js.UndefOr[Double] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#dnsKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var publicKey: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDnsKey {
  
  @scala.inline
  def apply(): SchemaDnsKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKey]
  }
  
  @scala.inline
  implicit class SchemaDnsKeyMutableBuilder[Self <: SchemaDnsKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDigests(value: js.Array[SchemaDnsKeyDigest]): Self = StObject.set(x, "digests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestsUndefined: Self = StObject.set(x, "digests", js.undefined)
    
    @scala.inline
    def setDigestsVarargs(value: SchemaDnsKeyDigest*): Self = StObject.set(x, "digests", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    @scala.inline
    def setKeyTag(value: Double): Self = StObject.set(x, "keyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTagUndefined: Self = StObject.set(x, "keyTag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
