package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object to represent a person.
  */
@js.native
trait SchemaPerson extends StObject {
  
  /**
    * The person&#39;s email addresses
    */
  var emailAddresses: js.UndefOr[js.Array[SchemaEmailAddress]] = js.native
  
  /**
    * The resource name of the person to provide information about. See &lt;a
    * href=&quot;https://developers.google.com/people/api/rest/v1/people/get&quot;&gt;
    * People.get&lt;/a&gt; from Google People API.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Obfuscated ID of a person.
    */
  var obfuscatedId: js.UndefOr[String] = js.native
  
  /**
    * The person&#39;s name
    */
  var personNames: js.UndefOr[js.Array[SchemaName]] = js.native
  
  /**
    * A person&#39;s read-only photo. A picture shown next to the person&#39;s
    * name to help others recognize the person in search results.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
}
object SchemaPerson {
  
  @scala.inline
  def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  
  @scala.inline
  implicit class SchemaPersonMutableBuilder[Self <: SchemaPerson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddresses(value: js.Array[SchemaEmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    @scala.inline
    def setEmailAddressesVarargs(value: SchemaEmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObfuscatedId(value: String): Self = StObject.set(x, "obfuscatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObfuscatedIdUndefined: Self = StObject.set(x, "obfuscatedId", js.undefined)
    
    @scala.inline
    def setPersonNames(value: js.Array[SchemaName]): Self = StObject.set(x, "personNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonNamesUndefined: Self = StObject.set(x, "personNames", js.undefined)
    
    @scala.inline
    def setPersonNamesVarargs(value: SchemaName*): Self = StObject.set(x, "personNames", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[SchemaPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: SchemaPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
  }
}
