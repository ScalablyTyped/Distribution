package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASNObject extends StObject {
  
  var bitstr: DERBitString
  
  var bool: DERBoolean
  
  var `enum`: DEREnumerated
  
  var gentime: DERGeneralizedTime
  
  var ia5str: DERIA5String
  
  var int: DERInteger
  
  var `null`: DERNull
  
  var numstr: DERNumericString
  
  var octstr: DEROctetString
  
  var oid: DERObjectIdentifier
  
  var prnstr: DERPrintableString
  
  var seq: DERSequence
  
  var set: DERSet
  
  var tag: DERTaggedObject
  
  var telstr: DERTeletexString
  
  var utctime: DERUTCTime
  
  var utf8str: DERUTF8String
}
object ASNObject {
  
  inline def apply(
    bitstr: DERBitString,
    bool: DERBoolean,
    `enum`: DEREnumerated,
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
    val __obj = js.Dynamic.literal(bitstr = bitstr.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], gentime = gentime.asInstanceOf[js.Any], ia5str = ia5str.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], numstr = numstr.asInstanceOf[js.Any], octstr = octstr.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], prnstr = prnstr.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], telstr = telstr.asInstanceOf[js.Any], utctime = utctime.asInstanceOf[js.Any], utf8str = utf8str.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASNObject]
  }
  
  extension [Self <: ASNObject](x: Self) {
    
    inline def setBitstr(value: DERBitString): Self = StObject.set(x, "bitstr", value.asInstanceOf[js.Any])
    
    inline def setBool(value: DERBoolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: DEREnumerated): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setGentime(value: DERGeneralizedTime): Self = StObject.set(x, "gentime", value.asInstanceOf[js.Any])
    
    inline def setIa5str(value: DERIA5String): Self = StObject.set(x, "ia5str", value.asInstanceOf[js.Any])
    
    inline def setInt(value: DERInteger): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setNull(value: DERNull): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNumstr(value: DERNumericString): Self = StObject.set(x, "numstr", value.asInstanceOf[js.Any])
    
    inline def setOctstr(value: DEROctetString): Self = StObject.set(x, "octstr", value.asInstanceOf[js.Any])
    
    inline def setOid(value: DERObjectIdentifier): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    inline def setPrnstr(value: DERPrintableString): Self = StObject.set(x, "prnstr", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: DERSequence): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSet(value: DERSet): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setTag(value: DERTaggedObject): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTelstr(value: DERTeletexString): Self = StObject.set(x, "telstr", value.asInstanceOf[js.Any])
    
    inline def setUtctime(value: DERUTCTime): Self = StObject.set(x, "utctime", value.asInstanceOf[js.Any])
    
    inline def setUtf8str(value: DERUTF8String): Self = StObject.set(x, "utf8str", value.asInstanceOf[js.Any])
  }
}
