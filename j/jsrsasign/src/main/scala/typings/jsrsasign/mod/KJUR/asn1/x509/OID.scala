package typings.jsrsasign.mod.KJUR.asn1.x509

import org.scalablytyped.runtime.StringDictionary
import typings.jsrsasign.anon.AnyExtendedKeyUsage
import typings.jsrsasign.anon.BusinessCategory
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERObjectIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * static object for OID
  * @description
  * This class defines OID name and values.
  * AttributeType names registered in OID.atype2oidList are following:
  *
  * |short|long|OID|
  * |:------|:----|:----------|
  * |CN|commonName|2.5.4.3|
  * |L|localityName|2.5.4.7|
  * |ST|stateOrProvinceName|2.5.4.8|
  * |O|organizationName|2.5.4.10|
  * |OU|organizationalUnitName|2.5.4.11|
  * |C|countryName|2.5.4.6|
  * |STREET|streetAddress|2.5.4.6|
  * |DC|domainComponent|0.9.2342.19200300.100.1.25|
  * |UID|userId|0.9.2342.19200300.100.1.1|
  * |SN|surname|2.5.4.4|
  * |DN|distinguishedName|2.5.4.49|
  * |E|emailAddress|1.2.840.113549.1.9.1|
  * ||businessCategory|2.5.4.15|
  * ||postalCode|2.5.4.17|
  * ||jurisdictionOfIncorporationL|1.3.6.1.4.1.311.60.2.1.1|
  * ||jurisdictionOfIncorporationSP|1.3.6.1.4.1.311.60.2.1.2|
  * ||jurisdictionOfIncorporationC|1.3.6.1.4.1.311.60.2.1.3|
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.OID")
@js.native
object OID extends js.Object {
  
  /**
    * get DERObjectIdentifier by registered attribute type name such like 'C' or 'CN'
    * @param atype short attribute type name such like 'C' or 'CN'
    * @example
    * KJUR.asn1.x509.OID.atype2obj('CN') → 2.5.4.3
    * KJUR.asn1.x509.OID.atype2obj('OU') → 2.5.4.11
    */
  def atype2obj(atype: String): String = js.native
  
  /** for short attribute type name and oid (ex. 'C' and '2.5.4.6') */
  val atype2oidList: BusinessCategory = js.native
  
  /**
    * get DERObjectIdentifier by registered OID name
    * @param name OID
    * @example
    * var asn1ObjOID = OID.name2obj('SHA1withRSA');
    */
  def name2obj(name: String): DERObjectIdentifier = js.native
  
  /**
    * convert OID name to OID value
    * @param OID name
    * @return dot noted Object Identifer string (ex. 1.2.3.4)
    * @description
    * This static method converts from OID name to OID string.
    * If OID is undefined then it returns empty string (i.e. '').
    * @example
    * KJUR.asn1.x509.OID.name2oid("authorityInfoAccess") → 1.3.6.1.5.5.7.1.1
    */
  def name2oid(name: String): String = js.native
  
  /** for oid name and oid (ex. 'keyUsage' and '2.5.29.15') */
  val name2oidList: AnyExtendedKeyUsage = js.native
  
  /** for caching name and DERObjectIdentifier object */
  val objCache: StringDictionary[DERObjectIdentifier] = js.native
  
  /**
    * convert OID to AttributeType name
    * @param oid dot noted Object Identifer string (ex. 1.2.3.4)
    * @return OID AttributeType name if registered otherwise oid
    * @description
    * This static method converts OID string to its AttributeType name.
    * If OID is not defined in OID.atype2oidList associative array then it returns OID
    * specified as argument.
    * @example
    * KJUR.asn1.x509.OID.oid2atype("2.5.4.3") → CN
    * KJUR.asn1.x509.OID.oid2atype("1.3.6.1.4.1.311.60.2.1.3") → jurisdictionOfIncorporationC
    * KJUR.asn1.x509.OID.oid2atype("0.1.2.3.4") → 0.1.2.3.4 // unregistered OID
    */
  def oid2atype(oid: String): String = js.native
  
  /**
    * convert OID to name
    * @param oid dot noted Object Identifer string (ex. 1.2.3.4)
    * @return OID name if registered otherwise empty string
    * @description
    * This static method converts OID string to its name.
    * If OID is undefined then it returns empty string (i.e. '').
    * @example
    * KJUR.asn1.x509.OID.oid2name("1.3.6.1.5.5.7.1.1") → 'authorityInfoAccess'
    */
  def oid2name(): String = js.native
  def oid2name(oid: String): String = js.native
}
