package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.DateParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accuracy extends StObject {
  
  var accuracy: js.UndefOr[Micros] = js.undefined
  
  var genTime: js.UndefOr[StringParam | HexParam | DateParam | String] = js.undefined
  
  var messageImprint: HashMsgHex
  
  var nonce: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.undefined
  
  var ordering: js.UndefOr[Boolean] = js.undefined
  
  var policy: String
  
  var serialNumber: js.UndefOr[IntegerParam | BigIntegerParam | HexParam | Double] = js.undefined
  
  var tsa: js.UndefOr[StringParam] = js.undefined
}
object Accuracy {
  
  @scala.inline
  def apply(messageImprint: HashMsgHex, policy: String): Accuracy = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  
  @scala.inline
  implicit class AccuracyMutableBuilder[Self <: Accuracy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Micros): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setGenTime(value: StringParam | HexParam | DateParam | String): Self = StObject.set(x, "genTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenTimeUndefined: Self = StObject.set(x, "genTime", js.undefined)
    
    @scala.inline
    def setMessageImprint(value: HashMsgHex): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setTsa(value: StringParam): Self = StObject.set(x, "tsa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsaUndefined: Self = StObject.set(x, "tsa", js.undefined)
  }
}
