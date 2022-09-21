package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1beta1IntotoSignature extends StObject {
  
  var keyid: js.UndefOr[String | Null] = js.undefined
  
  var sig: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrafeasV1beta1IntotoSignature {
  
  inline def apply(): SchemaGrafeasV1beta1IntotoSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1IntotoSignature]
  }
  
  extension [Self <: SchemaGrafeasV1beta1IntotoSignature](x: Self) {
    
    inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setKeyidNull: Self = StObject.set(x, "keyid", null)
    
    inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
    
    inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    
    inline def setSigNull: Self = StObject.set(x, "sig", null)
    
    inline def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
  }
}
