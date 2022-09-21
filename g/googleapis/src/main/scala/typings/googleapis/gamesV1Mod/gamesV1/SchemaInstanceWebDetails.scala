package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceWebDetails extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#instanceWebDetails`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Launch URL for the game.
    */
  var launchUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInstanceWebDetails {
  
  inline def apply(): SchemaInstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceWebDetails]
  }
  
  extension [Self <: SchemaInstanceWebDetails](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLaunchUrl(value: String): Self = StObject.set(x, "launchUrl", value.asInstanceOf[js.Any])
    
    inline def setLaunchUrlNull: Self = StObject.set(x, "launchUrl", null)
    
    inline def setLaunchUrlUndefined: Self = StObject.set(x, "launchUrl", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredNull: Self = StObject.set(x, "preferred", null)
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
  }
}
