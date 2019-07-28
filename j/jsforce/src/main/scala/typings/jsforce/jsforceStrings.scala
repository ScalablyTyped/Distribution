package typings.jsforce

import typings.jsforce.bulkMod.BulkLoadOperation
import typings.jsforce.describeDashResultMod.ExtraTypeInfo
import typings.jsforce.describeDashResultMod.FieldType
import typings.jsforce.describeDashResultMod.SOAPType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsforceStrings {
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
  sealed trait `tns:ID` extends SOAPType
  
  @js.native
  sealed trait update extends BulkLoadOperation
  
  @js.native
  sealed trait upsert extends BulkLoadOperation
  
  @js.native
  sealed trait url extends FieldType
  
  @js.native
  sealed trait `urn:JunctionIdListNames` extends SOAPType
  
  @js.native
  sealed trait `urn:RecordTypesSupported` extends SOAPType
  
  @js.native
  sealed trait `urn:RelationshipReferenceTo` extends SOAPType
  
  @js.native
  sealed trait `urn:SearchLayoutButtonsDisplayed` extends SOAPType
  
  @js.native
  sealed trait `urn:SearchLayoutFieldsDisplayed` extends SOAPType
  
  @js.native
  sealed trait `urn:address` extends SOAPType
  
  @js.native
  sealed trait `urn:location` extends SOAPType
  
  @js.native
  sealed trait `xsd:anyType` extends SOAPType
  
  @js.native
  sealed trait `xsd:base64Binary` extends SOAPType
  
  @js.native
  sealed trait `xsd:boolean` extends SOAPType
  
  @js.native
  sealed trait `xsd:date` extends SOAPType
  
  @js.native
  sealed trait `xsd:dateTime` extends SOAPType
  
  @js.native
  sealed trait `xsd:double` extends SOAPType
  
  @js.native
  sealed trait `xsd:int` extends SOAPType
  
  @js.native
  sealed trait `xsd:string` extends SOAPType
  
  @js.native
  sealed trait `xsd:time` extends SOAPType
  
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
  def `tns:ID`: `tns:ID` = "tns:ID".asInstanceOf[`tns:ID`]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def upsert: upsert = "upsert".asInstanceOf[upsert]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def `urn:JunctionIdListNames`: `urn:JunctionIdListNames` = "urn:JunctionIdListNames".asInstanceOf[`urn:JunctionIdListNames`]
  @scala.inline
  def `urn:RecordTypesSupported`: `urn:RecordTypesSupported` = "urn:RecordTypesSupported".asInstanceOf[`urn:RecordTypesSupported`]
  @scala.inline
  def `urn:RelationshipReferenceTo`: `urn:RelationshipReferenceTo` = "urn:RelationshipReferenceTo".asInstanceOf[`urn:RelationshipReferenceTo`]
  @scala.inline
  def `urn:SearchLayoutButtonsDisplayed`: `urn:SearchLayoutButtonsDisplayed` = "urn:SearchLayoutButtonsDisplayed".asInstanceOf[`urn:SearchLayoutButtonsDisplayed`]
  @scala.inline
  def `urn:SearchLayoutFieldsDisplayed`: `urn:SearchLayoutFieldsDisplayed` = "urn:SearchLayoutFieldsDisplayed".asInstanceOf[`urn:SearchLayoutFieldsDisplayed`]
  @scala.inline
  def `urn:address`: `urn:address` = "urn:address".asInstanceOf[`urn:address`]
  @scala.inline
  def `urn:location`: `urn:location` = "urn:location".asInstanceOf[`urn:location`]
  @scala.inline
  def `xsd:anyType`: `xsd:anyType` = "xsd:anyType".asInstanceOf[`xsd:anyType`]
  @scala.inline
  def `xsd:base64Binary`: `xsd:base64Binary` = "xsd:base64Binary".asInstanceOf[`xsd:base64Binary`]
  @scala.inline
  def `xsd:boolean`: `xsd:boolean` = "xsd:boolean".asInstanceOf[`xsd:boolean`]
  @scala.inline
  def `xsd:date`: `xsd:date` = "xsd:date".asInstanceOf[`xsd:date`]
  @scala.inline
  def `xsd:dateTime`: `xsd:dateTime` = "xsd:dateTime".asInstanceOf[`xsd:dateTime`]
  @scala.inline
  def `xsd:double`: `xsd:double` = "xsd:double".asInstanceOf[`xsd:double`]
  @scala.inline
  def `xsd:int`: `xsd:int` = "xsd:int".asInstanceOf[`xsd:int`]
  @scala.inline
  def `xsd:string`: `xsd:string` = "xsd:string".asInstanceOf[`xsd:string`]
  @scala.inline
  def `xsd:time`: `xsd:time` = "xsd:time".asInstanceOf[`xsd:time`]
}

