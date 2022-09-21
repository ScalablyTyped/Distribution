package typings.indySdk.anon

import typings.indySdk.mod.IndyCredentialInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credinfo extends StObject {
  
  var cred_info: IndyCredentialInfo
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object Credinfo {
  
  inline def apply(cred_info: IndyCredentialInfo): Credinfo = {
    val __obj = js.Dynamic.literal(cred_info = cred_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credinfo]
  }
  
  extension [Self <: Credinfo](x: Self) {
    
    inline def setCred_info(value: IndyCredentialInfo): Self = StObject.set(x, "cred_info", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
