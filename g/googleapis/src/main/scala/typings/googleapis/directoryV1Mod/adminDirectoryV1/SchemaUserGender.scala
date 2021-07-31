package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserGender extends StObject {
  
  /**
    * AddressMeAs. A human-readable string containing the proper way to refer
    * to the profile owner by humans, for example &quot;he/him/his&quot; or
    * &quot;they/them/their&quot;.
    */
  var addressMeAs: js.UndefOr[String] = js.undefined
  
  /**
    * Custom gender.
    */
  var customGender: js.UndefOr[String] = js.undefined
  
  /**
    * Gender.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaUserGender {
  
  @scala.inline
  def apply(): SchemaUserGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserGender]
  }
  
  @scala.inline
  implicit class SchemaUserGenderMutableBuilder[Self <: SchemaUserGender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressMeAs(value: String): Self = StObject.set(x, "addressMeAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressMeAsUndefined: Self = StObject.set(x, "addressMeAs", js.undefined)
    
    @scala.inline
    def setCustomGender(value: String): Self = StObject.set(x, "customGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomGenderUndefined: Self = StObject.set(x, "customGender", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
