package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for name of a user in Directory API.
  */
@js.native
trait SchemaUserName extends StObject {
  
  /**
    * Last Name
    */
  var familyName: js.UndefOr[String] = js.native
  
  /**
    * Full Name
    */
  var fullName: js.UndefOr[String] = js.native
  
  /**
    * First Name
    */
  var givenName: js.UndefOr[String] = js.native
}
object SchemaUserName {
  
  @scala.inline
  def apply(): SchemaUserName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserName]
  }
  
  @scala.inline
  implicit class SchemaUserNameMutableBuilder[Self <: SchemaUserName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
