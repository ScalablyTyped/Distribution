package typings.indySdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndyCredentialInfo extends StObject {
  
  var attrs: StringDictionary[String]
  
  var cred_def_id: String
  
  var cred_rev_id: js.UndefOr[String] = js.undefined
  
  var referent: String
  
  var rev_reg_id: js.UndefOr[String] = js.undefined
  
  var schema_id: String
}
object IndyCredentialInfo {
  
  inline def apply(attrs: StringDictionary[String], cred_def_id: String, referent: String, schema_id: String): IndyCredentialInfo = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], cred_def_id = cred_def_id.asInstanceOf[js.Any], referent = referent.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndyCredentialInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndyCredentialInfo] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setCred_def_id(value: String): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setCred_rev_id(value: String): Self = StObject.set(x, "cred_rev_id", value.asInstanceOf[js.Any])
    
    inline def setCred_rev_idUndefined: Self = StObject.set(x, "cred_rev_id", js.undefined)
    
    inline def setReferent(value: String): Self = StObject.set(x, "referent", value.asInstanceOf[js.Any])
    
    inline def setRev_reg_id(value: String): Self = StObject.set(x, "rev_reg_id", value.asInstanceOf[js.Any])
    
    inline def setRev_reg_idUndefined: Self = StObject.set(x, "rev_reg_id", js.undefined)
    
    inline def setSchema_id(value: String): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
  }
}
