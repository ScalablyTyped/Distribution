package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceAndroidDetails extends StObject {
  
  /**
    * Flag indicating whether the anti-piracy check is enabled.
    */
  var enablePiracyCheck: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#instanceAndroidDetails`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Android package name which maps to Google Play URL.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInstanceAndroidDetails {
  
  inline def apply(): SchemaInstanceAndroidDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceAndroidDetails]
  }
  
  extension [Self <: SchemaInstanceAndroidDetails](x: Self) {
    
    inline def setEnablePiracyCheck(value: Boolean): Self = StObject.set(x, "enablePiracyCheck", value.asInstanceOf[js.Any])
    
    inline def setEnablePiracyCheckNull: Self = StObject.set(x, "enablePiracyCheck", null)
    
    inline def setEnablePiracyCheckUndefined: Self = StObject.set(x, "enablePiracyCheck", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredNull: Self = StObject.set(x, "preferred", null)
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
  }
}
