package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPopoverMethods extends js.Object {
  
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
    * Returns the container for the popover contents
    */
  def container(): js.Object = js.native
  
  /**
    * Destroys the popover widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the currently set content for the popover container
    */
  def getContent(): String = js.native
  
  /**
    * Gets the current coordinates of the popover
    */
  def getCoordinates(): js.Object = js.native
  
  /**
    * Hides the popover for the specified target
    */
  def hide(): Unit = js.native
  
  /**
    * Returns the ID of the element the popover is attached to
    */
  def id(): String = js.native
  
  /**
    * Sets the content for the popover container
    *
    * @param newCnt The popover content to set.
    */
  def setContent(newCnt: String): Unit = js.native
  
  /**
    * Sets the popover to specific coordinates.
    *
    * @param pos The popover coordinates in pixels.
    */
  def setCoordinates(pos: js.Object): Unit = js.native
  
  /**
    * Shows the popover for the specified target
    *
    * @param trg The element to show popover for.
    * @param content The string to set for the popover to show.
    */
  def show(): Unit = js.native
  def show(trg: js.UndefOr[scala.Nothing], content: String): Unit = js.native
  def show(trg: Element): Unit = js.native
  def show(trg: Element, content: String): Unit = js.native
  
  /**
    * Gets the popover current target
    */
  def target(): js.Object = js.native
}
