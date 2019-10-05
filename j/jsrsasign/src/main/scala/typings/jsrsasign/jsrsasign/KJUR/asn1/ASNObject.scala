package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASNObject extends js.Object {
  var bitstr: DERBitString
  var bool: DERBoolean
  var enum: DEREnumerated
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
    val __obj = js.Dynamic.literal(bitstr = bitstr, bool = bool, enum = enum, gentime = gentime, ia5str = ia5str, int = int, numstr = numstr, octstr = octstr, oid = oid, prnstr = prnstr, seq = seq, set = set, tag = tag, telstr = telstr, utctime = utctime, utf8str = utf8str)
    __obj.updateDynamic("null")(`null`)
    __obj.asInstanceOf[ASNObject]
  }
}

