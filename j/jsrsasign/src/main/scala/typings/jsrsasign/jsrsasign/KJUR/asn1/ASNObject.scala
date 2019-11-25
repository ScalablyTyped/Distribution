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
    val __obj = js.Dynamic.literal(bitstr = bitstr.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], gentime = gentime.asInstanceOf[js.Any], ia5str = ia5str.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], numstr = numstr.asInstanceOf[js.Any], octstr = octstr.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], prnstr = prnstr.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], telstr = telstr.asInstanceOf[js.Any], utctime = utctime.asInstanceOf[js.Any], utf8str = utf8str.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASNObject]
  }
}

