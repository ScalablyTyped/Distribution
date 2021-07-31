package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s name. If the name is a mononym, the family name is empty.
  */
trait SchemaName extends StObject {
  
  /**
    * The read-only display name formatted according to the locale specified by
    * the viewer&#39;s account or the `Accept-Language` HTTP header.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The read-only display name with the last name first formatted according
    * to the locale specified by the viewer&#39;s account or the
    * `Accept-Language` HTTP header.
    */
  var displayNameLastFirst: js.UndefOr[String] = js.undefined
  
  /**
    * The family name.
    */
  var familyName: js.UndefOr[String] = js.undefined
  
  /**
    * The given name.
    */
  var givenName: js.UndefOr[String] = js.undefined
  
  /**
    * The honorific prefixes, such as `Mrs.` or `Dr.`
    */
  var honorificPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The honorific suffixes, such as `Jr.`
    */
  var honorificSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the name.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The middle name(s).
    */
  var middleName: js.UndefOr[String] = js.undefined
  
  /**
    * The family name spelled as it sounds.
    */
  var phoneticFamilyName: js.UndefOr[String] = js.undefined
  
  /**
    * The full name spelled as it sounds.
    */
  var phoneticFullName: js.UndefOr[String] = js.undefined
  
  /**
    * The given name spelled as it sounds.
    */
  var phoneticGivenName: js.UndefOr[String] = js.undefined
  
  /**
    * The honorific prefixes spelled as they sound.
    */
  var phoneticHonorificPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The honorific suffixes spelled as they sound.
    */
  var phoneticHonorificSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * The middle name(s) spelled as they sound.
    */
  var phoneticMiddleName: js.UndefOr[String] = js.undefined
}
object SchemaName {
  
  @scala.inline
  def apply(): SchemaName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaName]
  }
  
  @scala.inline
  implicit class SchemaNameMutableBuilder[Self <: SchemaName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameLastFirst(value: String): Self = StObject.set(x, "displayNameLastFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameLastFirstUndefined: Self = StObject.set(x, "displayNameLastFirst", js.undefined)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorificPrefixUndefined: Self = StObject.set(x, "honorificPrefix", js.undefined)
    
    @scala.inline
    def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorificSuffixUndefined: Self = StObject.set(x, "honorificSuffix", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    @scala.inline
    def setPhoneticFamilyName(value: String): Self = StObject.set(x, "phoneticFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticFamilyNameUndefined: Self = StObject.set(x, "phoneticFamilyName", js.undefined)
    
    @scala.inline
    def setPhoneticFullName(value: String): Self = StObject.set(x, "phoneticFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticFullNameUndefined: Self = StObject.set(x, "phoneticFullName", js.undefined)
    
    @scala.inline
    def setPhoneticGivenName(value: String): Self = StObject.set(x, "phoneticGivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticGivenNameUndefined: Self = StObject.set(x, "phoneticGivenName", js.undefined)
    
    @scala.inline
    def setPhoneticHonorificPrefix(value: String): Self = StObject.set(x, "phoneticHonorificPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticHonorificPrefixUndefined: Self = StObject.set(x, "phoneticHonorificPrefix", js.undefined)
    
    @scala.inline
    def setPhoneticHonorificSuffix(value: String): Self = StObject.set(x, "phoneticHonorificSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticHonorificSuffixUndefined: Self = StObject.set(x, "phoneticHonorificSuffix", js.undefined)
    
    @scala.inline
    def setPhoneticMiddleName(value: String): Self = StObject.set(x, "phoneticMiddleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticMiddleNameUndefined: Self = StObject.set(x, "phoneticMiddleName", js.undefined)
  }
}
