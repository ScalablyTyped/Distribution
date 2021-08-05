package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChange extends StObject {
  
  var additions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.undefined
  
  var deletions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isServing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#change&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var startTime: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object SchemaChange {
  
  inline def apply(): SchemaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChange]
  }
  
  extension [Self <: SchemaChange](x: Self) {
    
    inline def setAdditions(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setAdditionsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    inline def setDeletions(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setDeletionsUndefined: Self = StObject.set(x, "deletions", js.undefined)
    
    inline def setDeletionsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "deletions", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsServing(value: Boolean): Self = StObject.set(x, "isServing", value.asInstanceOf[js.Any])
    
    inline def setIsServingUndefined: Self = StObject.set(x, "isServing", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
