package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTileManagerMethods extends js.Object {
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit = js.native
  /**
    * Causes the TileManager to data bind to the data source (local or remote) , and re-render all of the data as well.
    */
  def dataBind(): Unit = js.native
  /**
    * Deletes the widget instance (client object). It is no longer accessible and all its event handlers stop working. Destroys all child widgets. Removes auto-generated HTML content, which is outside the widget, e.g. detached popups, dropdowns, etc.
    */
  def destroy(): js.Object = js.native
  /**
    * Returns the [layout manager](ui.iglayoutmanager) associated with current tile manager.
    */
  def layoutManager(): js.Object = js.native
  /**
    * Maximizes a given tile.
    *
    * @param $tileToMaximize Specifies the jQuery object of the tile element to be maximized.
    * @param animDuration Specifies the animation duration for this maximizing.
    * @param event Indicates the browser even which triggered this action (not API).
    */
  def maximize($tileToMaximize: js.Object): Unit = js.native
  def maximize($tileToMaximize: js.Object, animDuration: js.UndefOr[scala.Nothing], event: js.Object): Unit = js.native
  def maximize($tileToMaximize: js.Object, animDuration: Double): Unit = js.native
  def maximize($tileToMaximize: js.Object, animDuration: Double, event: js.Object): Unit = js.native
  /**
    * Returns the maximized tile or null if such is not present.
    * @return object|null Returns the maximized tile or null if such is not present.
    */
  def maximizedTile(): js.Object = js.native
  /**
    * Minimizes the maximized tile. Has no effect if no maximized tile is present.
    *
    * @param animDuration Specifies the animation duration for this minimize.
    * @param event Indicates the browser even which triggered this action (not API).
    */
  def minimize(): Unit = js.native
  def minimize(animDuration: js.UndefOr[scala.Nothing], event: js.Object): Unit = js.native
  def minimize(animDuration: Double): Unit = js.native
  def minimize(animDuration: Double, event: js.Object): Unit = js.native
  /**
    * Returns an array with the tiles in minimized state or null if such are not present.
    * @return object|null Returns an array with the tiles in minimized state or null if such are not present.
    */
  def minimizedTiles(): js.Object = js.native
  /**
    * Reflow the tile manager. Rearranging the tiles to fit in the container
    *
    * @param forceReflow Indicates whether the reflow should be forced. Useful in cases where the items size and position was changed manually.
    * @param animationDuration The animation duration to be used for this reflow only.
    * @param event Indicates the browser even which triggered this action (not API).
    */
  def reflow(): Unit = js.native
  def reflow(
    forceReflow: js.UndefOr[scala.Nothing],
    animationDuration: js.UndefOr[scala.Nothing],
    event: js.Object
  ): Unit = js.native
  def reflow(forceReflow: js.UndefOr[scala.Nothing], animationDuration: Double): Unit = js.native
  def reflow(forceReflow: js.UndefOr[scala.Nothing], animationDuration: Double, event: js.Object): Unit = js.native
  def reflow(forceReflow: js.Object): Unit = js.native
  def reflow(forceReflow: js.Object, animationDuration: js.UndefOr[scala.Nothing], event: js.Object): Unit = js.native
  def reflow(forceReflow: js.Object, animationDuration: Double): Unit = js.native
  def reflow(forceReflow: js.Object, animationDuration: Double, event: js.Object): Unit = js.native
  /**
    * Returns the splitter associated with this tile manager or
    *                 null if the tile manager was instantiated with maximizedTileIndex.
    * @return object|null Returns the splitter associated with this tile manager or null if the tile manager was instantiated with maximizedTileIndex.
    */
  def splitter(): js.Object = js.native
  /**
    * Returns the element that represents this widget.
    */
  def widget(): js.Object = js.native
}

