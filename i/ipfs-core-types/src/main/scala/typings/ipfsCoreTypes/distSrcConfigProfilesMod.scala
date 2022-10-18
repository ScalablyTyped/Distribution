package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcConfigMod.Config
import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigProfilesMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Apply a profile to the current config.  Note that restarting the node
      * will be necessary for any change to take effect.
      */
    @JSName("apply")
    def apply(name: String): js.Promise[ProfilesApplyResult] = js.native
    @JSName("apply")
    def apply(name: String, options: ProfilesApplyOptions & OptionExtension): js.Promise[ProfilesApplyResult] = js.native
    
    /**
      * List available config profiles
      */
    def list(): js.Promise[js.Array[Profile]] = js.native
    def list(options: AbortOptions & OptionExtension): js.Promise[js.Array[Profile]] = js.native
  }
  
  trait Profile extends StObject {
    
    var description: String
    
    var name: String
  }
  object Profile {
    
    inline def apply(description: String, name: String): Profile = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfilesApplyOptions
    extends StObject
       with AbortOptions {
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
  }
  object ProfilesApplyOptions {
    
    inline def apply(): ProfilesApplyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfilesApplyOptions]
    }
    
    extension [Self <: ProfilesApplyOptions](x: Self) {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    }
  }
  
  trait ProfilesApplyResult extends StObject {
    
    var original: Config
    
    var updated: Config
  }
  object ProfilesApplyResult {
    
    inline def apply(original: Config, updated: Config): ProfilesApplyResult = {
      val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfilesApplyResult]
    }
    
    extension [Self <: ProfilesApplyResult](x: Self) {
      
      inline def setOriginal(value: Config): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Config): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
