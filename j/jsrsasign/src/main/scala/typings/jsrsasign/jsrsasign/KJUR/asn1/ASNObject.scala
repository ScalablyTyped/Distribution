package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASNObject extends js.Object {
  
  var bitstr: DERBitString = js.native
  
  var bool: DERBoolean = js.native
  
  var enum: DEREnumerated = js.native
  
  var gentime: DERGeneralizedTime = js.native
  
  var ia5str: DERIA5String = js.native
  
  var int: DERInteger = js.native
  
  var `null`: DERNull = js.native
  
  var numstr: DERNumericString = js.native
  
  var octstr: DEROctetString = js.native
  
  var oid: DERObjectIdentifier = js.native
  
  var prnstr: DERPrintableString = js.native
  
  var seq: DERSequence = js.native
  
  var set: DERSet = js.native
  
  var tag: DERTaggedObject = js.native
  
  var telstr: DERTeletexString = js.native
  
  var utctime: DERUTCTime = js.native
  
  var utf8str: DERUTF8String = js.native
}
object ASNObject {
  
  @scala.inline
  def apply(
    bitstr: DERBitString,
    bool: DERBoolean,
    enum: DEREnumerated,
    gentime: DERGeneralizedTime,
    ia5str: DERIA5String,
    int: DERInteger,
    `null`: DERNull,
    numstr: DERNumericString,
    octstr: DEROctetString,
    oid: DERObjectIdentifier,
    prnstr: DERPrintableString,
    seq: DERSequence,
    set: DERSet,
    tag: DERTaggedObject,
    telstr: DERTeletexString,
    utctime: DERUTCTime,
    utf8str: DERUTF8String
  ): ASNObject = {
    val __obj = js.Dynamic.literal(bitstr = bitstr.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], gentime = gentime.asInstanceOf[js.Any], ia5str = ia5str.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], numstr = numstr.asInstanceOf[js.Any], octstr = octstr.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], prnstr = prnstr.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], telstr = telstr.asInstanceOf[js.Any], utctime = utctime.asInstanceOf[js.Any], utf8str = utf8str.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASNObject]
  }
  
  @scala.inline
  implicit class ASNObjectOps[Self <: ASNObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBitstr(value: DERBitString): Self = this.set("bitstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBool(value: DERBoolean): Self = this.set("bool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnum(value: DEREnumerated): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGentime(value: DERGeneralizedTime): Self = this.set("gentime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIa5str(value: DERIA5String): Self = this.set("ia5str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt(value: DERInteger): Self = this.set("int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNull(value: DERNull): Self = this.set("null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumstr(value: DERNumericString): Self = this.set("numstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOctstr(value: DEROctetString): Self = this.set("octstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOid(value: DERObjectIdentifier): Self = this.set("oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrnstr(value: DERPrintableString): Self = this.set("prnstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: DERSequence): Self = this.set("seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: DERSet): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: DERTaggedObject): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelstr(value: DERTeletexString): Self = this.set("telstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtctime(value: DERUTCTime): Self = this.set("utctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf8str(value: DERUTF8String): Self = this.set("utf8str", value.asInstanceOf[js.Any])
  }
}
