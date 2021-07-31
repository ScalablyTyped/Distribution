package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the metagame config resource
  */
trait SchemaMetagameConfig extends StObject {
  
  /**
    * Current version of the metagame configuration data. When this data is
    * updated, the version number will be increased by one.
    */
  var currentVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#metagameConfig.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The list of player levels.
    */
  var playerLevels: js.UndefOr[js.Array[SchemaPlayerLevel]] = js.undefined
}
object SchemaMetagameConfig {
  
  @scala.inline
  def apply(): SchemaMetagameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetagameConfig]
  }
  
  @scala.inline
  implicit class SchemaMetagameConfigMutableBuilder[Self <: SchemaMetagameConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayerLevels(value: js.Array[SchemaPlayerLevel]): Self = StObject.set(x, "playerLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerLevelsUndefined: Self = StObject.set(x, "playerLevels", js.undefined)
    
    @scala.inline
    def setPlayerLevelsVarargs(value: SchemaPlayerLevel*): Self = StObject.set(x, "playerLevels", js.Array(value :_*))
  }
}
