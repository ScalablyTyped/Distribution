package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvelopeSignature extends StObject {
  
  /**
    * A reference id to the key being used for signing
    */
  var keyid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The signature itself
    */
  var sig: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnvelopeSignature {
  
  inline def apply(): SchemaEnvelopeSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvelopeSignature]
  }
  
  extension [Self <: SchemaEnvelopeSignature](x: Self) {
    
    inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setKeyidNull: Self = StObject.set(x, "keyid", null)
    
    inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
    
    inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    
    inline def setSigNull: Self = StObject.set(x, "sig", null)
    
    inline def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
  }
}
