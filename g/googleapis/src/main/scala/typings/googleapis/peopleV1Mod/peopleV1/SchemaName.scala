package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaName extends StObject {
  
  /**
    * Output only. The display name formatted according to the locale specified by the viewer's account or the `Accept-Language` HTTP header.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The display name with the last name first formatted according to the locale specified by the viewer's account or the `Accept-Language` HTTP header.
    */
  var displayNameLastFirst: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The family name.
    */
  var familyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The given name.
    */
  var givenName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The honorific prefixes, such as `Mrs.` or `Dr.`
    */
  var honorificPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The honorific suffixes, such as `Jr.`
    */
  var honorificSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the name.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The middle name(s).
    */
  var middleName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The family name spelled as it sounds.
    */
  var phoneticFamilyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full name spelled as it sounds.
    */
  var phoneticFullName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The given name spelled as it sounds.
    */
  var phoneticGivenName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The honorific prefixes spelled as they sound.
    */
  var phoneticHonorificPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The honorific suffixes spelled as they sound.
    */
  var phoneticHonorificSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The middle name(s) spelled as they sound.
    */
  var phoneticMiddleName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The free form name value.
    */
  var unstructuredName: js.UndefOr[String | Null] = js.undefined
}
object SchemaName {
  
  inline def apply(): SchemaName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaName]
  }
  
  extension [Self <: SchemaName](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameLastFirst(value: String): Self = StObject.set(x, "displayNameLastFirst", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameLastFirstNull: Self = StObject.set(x, "displayNameLastFirst", null)
    
    inline def setDisplayNameLastFirstUndefined: Self = StObject.set(x, "displayNameLastFirst", js.undefined)
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
    
    inline def setHonorificPrefixNull: Self = StObject.set(x, "honorificPrefix", null)
    
    inline def setHonorificPrefixUndefined: Self = StObject.set(x, "honorificPrefix", js.undefined)
    
    inline def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
    
    inline def setHonorificSuffixNull: Self = StObject.set(x, "honorificSuffix", null)
    
    inline def setHonorificSuffixUndefined: Self = StObject.set(x, "honorificSuffix", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNameNull: Self = StObject.set(x, "middleName", null)
    
    inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    inline def setPhoneticFamilyName(value: String): Self = StObject.set(x, "phoneticFamilyName", value.asInstanceOf[js.Any])
    
    inline def setPhoneticFamilyNameNull: Self = StObject.set(x, "phoneticFamilyName", null)
    
    inline def setPhoneticFamilyNameUndefined: Self = StObject.set(x, "phoneticFamilyName", js.undefined)
    
    inline def setPhoneticFullName(value: String): Self = StObject.set(x, "phoneticFullName", value.asInstanceOf[js.Any])
    
    inline def setPhoneticFullNameNull: Self = StObject.set(x, "phoneticFullName", null)
    
    inline def setPhoneticFullNameUndefined: Self = StObject.set(x, "phoneticFullName", js.undefined)
    
    inline def setPhoneticGivenName(value: String): Self = StObject.set(x, "phoneticGivenName", value.asInstanceOf[js.Any])
    
    inline def setPhoneticGivenNameNull: Self = StObject.set(x, "phoneticGivenName", null)
    
    inline def setPhoneticGivenNameUndefined: Self = StObject.set(x, "phoneticGivenName", js.undefined)
    
    inline def setPhoneticHonorificPrefix(value: String): Self = StObject.set(x, "phoneticHonorificPrefix", value.asInstanceOf[js.Any])
    
    inline def setPhoneticHonorificPrefixNull: Self = StObject.set(x, "phoneticHonorificPrefix", null)
    
    inline def setPhoneticHonorificPrefixUndefined: Self = StObject.set(x, "phoneticHonorificPrefix", js.undefined)
    
    inline def setPhoneticHonorificSuffix(value: String): Self = StObject.set(x, "phoneticHonorificSuffix", value.asInstanceOf[js.Any])
    
    inline def setPhoneticHonorificSuffixNull: Self = StObject.set(x, "phoneticHonorificSuffix", null)
    
    inline def setPhoneticHonorificSuffixUndefined: Self = StObject.set(x, "phoneticHonorificSuffix", js.undefined)
    
    inline def setPhoneticMiddleName(value: String): Self = StObject.set(x, "phoneticMiddleName", value.asInstanceOf[js.Any])
    
    inline def setPhoneticMiddleNameNull: Self = StObject.set(x, "phoneticMiddleName", null)
    
    inline def setPhoneticMiddleNameUndefined: Self = StObject.set(x, "phoneticMiddleName", js.undefined)
    
    inline def setUnstructuredName(value: String): Self = StObject.set(x, "unstructuredName", value.asInstanceOf[js.Any])
    
    inline def setUnstructuredNameNull: Self = StObject.set(x, "unstructuredName", null)
    
    inline def setUnstructuredNameUndefined: Self = StObject.set(x, "unstructuredName", js.undefined)
  }
}
