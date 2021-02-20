package typings.jupyterlabSettingeditor

import typings.luminoCommands.mod.CommandRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Registry extends StObject {
    
    /**
      * The command registry.
      */
    var registry: CommandRegistry = js.native
    
    /**
      * The revert command ID.
      */
    var revert: String = js.native
    
    /**
      * The save command ID.
      */
    var save: String = js.native
  }
  object Registry {
    
    @scala.inline
    def apply(registry: CommandRegistry, revert: String, save: String): Registry = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
      __obj.asInstanceOf[Registry]
    }
    
    @scala.inline
    implicit class RegistryMutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevert(value: String): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    }
  }
}
