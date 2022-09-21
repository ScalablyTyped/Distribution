package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetagameConfig extends StObject {
  
  /**
    * Current version of the metagame configuration data. When this data is updated, the version number will be increased by one.
    */
  var currentVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#metagameConfig`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of player levels.
    */
  var playerLevels: js.UndefOr[js.Array[SchemaPlayerLevel]] = js.undefined
}
object SchemaMetagameConfig {
  
  inline def apply(): SchemaMetagameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetagameConfig]
  }
  
  extension [Self <: SchemaMetagameConfig](x: Self) {
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionNull: Self = StObject.set(x, "currentVersion", null)
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlayerLevels(value: js.Array[SchemaPlayerLevel]): Self = StObject.set(x, "playerLevels", value.asInstanceOf[js.Any])
    
    inline def setPlayerLevelsUndefined: Self = StObject.set(x, "playerLevels", js.undefined)
    
    inline def setPlayerLevelsVarargs(value: SchemaPlayerLevel*): Self = StObject.set(x, "playerLevels", js.Array(value*))
  }
}
