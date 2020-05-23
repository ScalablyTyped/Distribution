package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgZoombarMethods extends js.Object {
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
    * Returns the DIV that is the topmost container of the zoombar widget
    */
  def container(): Element = js.native
  /**
    * Destroys the Zoombar widget
    */
  def destroy(): Unit = js.native
  /**
    * Returns the ID of the element the zoombar is initialized on
    */
  def id(): String = js.native
  /**
    * Returns the main zoombar element
    */
  def widget(): Unit = js.native
  /**
    * Gets or sets the current zoom window
    *
    * @param left The left parameter of the new zoom window in percentages
    * @param width The width parameter of the new zoom window in percentages
    */
  def zoom(): js.Object = js.native
  def zoom(left: Double): js.Object = js.native
  def zoom(left: Double, width: Double): js.Object = js.native
}

