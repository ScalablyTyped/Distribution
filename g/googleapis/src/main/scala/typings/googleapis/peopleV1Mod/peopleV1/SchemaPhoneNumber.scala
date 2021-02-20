package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s phone number.
  */
@js.native
trait SchemaPhoneNumber extends StObject {
  
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
  implicit class SchemaPhoneNumberMutableBuilder[Self <: SchemaPhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalForm(value: String): Self = StObject.set(x, "canonicalForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalFormUndefined: Self = StObject.set(x, "canonicalForm", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
