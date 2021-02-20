package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaChange extends StObject {
  
  var additions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
  
  var deletions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isServing: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#change&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object SchemaChange {
  
  @scala.inline
  def apply(): SchemaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChange]
  }
  
  @scala.inline
  implicit class SchemaChangeMutableBuilder[Self <: SchemaChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditions(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    @scala.inline
    def setAdditionsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    @scala.inline
    def setDeletions(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionsUndefined: Self = StObject.set(x, "deletions", js.undefined)
    
    @scala.inline
    def setDeletionsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "deletions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsServing(value: Boolean): Self = StObject.set(x, "isServing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServingUndefined: Self = StObject.set(x, "isServing", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
