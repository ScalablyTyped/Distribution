package typings.inquirer

import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.inquirer.prompts.PromptBase
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseUIMod {
  
  /**
    * Represents a ui.
    */
  @JSImport("inquirer/lib/ui/baseUI", JSImport.Default)
  @js.native
  /**
    * Initializes a new instance of the {@link UI `UI`} class.
    *
    * @param options
    * The input- and output-stream of the ui.
    */
  open class default ()
    extends StObject
       with UI {
    def this(options: StreamOptions) = this()
    
    /**
      * Gets or sets the currently active prompt.
      */
    /* protected */ /* CompleteClass */
    var activePrompt: PromptBase = js.native
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Handles a forced exit of the application.
      */
    /* protected */ /* CompleteClass */
    override def onForceClose(): Unit = js.native
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    /* protected */ /* CompleteClass */
    var rl: Interface = js.native
  }
  
  /**
    * Represents a ui.
    */
  trait UI extends StObject {
    
    /**
      * Gets or sets the currently active prompt.
      */
    /* protected */ var activePrompt: PromptBase
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ def close(): Unit
    
    /**
      * Handles a forced exit of the application.
      */
    /* protected */ def onForceClose(): Unit
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    /* protected */ var rl: Interface
  }
  object UI {
    
    inline def apply(activePrompt: PromptBase, close: () => Unit, onForceClose: () => Unit, rl: Interface): UI = {
      val __obj = js.Dynamic.literal(activePrompt = activePrompt.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), onForceClose = js.Any.fromFunction0(onForceClose), rl = rl.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI]
    }
    
    extension [Self <: UI](x: Self) {
      
      inline def setActivePrompt(value: PromptBase): Self = StObject.set(x, "activePrompt", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOnForceClose(value: () => Unit): Self = StObject.set(x, "onForceClose", js.Any.fromFunction0(value))
      
      inline def setRl(value: Interface): Self = StObject.set(x, "rl", value.asInstanceOf[js.Any])
    }
  }
}
