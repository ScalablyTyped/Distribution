package typings.jsforce

import typings.jsforce.bulkMod.BulkLoadOperation
import typings.jsforce.describeResultMod.ExtraTypeInfo
import typings.jsforce.describeResultMod.FieldType
import typings.jsforce.describeResultMod.SOAPType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsforceStrings {
  
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @scala.inline
  def Parallel: Parallel = "Parallel".asInstanceOf[Parallel]
  
  @scala.inline
  def Promise: Promise = "Promise".asInstanceOf[Promise]
  
  @scala.inline
  def Restricted: Restricted = "Restricted".asInstanceOf[Restricted]
  
  @scala.inline
  def SObject: SObject = "SObject".asInstanceOf[SObject]
  
  @scala.inline
  def Serial: Serial = "Serial".asInstanceOf[Serial]
  
  @scala.inline
  def Unrestricted: Unrestricted = "Unrestricted".asInstanceOf[Unrestricted]
  
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  
  @scala.inline
  def anyType: anyType = "anyType".asInstanceOf[anyType]
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @scala.inline
  def combobox: combobox = "combobox".asInstanceOf[combobox]
  
  @scala.inline
  def complexvalue: complexvalue = "complexvalue".asInstanceOf[complexvalue]
  
  @scala.inline
  def currency: currency = "currency".asInstanceOf[currency]
  
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @scala.inline
  def encryptedstring: encryptedstring = "encryptedstring".asInstanceOf[encryptedstring]
  
  @scala.inline
  def externallookup: externallookup = "externallookup".asInstanceOf[externallookup]
  
  @scala.inline
  def hardDelete: hardDelete = "hardDelete".asInstanceOf[hardDelete]
  
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  
  @scala.inline
  def imageurl: imageurl = "imageurl".asInstanceOf[imageurl]
  
  @scala.inline
  def indirectlookup: indirectlookup = "indirectlookup".asInstanceOf[indirectlookup]
  
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  
  @scala.inline
  def multipicklist: multipicklist = "multipicklist".asInstanceOf[multipicklist]
  
  @scala.inline
  def percent: percent = "percent".asInstanceOf[percent]
  
  @scala.inline
  def personname: personname = "personname".asInstanceOf[personname]
  
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  
  @scala.inline
  def picklist: picklist = "picklist".asInstanceOf[picklist]
  
  @scala.inline
  def plaintextarea: plaintextarea = "plaintextarea".asInstanceOf[plaintextarea]
  
  @scala.inline
  def reference: reference = "reference".asInstanceOf[reference]
  
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @scala.inline
  def richtextarea: richtextarea = "richtextarea".asInstanceOf[richtextarea]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def switchablepersonname: switchablepersonname = "switchablepersonname".asInstanceOf[switchablepersonname]
  
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  
  @scala.inline
  def tnsColonID: tnsColonID = "tns:ID".asInstanceOf[tnsColonID]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @scala.inline
  def upsert: upsert = "upsert".asInstanceOf[upsert]
  
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @scala.inline
  def urnColonJunctionIdListNames: urnColonJunctionIdListNames = "urn:JunctionIdListNames".asInstanceOf[urnColonJunctionIdListNames]
  
  @scala.inline
  def urnColonRecordTypesSupported: urnColonRecordTypesSupported = "urn:RecordTypesSupported".asInstanceOf[urnColonRecordTypesSupported]
  
  @scala.inline
  def urnColonRelationshipReferenceTo: urnColonRelationshipReferenceTo = "urn:RelationshipReferenceTo".asInstanceOf[urnColonRelationshipReferenceTo]
  
  @scala.inline
  def urnColonSearchLayoutButtonsDisplayed: urnColonSearchLayoutButtonsDisplayed = "urn:SearchLayoutButtonsDisplayed".asInstanceOf[urnColonSearchLayoutButtonsDisplayed]
  
  @scala.inline
  def urnColonSearchLayoutFieldsDisplayed: urnColonSearchLayoutFieldsDisplayed = "urn:SearchLayoutFieldsDisplayed".asInstanceOf[urnColonSearchLayoutFieldsDisplayed]
  
  @scala.inline
  def urnColonaddress: urnColonaddress = "urn:address".asInstanceOf[urnColonaddress]
  
  @scala.inline
  def urnColonlocation: urnColonlocation = "urn:location".asInstanceOf[urnColonlocation]
  
  @scala.inline
  def xsdColonanyType: xsdColonanyType = "xsd:anyType".asInstanceOf[xsdColonanyType]
  
  @scala.inline
  def xsdColonbase64Binary: xsdColonbase64Binary = "xsd:base64Binary".asInstanceOf[xsdColonbase64Binary]
  
  @scala.inline
  def xsdColonboolean: xsdColonboolean = "xsd:boolean".asInstanceOf[xsdColonboolean]
  
  @scala.inline
  def xsdColondate: xsdColondate = "xsd:date".asInstanceOf[xsdColondate]
  
  @scala.inline
  def xsdColondateTime: xsdColondateTime = "xsd:dateTime".asInstanceOf[xsdColondateTime]
  
  @scala.inline
  def xsdColondouble: xsdColondouble = "xsd:double".asInstanceOf[xsdColondouble]
  
  @scala.inline
  def xsdColonint: xsdColonint = "xsd:int".asInstanceOf[xsdColonint]
  
  @scala.inline
  def xsdColonstring: xsdColonstring = "xsd:string".asInstanceOf[xsdColonstring]
  
  @scala.inline
  def xsdColontime: xsdColontime = "xsd:time".asInstanceOf[xsdColontime]
  
  @js.native
  sealed trait ASC extends js.Object
  
  @js.native
  sealed trait DESC extends js.Object
  
  @js.native
  sealed trait Parallel extends js.Object
  
  @js.native
  sealed trait Promise extends js.Object
  
  @js.native
  sealed trait Restricted extends js.Object
  
  @js.native
  sealed trait SObject extends js.Object
  
  @js.native
  sealed trait Serial extends js.Object
  
  @js.native
  sealed trait Unrestricted extends js.Object
  
  @js.native
  sealed trait address extends FieldType
  
  @js.native
  sealed trait anyType extends FieldType
  
  @js.native
  sealed trait base64 extends FieldType
  
  @js.native
  sealed trait boolean extends FieldType
  
  @js.native
  sealed trait combobox extends FieldType
  
  @js.native
  sealed trait complexvalue extends FieldType
  
  @js.native
  sealed trait currency extends FieldType
  
  @js.native
  sealed trait date extends FieldType
  
  @js.native
  sealed trait datetime extends FieldType
  
  @js.native
  sealed trait delete extends BulkLoadOperation
  
  @js.native
  sealed trait double extends FieldType
  
  @js.native
  sealed trait email extends FieldType
  
  @js.native
  sealed trait encryptedstring extends FieldType
  
  @js.native
  sealed trait externallookup extends ExtraTypeInfo
  
  @js.native
  sealed trait hardDelete extends BulkLoadOperation
  
  @js.native
  sealed trait id extends FieldType
  
  @js.native
  sealed trait imageurl extends ExtraTypeInfo
  
  @js.native
  sealed trait indirectlookup extends ExtraTypeInfo
  
  @js.native
  sealed trait insert extends BulkLoadOperation
  
  @js.native
  sealed trait int extends FieldType
  
  @js.native
  sealed trait location extends FieldType
  
  @js.native
  sealed trait multipicklist extends FieldType
  
  @js.native
  sealed trait percent extends FieldType
  
  @js.native
  sealed trait personname extends ExtraTypeInfo
  
  @js.native
  sealed trait phone extends FieldType
  
  @js.native
  sealed trait picklist extends FieldType
  
  @js.native
  sealed trait plaintextarea extends ExtraTypeInfo
  
  @js.native
  sealed trait reference extends FieldType
  
  @js.native
  sealed trait refresh extends js.Object
  
  @js.native
  sealed trait richtextarea extends ExtraTypeInfo
  
  @js.native
  sealed trait string extends FieldType
  
  @js.native
  sealed trait switchablepersonname extends ExtraTypeInfo
  
  @js.native
  sealed trait textarea extends FieldType
  
  @js.native
  sealed trait time extends FieldType
  
  @js.native
  sealed trait tnsColonID extends SOAPType
  
  @js.native
  sealed trait update extends BulkLoadOperation
  
  @js.native
  sealed trait upsert extends BulkLoadOperation
  
  @js.native
  sealed trait url extends FieldType
  
  @js.native
  sealed trait urnColonJunctionIdListNames extends SOAPType
  
  @js.native
  sealed trait urnColonRecordTypesSupported extends SOAPType
  
  @js.native
  sealed trait urnColonRelationshipReferenceTo extends SOAPType
  
  @js.native
  sealed trait urnColonSearchLayoutButtonsDisplayed extends SOAPType
  
  @js.native
  sealed trait urnColonSearchLayoutFieldsDisplayed extends SOAPType
  
  @js.native
  sealed trait urnColonaddress extends SOAPType
  
  @js.native
  sealed trait urnColonlocation extends SOAPType
  
  @js.native
  sealed trait xsdColonanyType extends SOAPType
  
  @js.native
  sealed trait xsdColonbase64Binary extends SOAPType
  
  @js.native
  sealed trait xsdColonboolean extends SOAPType
  
  @js.native
  sealed trait xsdColondate extends SOAPType
  
  @js.native
  sealed trait xsdColondateTime extends SOAPType
  
  @js.native
  sealed trait xsdColondouble extends SOAPType
  
  @js.native
  sealed trait xsdColonint extends SOAPType
  
  @js.native
  sealed trait xsdColonstring extends SOAPType
  
  @js.native
  sealed trait xsdColontime extends SOAPType
}
