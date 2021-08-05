package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for profile settings
  */
trait SchemaProfileSettings extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#profileSettings.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The player&#39;s current profile visibility. This field is visible to
    * both 1P and 3P APIs.
    */
  var profileVisible: js.UndefOr[Boolean] = js.undefined
}
object SchemaProfileSettings {
  
  inline def apply(): SchemaProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileSettings]
  }
  
  extension [Self <: SchemaProfileSettings](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileVisible(value: Boolean): Self = StObject.set(x, "profileVisible", value.asInstanceOf[js.Any])
    
    inline def setProfileVisibleUndefined: Self = StObject.set(x, "profileVisible", js.undefined)
  }
}
