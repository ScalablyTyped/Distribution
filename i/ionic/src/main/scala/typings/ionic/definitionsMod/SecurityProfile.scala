package typings.ionic.definitionsMod

import typings.ionic.anon.Android
import typings.ionic.ionicStrings.development
import typings.ionic.ionicStrings.production
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfile extends StObject {
  
  var created: String
  
  var credentials: Android
  
  var name: String
  
  var tag: String
  
  var `type`: development | production
}
object SecurityProfile {
  
  @scala.inline
  def apply(created: String, credentials: Android, name: String, tag: String, `type`: development | production): SecurityProfile = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfile]
  }
  
  @scala.inline
  implicit class SecurityProfileMutableBuilder[Self <: SecurityProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: Android): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: development | production): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
