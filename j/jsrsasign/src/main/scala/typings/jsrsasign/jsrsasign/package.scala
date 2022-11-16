package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StringDictionary
import typings.jsrsasign.anon.Ds
import typings.jsrsasign.anon.Max
import typings.jsrsasign.anon.Min
import typings.jsrsasign.anon.Str
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** 
NOTE: Rewritten from type alias:
{{{
type ASN1HEXParseResult = {  bool :boolean} | {  int :{  hex :string}} | {  bitstr :{  obj :jsrsasign.jsrsasign.ASN1HEXParseResult}} | {  bitstr :{  hex :string}} | {  bitstr :{  bin :string}} | {  octstr :{  obj :jsrsasign.jsrsasign.ASN1HEXParseResult}} | {  octstr :{  hex :string}} | {  null :''} | {  oid :string} | {  enum :{  hex :string}} | {  enum :number} | {[tagName: string] : std.Array<jsrsasign.jsrsasign.ASN1HEXParseResult>} | {[tagName: string] : {  str :string}} | {  tag :{  tag :string,   explicit :boolean,   hex :string}} | {  tag :{  tag :string,   explicit :false,   str :string}} | {  tag :{  tag :string,   explicit :true,   obj :jsrsasign.jsrsasign.ASN1HEXParseResult}} | {  asn1 :{  tlv :string}} | std.Array<jsrsasign.jsrsasign.ASN1HEXParseResult>
}}}
to avoid circular code involving: 
- jsrsasign.jsrsasign.ASN1HEXParseResult
*/
/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.anon.Bool
  - typings.jsrsasign.anon.IntHex
  - typings.jsrsasign.anon.Bitstr
  - typings.jsrsasign.anon.BitstrHex
  - typings.jsrsasign.anon.BitstrBinString
  - typings.jsrsasign.anon.Octstr
  - typings.jsrsasign.anon.OctstrHex
  - typings.jsrsasign.anon.Null
  - typings.jsrsasign.anon.OidString
  - typings.jsrsasign.anon.Enum
  - typings.jsrsasign.anon.EnumNumber
  - org.scalablytyped.runtime.StringDictionary[js.Array[scala.Any] | typings.jsrsasign.anon.Str]
  - typings.jsrsasign.anon.Tag
  - typings.jsrsasign.anon.TagExplicitStr
  - typings.jsrsasign.anon.TagExplicitObj
  - typings.jsrsasign.anon.Asn1
  - js.Array[scala.Any]
*/
type ASN1HEXParseResult = _ASN1HEXParseResult | (StringDictionary[js.Array[Any] | Str]) | js.Array[Any]

type ErrorReturn = Any

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.anon.Rfc822
  - typings.jsrsasign.anon.Dns
  - typings.jsrsasign.anon.UriString
  - typings.jsrsasign.anon.Ip
  - typings.jsrsasign.anon.DnX500Name
  - typings.jsrsasign.anon.Other
  - scala.Unit
*/
type GeneralName = js.UndefOr[_GeneralName]

type GeneralSubtree = (GeneralName & Min) | (GeneralName & Max)

type IdentityArray = js.Array[js.Array[Ds]]

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.anon.Cps
  - typings.jsrsasign.anon.Unotice
  - js.Object
*/
type PolicyQualifierInfo = _PolicyQualifierInfo | js.Object

type hTag = String

type sTag = String
