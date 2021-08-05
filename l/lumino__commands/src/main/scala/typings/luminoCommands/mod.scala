package typings.luminoCommands

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCommands.luminoCommandsStrings.`many-changed`
import typings.luminoCommands.luminoCommandsStrings.added
import typings.luminoCommands.luminoCommandsStrings.changed
import typings.luminoCommands.luminoCommandsStrings.removed
import typings.luminoCommands.mod.CommandRegistry.Dataset
import typings.luminoCommands.mod.CommandRegistry.ICommandChangedArgs
import typings.luminoCommands.mod.CommandRegistry.ICommandExecutedArgs
import typings.luminoCommands.mod.CommandRegistry.ICommandOptions
import typings.luminoCommands.mod.CommandRegistry.IKeyBinding
import typings.luminoCommands.mod.CommandRegistry.IKeyBindingChangedArgs
import typings.luminoCommands.mod.CommandRegistry.IKeyBindingOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoVirtualdom.mod.VirtualElement.IRenderer
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/commands", "CommandRegistry")
  @js.native
  /**
    * Construct a new command registry.
    */
  class CommandRegistry () extends StObject {
    
    /**
      * Clear the internal pending state.
      */
    /* private */ var _clearPendingState: js.Any = js.native
    
    /**
      * Clear the pending timeout.
      */
    /* private */ var _clearTimer: js.Any = js.native
    
    /* private */ var _commandChanged: js.Any = js.native
    
    /* private */ var _commandExecuted: js.Any = js.native
    
    /* private */ var _commands: js.Any = js.native
    
    /* private */ var _exactKeyMatch: js.Any = js.native
    
    /**
      * Execute the command for the given key binding.
      *
      * If the command is missing or disabled, a warning will be logged.
      */
    /* private */ var _executeKeyBinding: js.Any = js.native
    
    /* private */ var _keyBindingChanged: js.Any = js.native
    
    /* private */ var _keyBindings: js.Any = js.native
    
    /* private */ var _keydownEvents: js.Any = js.native
    
    /* private */ var _keystrokes: js.Any = js.native
    
    /**
      * Handle the partial match timeout.
      */
    /* private */ var _onPendingTimeout: js.Any = js.native
    
    /**
      * Replay the keydown events which were suppressed.
      */
    /* private */ var _replayKeydownEvents: js.Any = js.native
    
    /* private */ var _replaying: js.Any = js.native
    
    /**
      * Start or restart the pending timeout.
      */
    /* private */ var _startTimer: js.Any = js.native
    
    /* private */ var _timerID: js.Any = js.native
    
    /**
      * Add a command to the registry.
      *
      * @param id - The unique id of the command.
      *
      * @param options - The options for the command.
      *
      * @returns A disposable which will remove the command.
      *
      * @throws An error if the given `id` is already registered.
      */
    def addCommand(id: String, options: ICommandOptions): IDisposable = js.native
    
    /**
      * Add a key binding to the registry.
      *
      * @param options - The options for creating the key binding.
      *
      * @returns A disposable which removes the added key binding.
      *
      * #### Notes
      * If multiple key bindings are registered for the same sequence, the
      * binding with the highest selector specificity is executed first. A
      * tie is broken by using the most recently added key binding.
      *
      * Ambiguous key bindings are resolved with a timeout. As an example,
      * suppose two key bindings are registered: one with the key sequence
      * `['Ctrl D']`, and another with `['Ctrl D', 'Ctrl W']`. If the user
      * presses `Ctrl D`, the first binding cannot be immediately executed
      * since the user may intend to complete the chord with `Ctrl W`. For
      * such cases, a timer is used to allow the chord to be completed. If
      * the chord is not completed before the timeout, the first binding
      * is executed.
      */
    def addKeyBinding(options: IKeyBindingOptions): IDisposable = js.native
    
    /**
      * Get the short form caption for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The caption for the command, or an empty string if the
      *   command is not registered.
      */
    def caption(id: String): String = js.native
    def caption(id: String, args: ReadonlyPartialJSONObject): String = js.native
    
    /**
      * Get the extra class name for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The class name for the command, or an empty string if
      *   the command is not registered.
      */
    def className(id: String): String = js.native
    def className(id: String, args: ReadonlyPartialJSONObject): String = js.native
    
    /**
      * A signal emitted when a command has changed.
      *
      * #### Notes
      * This signal is useful for visual representations of commands which
      * need to refresh when the state of a relevant command has changed.
      */
    val commandChanged: ISignal[this.type, ICommandChangedArgs] = js.native
    
    /**
      * A signal emitted when a command has executed.
      *
      * #### Notes
      * Care should be taken when consuming this signal. The command system is used
      * by many components for many user actions. Handlers registered with this
      * signal must return quickly to ensure the overall application remains responsive.
      */
    val commandExecuted: ISignal[this.type, ICommandExecutedArgs] = js.native
    
    /**
      * Get the dataset for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The dataset for the command, or an empty dataset if
      *   the command is not registered.
      */
    def dataset(id: String): Dataset = js.native
    def dataset(id: String, args: ReadonlyPartialJSONObject): Dataset = js.native
    
    /**
      * Execute a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns A promise which resolves with the result of the command.
      *
      * #### Notes
      * The promise will reject if the command throws an exception,
      * or if the command is not registered.
      */
    def execute(id: String): js.Promise[js.Any] = js.native
    def execute(id: String, args: ReadonlyPartialJSONObject): js.Promise[js.Any] = js.native
    
    /**
      * Test whether a specific command is registered.
      *
      * @param id - The id of the command of interest.
      *
      * @returns `true` if the command is registered, `false` otherwise.
      */
    def hasCommand(id: String): Boolean = js.native
    
    /**
      * Get the icon renderer for a specific command.
      *
      * DEPRECATED: if set to a string value, the .icon field will
      * function as an alias for the .iconClass field, for backwards
      * compatibility. In the future when this is removed, the default
      * return type will become undefined.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The icon renderer for the command, or
      *   an empty string if the command is not registered.
      */
    def icon(id: String): js.UndefOr[IRenderer | String] = js.native
    def icon(id: String, args: ReadonlyPartialJSONObject): js.UndefOr[IRenderer | String] = js.native
    
    /**
      * Get the icon class for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The icon class for the command, or an empty string if
      *   the command is not registered.
      */
    def iconClass(id: String): String = js.native
    def iconClass(id: String, args: ReadonlyPartialJSONObject): String = js.native
    
    /**
      * Get the icon label for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The icon label for the command, or an empty string if
      *   the command is not registered.
      */
    def iconLabel(id: String): String = js.native
    def iconLabel(id: String, args: ReadonlyPartialJSONObject): String = js.native
    
    /**
      * Test whether a specific command is enabled.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns A boolean indicating whether the command is enabled,
      *   or `false` if the command is not registered.
      */
    def isEnabled(id: String): Boolean = js.native
    def isEnabled(id: String, args: ReadonlyPartialJSONObject): Boolean = js.native
    
    /**
      * Test whether a specific command is toggled.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns A boolean indicating whether the command is toggled,
      *   or `false` if the command is not registered.
      */
    def isToggled(id: String): Boolean = js.native
    def isToggled(id: String, args: ReadonlyPartialJSONObject): Boolean = js.native
    
    /**
      * Test whether a specific command is visible.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns A boolean indicating whether the command is visible,
      *   or `false` if the command is not registered.
      */
    def isVisible(id: String): Boolean = js.native
    def isVisible(id: String, args: ReadonlyPartialJSONObject): Boolean = js.native
    
    /**
      * A signal emitted when a key binding is changed.
      */
    val keyBindingChanged: ISignal[this.type, IKeyBindingChangedArgs] = js.native
    
    /**
      * A read-only array of the key bindings in the registry.
      */
    val keyBindings: js.Array[IKeyBinding] = js.native
    
    /**
      * Get the display label for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The display label for the command, or an empty string
      *   if the command is not registered.
      */
    def label(id: String): String = js.native
    def label(id: String, args: ReadonlyPartialJSONObject): String = js.native
    
    /**
      * List the ids of the registered commands.
      *
      * @returns A new array of the registered command ids.
      */
    def listCommands(): js.Array[String] = js.native
    
    /**
      * Get the mnemonic index for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The mnemonic index for the command, or `-1` if the
      *   command is not registered.
      */
    def mnemonic(id: String): Double = js.native
    def mnemonic(id: String, args: ReadonlyPartialJSONObject): Double = js.native
    
    /**
      * Notify listeners that the state of a command has changed.
      *
      * @param id - The id of the command which has changed. If more than
      *   one command has changed, this argument should be omitted.
      *
      * @throws An error if the given `id` is not registered.
      *
      * #### Notes
      * This method should be called by the command author whenever the
      * application state changes such that the results of the command
      * metadata functions may have changed.
      *
      * This will cause the `commandChanged` signal to be emitted.
      */
    def notifyCommandChanged(): Unit = js.native
    def notifyCommandChanged(id: String): Unit = js.native
    
    /**
      * Process a `'keydown'` event and invoke a matching key binding.
      *
      * @param event - The event object for a `'keydown'` event.
      *
      * #### Notes
      * This should be called in response to a `'keydown'` event in order
      * to invoke the command for the best matching key binding.
      *
      * The registry **does not** install its own listener for `'keydown'`
      * events. This allows the application full control over the nodes
      * and phase for which the registry processes `'keydown'` events.
      *
      * When the keydown event is processed, if the event target or any of its
      * ancestor nodes has a `data-lm-suppress-shortcuts` attribute, its keydown
      * events will not invoke commands.
      */
    def processKeydownEvent(event: KeyboardEvent): Unit = js.native
    
    /**
      * Get the usage help text for a specific command.
      *
      * @param id - The id of the command of interest.
      *
      * @param args - The arguments for the command.
      *
      * @returns The usage text for the command, or an empty string if
      *   the command is not registered.
      */
    def usage(id: String): String = js.native
    def usage(id: String, args: ReadonlyPartialJSONObject): String = js.native
  }
  object CommandRegistry {
    
    @JSImport("@lumino/commands", "CommandRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format a keystroke for display on the local system.
      */
    inline def formatKeystroke(keystroke: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatKeystroke")(keystroke.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Create a normalized keystroke for a `'keydown'` event.
      *
      * @param event - The event object for a `'keydown'` event.
      *
      * @returns A normalized keystroke, or an empty string if the event
      *   does not represent a valid keystroke for the given layout.
      */
    inline def keystrokeForKeydownEvent(event: KeyboardEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keystrokeForKeydownEvent")(event.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the platform-specific normalized keys for an options object.
      *
      * @param options - The options for the key binding.
      *
      * @returns Array of combined, normalized keys.
      */
    inline def normalizeKeys(options: IKeyBindingOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeys")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Normalize a keystroke into a canonical representation.
      *
      * @param keystroke - The keystroke of interest.
      *
      * @returns The normalized representation of the keystroke.
      *
      * #### Notes
      * This normalizes the keystroke by removing duplicate modifiers and
      * extra primary keys, and assembling the parts in a canonical order.
      *
      * The `Cmd` modifier is ignored on non-Mac platforms.
      */
    inline def normalizeKeystroke(keystroke: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeystroke")(keystroke.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Parse a keystroke into its constituent components.
      *
      * @param keystroke - The keystroke of interest.
      *
      * @returns The parsed components of the keystroke.
      *
      * #### Notes
      * The keystroke should be of the form:
      *   `[<modifier 1> [<modifier 2> [<modifier N> ]]]<primary key>`
      *
      * The supported modifiers are: `Accel`, `Alt`, `Cmd`, `Ctrl`, and
      * `Shift`. The `Accel` modifier is translated to `Cmd` on Mac and
      * `Ctrl` on all other platforms.
      *
      * The parsing is tolerant and will not throw exceptions. Notably:
      *   - Duplicate modifiers are ignored.
      *   - Extra primary keys are ignored.
      *   - The order of modifiers and primary key is irrelevant.
      *   - The keystroke parts should be separated by whitespace.
      *   - The keystroke is case sensitive.
      */
    inline def parseKeystroke(keystroke: String): IKeystrokeParts = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeystroke")(keystroke.asInstanceOf[js.Any]).asInstanceOf[IKeystrokeParts]
    
    /**
      * A type alias for a user-defined command function.
      */
    type CommandFunc[T] = js.Function1[/* args */ ReadonlyPartialJSONObject, T]
    
    /**
      * A type alias for a simple immutable string dataset.
      */
    type Dataset = StringDictionary[String]
    
    /**
      * An arguments object for the `commandChanged` signal.
      */
    trait ICommandChangedArgs extends StObject {
      
      /**
        * The id of the associated command.
        *
        * This will be `undefined` when the type is `'many-changed'`.
        */
      val id: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the command was added, removed, or changed.
        */
      val `type`: added | removed | changed | `many-changed`
    }
    object ICommandChangedArgs {
      
      inline def apply(`type`: added | removed | changed | `many-changed`): ICommandChangedArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICommandChangedArgs]
      }
      
      extension [Self <: ICommandChangedArgs](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setType(value: added | removed | changed | `many-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An arguments object for the `commandExecuted` signal.
      */
    trait ICommandExecutedArgs extends StObject {
      
      /**
        * The arguments object passed to the command.
        */
      val args: ReadonlyPartialJSONObject
      
      /**
        * The id of the associated command.
        */
      val id: String
      
      /**
        * The promise which resolves with the result of the command.
        */
      val result: js.Promise[js.Any]
    }
    object ICommandExecutedArgs {
      
      inline def apply(args: ReadonlyPartialJSONObject, id: String, result: js.Promise[js.Any]): ICommandExecutedArgs = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICommandExecutedArgs]
      }
      
      extension [Self <: ICommandExecutedArgs](x: Self) {
        
        inline def setArgs(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setResult(value: js.Promise[js.Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for creating a command.
      *
      * #### Notes
      * A command is an abstract representation of code to be executed along
      * with metadata for describing how the command should be displayed in
      * a visual representation.
      *
      * A command is a collection of functions, *not* methods. The command
      * registry will always invoke the command functions with a `thisArg`
      * which is `undefined`.
      */
    trait ICommandOptions extends StObject {
      
      /**
        * The caption for the command.
        *
        * #### Notes
        * This should be a simple one line description of the command. It
        * is used by some visual representations to show quick info about
        * the command.
        *
        * This can be a string literal, or a function which returns the
        * caption based on the provided command arguments.
        *
        * The default value is an empty string.
        */
      var caption: js.UndefOr[String | CommandFunc[String]] = js.undefined
      
      /**
        * The general class name for the command.
        *
        * #### Notes
        * This class name will be added to the primary node for the visual
        * representation of the command.
        *
        * Multiple class names can be separated with white space.
        *
        * This can be a string literal, or a function which returns the
        * class name based on the provided command arguments.
        *
        * The default value is an empty string.
        */
      var className: js.UndefOr[String | CommandFunc[String]] = js.undefined
      
      /**
        * The dataset for the command.
        *
        * #### Notes
        * The dataset values will be added to the primary node for the
        * visual representation of the command.
        *
        * This can be a dataset object, or a function which returns the
        * dataset object based on the provided command arguments.
        *
        * The default value is an empty dataset.
        */
      var dataset: js.UndefOr[Dataset | CommandFunc[Dataset]] = js.undefined
      
      /**
        * The function to invoke when the command is executed.
        *
        * #### Notes
        * This should return the result of the command (if applicable) or
        * a promise which yields the result. The result is resolved as a
        * promise and that promise is returned to the code which executed
        * the command.
        *
        * This may be invoked even when `isEnabled` returns `false`.
        */
      def execute(args: ReadonlyPartialJSONObject): js.Any | js.Promise[js.Any]
      /**
        * The function to invoke when the command is executed.
        *
        * #### Notes
        * This should return the result of the command (if applicable) or
        * a promise which yields the result. The result is resolved as a
        * promise and that promise is returned to the code which executed
        * the command.
        *
        * This may be invoked even when `isEnabled` returns `false`.
        */
      @JSName("execute")
      var execute_Original: CommandFunc[js.Any | js.Promise[js.Any]]
      
      /**
        * The icon renderer for the command.
        *
        * #### Notes
        * This can be an IRenderer object, or a function which returns the
        * renderer based on the provided command arguments.
        *
        * The default value is undefined.
        *
        * DEPRECATED: if set to a string value, the .icon field will function as
        * an alias for the .iconClass field, for backwards compatibility
        */
      var icon: js.UndefOr[IRenderer | String | (CommandFunc[js.UndefOr[IRenderer | String]])] = js.undefined
      
      /**
        * The icon class for the command.
        *
        * #### Notes
        * This class name will be added to the icon node for the visual
        * representation of the command.
        *
        * Multiple class names can be separated with white space.
        *
        * This can be a string literal, or a function which returns the
        * icon based on the provided command arguments.
        *
        * The default value is an empty string.
        */
      var iconClass: js.UndefOr[String | CommandFunc[String]] = js.undefined
      
      /**
        * The icon label for the command.
        *
        * #### Notes
        * This label will be added as text to the icon node for the visual
        * representation of the command.
        *
        * This can be a string literal, or a function which returns the
        * label based on the provided command arguments.
        *
        * The default value is an empty string.
        */
      var iconLabel: js.UndefOr[String | CommandFunc[String]] = js.undefined
      
      /**
        * A function which indicates whether the command is enabled.
        *
        * #### Notes
        * Visual representations may use this value to display a disabled
        * command as grayed-out or in some other non-interactive fashion.
        *
        * The default value is `() => true`.
        */
      var isEnabled: js.UndefOr[CommandFunc[Boolean]] = js.undefined
      
      /**
        * A function which indicates whether the command is toggled.
        *
        * #### Notes
        * Visual representations may use this value to display a toggled
        * command in a different form, such as a check mark icon for a
        * menu item or a depressed state for a toggle button.
        *
        * The default value is `() => false`.
        */
      var isToggled: js.UndefOr[CommandFunc[Boolean]] = js.undefined
      
      /**
        * A function which indicates whether the command is visible.
        *
        * #### Notes
        * Visual representations may use this value to hide or otherwise
        * not display a non-visible command.
        *
        * The default value is `() => true`.
        */
      var isVisible: js.UndefOr[CommandFunc[Boolean]] = js.undefined
      
      /**
        * The label for the command.
        *
        * #### Notes
        * This can be a string literal, or a function which returns the
        * label based on the provided command arguments.
        *
        * The label is often used as the primary text for the command.
        *
        * The default value is an empty string.
        */
      var label: js.UndefOr[String | CommandFunc[String]] = js.undefined
      
      /**
        * The index of the mnemonic character in the command's label.
        *
        * #### Notes
        * This can be an index literal, or a function which returns the
        * mnemonic index based on the provided command arguments.
        *
        * The mnemonic character is often used by menus to provide easy
        * single-key keyboard access for triggering a menu item. It is
        * typically rendered as an underlined character in the label.
        *
        * The default value is `-1`.
        */
      var mnemonic: js.UndefOr[Double | CommandFunc[Double]] = js.undefined
      
      /**
        * The usage text for the command.
        *
        * #### Notes
        * This should be a full description of the command, which includes
        * information about the structure of the arguments and the type of
        * the return value. It is used by some visual representations when
        * displaying complete help info about the command.
        *
        * This can be a string literal, or a function which returns the
        * usage text based on the provided command arguments.
        *
        * The default value is an empty string.
        */
      var usage: js.UndefOr[String | CommandFunc[String]] = js.undefined
    }
    object ICommandOptions {
      
      inline def apply(execute: /* args */ ReadonlyPartialJSONObject => js.Any | js.Promise[js.Any]): ICommandOptions = {
        val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
        __obj.asInstanceOf[ICommandOptions]
      }
      
      extension [Self <: ICommandOptions](x: Self) {
        
        inline def setCaption(value: String | CommandFunc[String]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCaptionFunction1(value: /* args */ ReadonlyPartialJSONObject => String): Self = StObject.set(x, "caption", js.Any.fromFunction1(value))
        
        inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
        
        inline def setClassName(value: String | CommandFunc[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameFunction1(value: /* args */ ReadonlyPartialJSONObject => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setDataset(value: Dataset | CommandFunc[Dataset]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
        
        inline def setDatasetFunction1(value: /* args */ ReadonlyPartialJSONObject => Dataset): Self = StObject.set(x, "dataset", js.Any.fromFunction1(value))
        
        inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
        
        inline def setExecute(value: /* args */ ReadonlyPartialJSONObject => js.Any | js.Promise[js.Any]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
        
        inline def setIcon(value: IRenderer | String | (CommandFunc[js.UndefOr[IRenderer | String]])): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconClass(value: String | CommandFunc[String]): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        inline def setIconClassFunction1(value: /* args */ ReadonlyPartialJSONObject => String): Self = StObject.set(x, "iconClass", js.Any.fromFunction1(value))
        
        inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
        
        inline def setIconFunction1(value: /* args */ ReadonlyPartialJSONObject => js.UndefOr[IRenderer | String]): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
        
        inline def setIconLabel(value: String | CommandFunc[String]): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        inline def setIconLabelFunction1(value: /* args */ ReadonlyPartialJSONObject => String): Self = StObject.set(x, "iconLabel", js.Any.fromFunction1(value))
        
        inline def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIsEnabled(value: /* args */ ReadonlyPartialJSONObject => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
        
        inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
        
        inline def setIsToggled(value: /* args */ ReadonlyPartialJSONObject => Boolean): Self = StObject.set(x, "isToggled", js.Any.fromFunction1(value))
        
        inline def setIsToggledUndefined: Self = StObject.set(x, "isToggled", js.undefined)
        
        inline def setIsVisible(value: /* args */ ReadonlyPartialJSONObject => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
        
        inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
        
        inline def setLabel(value: String | CommandFunc[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelFunction1(value: /* args */ ReadonlyPartialJSONObject => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setMnemonic(value: Double | CommandFunc[Double]): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
        
        inline def setMnemonicFunction1(value: /* args */ ReadonlyPartialJSONObject => Double): Self = StObject.set(x, "mnemonic", js.Any.fromFunction1(value))
        
        inline def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
        
        inline def setUsage(value: String | CommandFunc[String]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
        
        inline def setUsageFunction1(value: /* args */ ReadonlyPartialJSONObject => String): Self = StObject.set(x, "usage", js.Any.fromFunction1(value))
        
        inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      }
    }
    
    /**
      * An object which represents a key binding.
      *
      * #### Notes
      * A key binding is an immutable object created by a registry.
      */
    trait IKeyBinding extends StObject {
      
      /**
        * The arguments for the command.
        */
      val args: ReadonlyPartialJSONObject
      
      /**
        * The command executed when the binding is matched.
        */
      val command: String
      
      /**
        * The key sequence for the binding.
        */
      val keys: js.Array[String]
      
      /**
        * The CSS selector for the binding.
        */
      val selector: String
    }
    object IKeyBinding {
      
      inline def apply(args: ReadonlyPartialJSONObject, command: String, keys: js.Array[String], selector: String): IKeyBinding = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKeyBinding]
      }
      
      extension [Self <: IKeyBinding](x: Self) {
        
        inline def setArgs(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An arguments object for the `keyBindingChanged` signal.
      */
    trait IKeyBindingChangedArgs extends StObject {
      
      /**
        * The key binding which was changed.
        */
      val binding: IKeyBinding
      
      /**
        * Whether the key binding was added or removed.
        */
      val `type`: added | removed
    }
    object IKeyBindingChangedArgs {
      
      inline def apply(binding: IKeyBinding, `type`: added | removed): IKeyBindingChangedArgs = {
        val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKeyBindingChangedArgs]
      }
      
      extension [Self <: IKeyBindingChangedArgs](x: Self) {
        
        inline def setBinding(value: IKeyBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
        
        inline def setType(value: added | removed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for creating a key binding.
      */
    trait IKeyBindingOptions extends StObject {
      
      /**
        * The arguments for the command, if necessary.
        *
        * The default value is an empty object.
        */
      var args: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
      
      /**
        * The id of the command to execute when the binding is matched.
        */
      var command: String
      
      /**
        * The default key sequence for the key binding.
        *
        * A key sequence is composed of one or more keystrokes, where each
        * keystroke is a combination of modifiers and a primary key.
        *
        * Most key sequences will contain a single keystroke. Key sequences
        * with multiple keystrokes are called "chords", and are useful for
        * implementing modal input (ala Vim).
        *
        * Each keystroke in the sequence should be of the form:
        *   `[<modifier 1> [<modifier 2> [<modifier N> ]]]<primary key>`
        *
        * The supported modifiers are: `Accel`, `Alt`, `Cmd`, `Ctrl`, and
        * `Shift`. The `Accel` modifier is translated to `Cmd` on Mac and
        * `Ctrl` on all other platforms. The `Cmd` modifier is ignored on
        * non-Mac platforms.
        *
        * Keystrokes are case sensitive.
        *
        * **Examples:** `['Accel C']`, `['Shift F11']`, `['D', 'D']`
        */
      var keys: js.Array[String]
      
      /**
        * The key sequence to use when running on Linux.
        *
        * If provided, this will override `keys` on Linux platforms.
        */
      var linuxKeys: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The key sequence to use when running on Mac.
        *
        * If provided, this will override `keys` on Mac platforms.
        */
      var macKeys: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The CSS selector for the key binding.
        *
        * The key binding will only be invoked when the selector matches a
        * node on the propagation path of the keydown event. This allows
        * the key binding to be restricted to user-defined contexts.
        *
        * The selector must not contain commas.
        */
      var selector: String
      
      /**
        * The key sequence to use when running on Windows.
        *
        * If provided, this will override `keys` on Windows platforms.
        */
      var winKeys: js.UndefOr[js.Array[String]] = js.undefined
    }
    object IKeyBindingOptions {
      
      inline def apply(command: String, keys: js.Array[String], selector: String): IKeyBindingOptions = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKeyBindingOptions]
      }
      
      extension [Self <: IKeyBindingOptions](x: Self) {
        
        inline def setArgs(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
        
        inline def setLinuxKeys(value: js.Array[String]): Self = StObject.set(x, "linuxKeys", value.asInstanceOf[js.Any])
        
        inline def setLinuxKeysUndefined: Self = StObject.set(x, "linuxKeys", js.undefined)
        
        inline def setLinuxKeysVarargs(value: String*): Self = StObject.set(x, "linuxKeys", js.Array(value :_*))
        
        inline def setMacKeys(value: js.Array[String]): Self = StObject.set(x, "macKeys", value.asInstanceOf[js.Any])
        
        inline def setMacKeysUndefined: Self = StObject.set(x, "macKeys", js.undefined)
        
        inline def setMacKeysVarargs(value: String*): Self = StObject.set(x, "macKeys", js.Array(value :_*))
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setWinKeys(value: js.Array[String]): Self = StObject.set(x, "winKeys", value.asInstanceOf[js.Any])
        
        inline def setWinKeysUndefined: Self = StObject.set(x, "winKeys", js.undefined)
        
        inline def setWinKeysVarargs(value: String*): Self = StObject.set(x, "winKeys", js.Array(value :_*))
      }
    }
    
    /**
      * An object which holds the results of parsing a keystroke.
      */
    trait IKeystrokeParts extends StObject {
      
      /**
        * Whether `'Alt'` appears in the keystroke.
        */
      var alt: Boolean
      
      /**
        * Whether `'Cmd'` appears in the keystroke.
        */
      var cmd: Boolean
      
      /**
        * Whether `'Ctrl'` appears in the keystroke.
        */
      var ctrl: Boolean
      
      /**
        * The primary key for the keystroke.
        */
      var key: String
      
      /**
        * Whether `'Shift'` appears in the keystroke.
        */
      var shift: Boolean
    }
    object IKeystrokeParts {
      
      inline def apply(alt: Boolean, cmd: Boolean, ctrl: Boolean, key: String, shift: Boolean): IKeystrokeParts = {
        val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKeystrokeParts]
      }
      
      extension [Self <: IKeystrokeParts](x: Self) {
        
        inline def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setCmd(value: Boolean): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
        
        inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      }
    }
  }
}
