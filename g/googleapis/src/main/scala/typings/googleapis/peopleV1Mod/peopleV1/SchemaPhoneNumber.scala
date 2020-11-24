package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s phone number.
  */
@js.native
trait SchemaPhoneNumber extends js.Object {
  
  /**
    * The read-only canonicalized [ITU-T
    * E.164](https://law.resource.org/pub/us/cfr/ibr/004/itu-t.E.164.1.2008.pdf)
    * form of the phone number.
    */
  var canonicalForm: js.UndefOr[String] = js.native
  
  /**
    * The read-only type of the phone number translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the phone number.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The type of the phone number. The type can be custom or one of these
    * predefined values:  * `home` * `work` * `mobile` * `homeFax` * `workFax`
    * * `otherFax` * `pager` * `workMobile` * `workPager` * `main` *
    * `googleVoice` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The phone number.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaPhoneNumber {
  
  @scala.inline
  def apply(): SchemaPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoneNumber]
  }
  
  @scala.inline
  implicit class SchemaPhoneNumberOps[Self <: SchemaPhoneNumber] (val x: Self) extends AnyVal {
    
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
    def setCanonicalForm(value: String): Self = this.set("canonicalForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalForm: Self = this.set("canonicalForm", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
