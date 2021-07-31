package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProject extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#project&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var quota: js.UndefOr[SchemaQuota] = js.undefined
}
object SchemaProject {
  
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  
  @scala.inline
  implicit class SchemaProjectMutableBuilder[Self <: SchemaProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setQuota(value: SchemaQuota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
  }
}
