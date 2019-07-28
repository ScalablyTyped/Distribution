package typings.atJupyterlabMainmenu.libMainmenuMod

import typings.atJupyterlabMainmenu.libEditMod.EditMenu
import typings.atJupyterlabMainmenu.libFileMod.FileMenu
import typings.atJupyterlabMainmenu.libHelpMod.HelpMenu
import typings.atJupyterlabMainmenu.libKernelMod.KernelMenu
import typings.atJupyterlabMainmenu.libRunMod.RunMenu
import typings.atJupyterlabMainmenu.libSettingsMod.SettingsMenu
import typings.atJupyterlabMainmenu.libTabsMod.TabsMenu
import typings.atJupyterlabMainmenu.libTokensMod.IMainMenu
import typings.atJupyterlabMainmenu.libViewMod.ViewMenu
import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.MenuBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/mainmenu", "MainMenu")
@js.native
class MainMenu protected ()
  extends MenuBar
     with IMainMenu {
  /**
    * Construct the main menu bar.
    */
  def this(commands: CommandRegistry) = this()
  var _items: js.Any = js.native
  /**
    * Handle the disposal of a menu.
    */
  var _onMenuDisposed: js.Any = js.native
  /**
    * The application "Edit" menu.
    */
  @JSName("editMenu")
  val editMenu_MainMenu: EditMenu = js.native
  /**
    * The application "File" menu.
    */
  @JSName("fileMenu")
  val fileMenu_MainMenu: FileMenu = js.native
  /**
    * The application "Help" menu.
    */
  @JSName("helpMenu")
  val helpMenu_MainMenu: HelpMenu = js.native
  /**
    * The application "Kernel" menu.
    */
  @JSName("kernelMenu")
  val kernelMenu_MainMenu: KernelMenu = js.native
  /**
    * The application "Run" menu.
    */
  @JSName("runMenu")
  val runMenu_MainMenu: RunMenu = js.native
  /**
    * The application "Settings" menu.
    */
  @JSName("settingsMenu")
  val settingsMenu_MainMenu: SettingsMenu = js.native
  /**
    * The application "Tabs" menu.
    */
  @JSName("tabsMenu")
  val tabsMenu_MainMenu: TabsMenu = js.native
  /**
    * The application "View" menu.
    */
  @JSName("viewMenu")
  val viewMenu_MainMenu: ViewMenu = js.native
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
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: Message): Unit = js.native
}

