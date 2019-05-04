package typings
package atJupyterlabMainmenuLib.libMainmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/mainmenu", "MainMenu")
@js.native
class MainMenu protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.MenuBar
     with IMainMenu {
  /**
    * Construct the main menu bar.
    */
  def this(commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry) = this()
  var _items: js.Any = js.native
  /**
    * Handle the disposal of a menu.
    */
  var _onMenuDisposed: js.Any = js.native
  /**
    * The application "Edit" menu.
    */
  @JSName("editMenu")
  val editMenu_MainMenu: atJupyterlabMainmenuLib.libEditMod.EditMenu = js.native
  /**
    * The application "File" menu.
    */
  @JSName("fileMenu")
  val fileMenu_MainMenu: atJupyterlabMainmenuLib.libFileMod.FileMenu = js.native
  /**
    * The application "Help" menu.
    */
  @JSName("helpMenu")
  val helpMenu_MainMenu: atJupyterlabMainmenuLib.libHelpMod.HelpMenu = js.native
  /**
    * The application "Kernel" menu.
    */
  @JSName("kernelMenu")
  val kernelMenu_MainMenu: atJupyterlabMainmenuLib.libKernelMod.KernelMenu = js.native
  /**
    * The application "Run" menu.
    */
  @JSName("runMenu")
  val runMenu_MainMenu: atJupyterlabMainmenuLib.libRunMod.RunMenu = js.native
  /**
    * The application "Settings" menu.
    */
  @JSName("settingsMenu")
  val settingsMenu_MainMenu: atJupyterlabMainmenuLib.libSettingsMod.SettingsMenu = js.native
  /**
    * The application "Tabs" menu.
    */
  @JSName("tabsMenu")
  val tabsMenu_MainMenu: atJupyterlabMainmenuLib.libTabsMod.TabsMenu = js.native
  /**
    * The application "View" menu.
    */
  @JSName("viewMenu")
  val viewMenu_MainMenu: atJupyterlabMainmenuLib.libViewMod.ViewMenu = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
}

