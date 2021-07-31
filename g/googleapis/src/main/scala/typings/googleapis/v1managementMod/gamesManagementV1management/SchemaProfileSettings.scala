package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for profile settings
  */
trait SchemaProfileSettings extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#profileSettings.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The player&#39;s current profile visibility. This field is visible to
    * both 1P and 3P APIs.
    */
  var profileVisible: js.UndefOr[Boolean] = js.undefined
}
object SchemaProfileSettings {
  
  @scala.inline
  def apply(): SchemaProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileSettings]
  }
  
  @scala.inline
  implicit class SchemaProfileSettingsMutableBuilder[Self <: SchemaProfileSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProfileVisible(value: Boolean): Self = StObject.set(x, "profileVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileVisibleUndefined: Self = StObject.set(x, "profileVisible", js.undefined)
  }
}
