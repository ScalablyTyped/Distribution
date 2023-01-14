package typings.indySdk.anon

import typings.indySdk.mod.CredDefId
import typings.indySdk.mod.RevRegId
import typings.indySdk.mod.SchemaId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Creddefid extends StObject {
  
  var cred_def_id: CredDefId
  
  var rev_reg_id: js.UndefOr[RevRegId] = js.undefined
  
  var schema_id: SchemaId
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object Creddefid {
  
  inline def apply(cred_def_id: CredDefId, schema_id: SchemaId): Creddefid = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creddefid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Creddefid] (val x: Self) extends AnyVal {
    
    inline def setCred_def_id(value: CredDefId): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setRev_reg_id(value: RevRegId): Self = StObject.set(x, "rev_reg_id", value.asInstanceOf[js.Any])
    
    inline def setRev_reg_idUndefined: Self = StObject.set(x, "rev_reg_id", js.undefined)
    
    inline def setSchema_id(value: SchemaId): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
