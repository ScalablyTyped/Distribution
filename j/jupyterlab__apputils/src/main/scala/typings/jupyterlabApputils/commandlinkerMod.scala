package typings.jupyterlabApputils

import typings.jupyterlabApputils.commandlinkerMod.CommandLinker.IOptions
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoVirtualdom.mod.ElementDataset
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandlinkerMod {
  
  @JSImport("@jupyterlab/apputils/lib/commandlinker", "CommandLinker")
  @js.native
  open class CommandLinker protected ()
    extends StObject
       with IDisposable {
    /**
      * Instantiate a new command linker.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _commands: Any = js.native
    
    /**
      * The global click handler that deploys commands/argument pairs that are
      * attached to the node being clicked.
      */
    /* private */ var _evtClick: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * Connect a command/argument pair to a given node so that when it is clicked,
      * the command will execute.
      *
      * @param node - The node being connected.
      *
      * @param command - The command ID to execute upon click.
      *
      * @param args - The arguments with which to invoke the command.
      *
      * @returns The same node that was passed in, after it has been connected.
      *
      * #### Notes
      * Only `click` events will execute the command on a connected node. So, there
      * are two considerations that are relevant:
      * 1. If a node is connected, the default click action will be prevented.
      * 2. The `HTMLElement` passed in should be clickable.
      */
    def connectNode(node: HTMLElement, command: String): HTMLElement = js.native
    def connectNode(node: HTMLElement, command: String, args: ReadonlyPartialJSONObject): HTMLElement = js.native
    
    /**
      * Disconnect a node that has been connected to execute a command on click.
      *
      * @param node - The node being disconnected.
      *
      * @returns The same node that was passed in, after it has been disconnected.
      *
      * #### Notes
      * This method is safe to call multiple times and is safe to call on nodes
      * that were never connected.
      *
      * This method can be called on rendered virtual DOM nodes that were populated
      * using the `populateVNodeDataset` method in order to disconnect them from
      * executing their command/argument pair.
      */
    def disconnectNode(node: HTMLElement): HTMLElement = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Handle the DOM events for the command linker helper class.
      *
      * @param event - The DOM event sent to the class.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the panel's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the linker is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MCommandLinker: Boolean = js.native
    
    /**
      * Populate the `dataset` attribute within the collection of attributes used
      * to instantiate a virtual DOM node with the values necessary for its
      * rendered DOM node to respond to clicks by executing a command/argument
      * pair.
      *
      * @param command - The command ID to execute upon click.
      *
      * @param args - The arguments with which to invoke the command.
      *
      * @returns A `dataset` collection for use within virtual node attributes.
      *
      * #### Notes
      * The return value can be used on its own as the value for the `dataset`
      * attribute of a virtual element, or it can be added to an existing `dataset`
      * as in the example below.
      *
      * #### Example
      * ```typescript
      * let command = 'some:command-id';
      * let args = { alpha: 'beta' };
      * let anchor = h.a({
      *   className: 'some-class',
      *   dataset: {
      *     foo: '1',
      *     bar: '2',
      *     ../...linker.populateVNodeDataset(command, args)
      *   }
      * }, 'some text');
      * ```
      */
    def populateVNodeDataset(command: String): ElementDataset = js.native
    def populateVNodeDataset(command: String, args: ReadonlyPartialJSONObject): ElementDataset = js.native
  }
  object CommandLinker {
    
    /**
      * The instantiation options for a command linker.
      */
    trait IOptions extends StObject {
      
      /**
        * The command registry instance that all linked commands will use.
        */
      var commands: CommandRegistry
    }
    object IOptions {
      
      inline def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      }
    }
  }
}
