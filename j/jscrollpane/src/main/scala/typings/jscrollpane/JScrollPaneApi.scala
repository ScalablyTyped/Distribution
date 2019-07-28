package typings.jscrollpane

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JScrollPaneApi extends js.Object {
  /**
  	 * This method is called when jScrollPane is trying to animate to a new position. You can override it if you want
  	 * to provide advanced animation functionality.
  	*/
  def animate(ele: JQuery, prop: String, value: js.Any, stepCallback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /**
  	 * Destroys the jScrollPane on the instance matching this API object and restores the browser's default behaviour.
  	*/
  def destroy(): Unit = js.native
  /**
  	 * Returns the height of the content within the scroll pane. 
  	*/
  def getContentHeight(): Double = js.native
  /**
  	 * Gets a reference to the content pane. It is important that you use this method if you want to edit the content
  	 * of your jScrollPane as if you access the element directly then you may have some problems (as your original
  	 * element has had additional elements for the scrollbars etc added into it). 
  	*/
  def getContentPane(): JQuery = js.native
  /**
  	 * Returns the current x position of the viewport with regards to the content pane. 
  	*/
  def getContentPositionX(): Double = js.native
  /**
  	 * Returns the current y position of the viewport with regards to the content pane. 
  	*/
  def getContentPositionY(): Double = js.native
  /**
  	 * Returns the width of the content within the scroll pane. 
  	*/
  def getContentWidth(): Double = js.native
  /**
  	 * Returns whether or not this scrollpane has a horizontal scrollbar. 
  	*/
  def getIsScrollableH(): Boolean = js.native
  /**
  	 * Returns whether or not this scrollpane has a vertical scrollbar. 
  	*/
  def getIsScrollableV(): Boolean = js.native
  /**
  	 * Returns the horizontal position of the viewport within the pane content. 
  	*/
  def getPercentScrolledX(): Double = js.native
  /**
  	 * Returns the vertical position of the viewport within the pane content. 
  	*/
  def getPercentScrolledY(): Double = js.native
  /**
  	 * Hijacks the links on the page which link to content inside the scrollpane. If you have changed the content of
  	 * your page (e.g. via AJAX) and want to make sure any new anchor links to the contents of your scroll pane will
  	 * work then call this function. 
  	*/
  def hijackInternalLinks(): Unit = js.native
  /**
  	 * Positions the horizontal drag at the specified x position (and updates the viewport to reflect this)
  	 * @param x New position of the horizontal drag
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def positionDragX(x: Double): Unit = js.native
  def positionDragX(x: Double, animate: Boolean): Unit = js.native
  /**
  	 * Positions the vertical drag at the specified y position (and updates the viewport to reflect this)
  	 * @param x New position of the vertical drag
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def positionDragY(y: Double): Unit = js.native
  def positionDragY(y: Double, animate: Boolean): Unit = js.native
  /**
  	 * Reinitialises the scroll pane (if it's internal dimensions have changed since the last time it was initialised).
  	 * The settings object which is passed in will override any settings from the previous time it was initialised -
  	 * if you don't pass any settings then the ones from the previous initialisation will be used.
  	*/
  def reinitialise(): Unit = js.native
  def reinitialise(options: JScrollPaneSettings): Unit = js.native
  /**
  	 * Scrolls the pane by the specified amount of pixels.
  	 * @param deltaX Number of pixels to scroll horizontally
  	 * @param deltaY Number of pixels to scroll vertically
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollBy(deltaX: Double, deltaY: Double): Unit = js.native
  def scrollBy(deltaX: Double, deltaY: Double, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the pane by the specified amount of pixels.
  	 * @param deltaX Number of pixels to scroll horizontally
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollByX(deltaX: Double): Unit = js.native
  def scrollByX(deltaX: Double, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the pane by the specified amount of pixels
  	 * @param deltaY Number of pixels to scroll vertically
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollByY(deltaY: Double): Unit = js.native
  def scrollByY(deltaY: Double, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the pane so that the specified co-ordinates within the content are at the top left of the viewport.
  	 * @param destX Left position of the viewport to scroll to
  	 * @param destY Top position of the viewport to scroll to
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollTo(destX: Double, destY: Double): Unit = js.native
  def scrollTo(destX: Double, destY: Double, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls this jScrollPane down as far as it can currently scroll.
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToBottom(): Unit = js.native
  def scrollToBottom(animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the specified element (a jQuery selector string) into view so that it can be seen within the viewport.
  	 * @param ele A jQuery selector of the object to scroll to
  	 * @param stickToTop If it is true then the element will appear at the top of the viewport, if it is false
  			then the viewport will scroll as little as possible to show the element.
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToElement(ele: String): Unit = js.native
  def scrollToElement(ele: String, stickToTop: Boolean): Unit = js.native
  def scrollToElement(ele: String, stickToTop: Boolean, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the specified element (a jQuery object) into view so that it can be seen within the viewport.
  	 * @param ele A jQuery object to scroll to
  	 * @param stickToTop If it is true then the element will appear at the top of the viewport, if it is false
  			then the viewport will scroll as little as possible to show the element.
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToElement(ele: JQuery): Unit = js.native
  def scrollToElement(ele: JQuery, stickToTop: Boolean): Unit = js.native
  def scrollToElement(ele: JQuery, stickToTop: Boolean, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the specified element (a DOM node) into view so that it can be seen within the viewport.
  	 * @param ele A DOM node to scroll to
  	 * @param stickToTop If it is true then the element will appear at the top of the viewport, if it is false
  			then the viewport will scroll as little as possible to show the element.
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToElement(ele: HTMLElement): Unit = js.native
  def scrollToElement(ele: HTMLElement, stickToTop: Boolean): Unit = js.native
  def scrollToElement(ele: HTMLElement, stickToTop: Boolean, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the pane to the specified percentage of its maximum horizontal scroll position.
  	 * @param destPercentX Percentage from left of the full width of the viewport to scroll to
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToPercentX(destPercentX: Double): Unit = js.native
  def scrollToPercentX(destPercentX: Double, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the pane to the specified percentage of its maximum vertical scroll position.
  	 * @param destPercentY Percentage from top of the full width of the viewport to scroll to
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToPercentY(destPercentY: Double): Unit = js.native
  def scrollToPercentY(destPercentY: Double, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the pane so that the specified co-ordinate within the content is at the left of the viewport.
  	 * @param destX Left position of the viewport to scroll to
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToX(destX: Double): Unit = js.native
  def scrollToX(destX: Double, animate: Boolean): Unit = js.native
  /**
  	 * Scrolls the pane so that the specified co-ordinate within the content is at the top of the viewport.
  	 * @param destY Top position of the viewport to scroll to
  	 * @param animate Should an animation occur. If you don't provide this argument then the animateScroll
  			value from the settings object is used instead.
  	*/
  def scrollToY(destY: Double): Unit = js.native
  def scrollToY(destY: Double, animate: Boolean): Unit = js.native
}

