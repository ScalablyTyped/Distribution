package typings.jupyterlabSettingeditor

import typings.luminoCommands.mod.CommandRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Registry extends StObject {
    
    /**
      * The command registry.
      */
    var registry: CommandRegistry
    
    /**
      * The revert command ID.
      */
    var revert: String
    
    /**
      * The save command ID.
      */
    var save: String
  }
  object Registry {
    
    inline def apply(registry: CommandRegistry, revert: String, save: String): Registry = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
      __obj.asInstanceOf[Registry]
    }
    
    extension [Self <: Registry](x: Self) {
      
      inline def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRevert(value: String): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    }
  }
}
