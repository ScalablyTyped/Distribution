package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourceRecordSet extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#resourceRecordSet&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rrdatas: js.UndefOr[js.Array[String]] = js.native
  
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaResourceRecordSet {
  
  @scala.inline
  def apply(): SchemaResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecordSet]
  }
  
  @scala.inline
  implicit class SchemaResourceRecordSetMutableBuilder[Self <: SchemaResourceRecordSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    @scala.inline
    def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value :_*))
    
    @scala.inline
    def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    @scala.inline
    def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value :_*))
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
