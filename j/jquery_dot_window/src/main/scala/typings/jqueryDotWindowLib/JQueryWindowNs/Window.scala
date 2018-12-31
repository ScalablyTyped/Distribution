package typings
package jqueryDotWindowLib.JQueryWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance methods
@js.native
trait Window extends js.Object {
  /**
    set current window as screen center
    **/
  def alignCenter(): scala.Unit = js.native
  /**
    set current window as horizontal center
    **/
  def alignHorizontalCenter(): scala.Unit = js.native
  /**
    set current window as vertical center
    **/
  def alignVerticalCenter(): scala.Unit = js.native
  /**
    close current window
    **/
  def close(quiet: scala.Boolean): scala.Unit = js.native
  /**
    get window container's parent panel, it's a jQuery object
    **/
  def getCaller(): jqueryDotWindowLib.JQuery = js.native
  /**
    get window container panel, it's a jQuery object
    **/
  def getContainer(): jqueryDotWindowLib.JQuery = js.native
  /**
    get frame html content
    **/
  def getContent(): java.lang.String = js.native
  /**
    get window footer panel, it's a jQuery object
    **/
  def getFooter(): jqueryDotWindowLib.JQuery = js.native
  /**
    get footer html content
    **/
  def getFooterContent(): java.lang.String = js.native
  /**
    get window frame panel, it's a jQuery object
    **/
  def getFrame(): jqueryDotWindowLib.JQuery = js.native
  /**
    get window header panel, it's a jQuery object
    **/
  def getHeader(): jqueryDotWindowLib.JQuery = js.native
  /**
    get window title text
    **/
  def getTitle(): java.lang.String = js.native
  /**
    get url string
    **/
  def getUrl(): java.lang.String = js.native
  /**
    get window id
    **/
  def getWindowId(): java.lang.String = js.native
  /**
    hide current window
    **/
  def hide(): scala.Unit = js.native
  /**
    hide window icon
    **/
  def hideIcon(): scala.Unit = js.native
  /**
    get window maximized status
    **/
  def isMaximized(): scala.Boolean = js.native
  /**
    get window minmized status
    **/
  def isMinimized(): scala.Boolean = js.native
  /**
    get window selected status
    **/
  def isSelected(): scala.Boolean = js.native
  /**
    maximize current window
    **/
  def maximize(): scala.Unit = js.native
  /**
    minimize current window
    **/
  def minimize(): scala.Unit = js.native
  /**
    move current window to target position or shift it by passed distance
    **/
  def move(x: scala.Double, y: scala.Double, bShift: scala.Boolean): scala.Unit = js.native
  /**
    resize current window to target width/height
    **/
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    restore current window, it could be maximized or cascade status
    **/
  def restore(): scala.Unit = js.native
  /**
    select current window, it will increase the original z-index value with 2
    **/
  def select(): scala.Unit = js.native
  /**
    change frame content
    **/
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: jqueryDotWindowLib.JQuery): scala.Unit = js.native
  def setContent(content: stdLib.HTMLElement): scala.Unit = js.native
  /**
    change footer content
    **/
  def setFooterContent(content: java.lang.String): scala.Unit = js.native
  def setFooterContent(content: jqueryDotWindowLib.JQuery): scala.Unit = js.native
  def setFooterContent(content: stdLib.HTMLElement): scala.Unit = js.native
  /**
    set window icon
    **/
  def setIcon(iconUrl: java.lang.String): scala.Unit = js.native
  /**
    change window title
    **/
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
    change iframe url
    **/
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
    show current window
    **/
  def show(): scala.Unit = js.native
  /**
    show window icon
    **/
  def showIcon(): scala.Unit = js.native
  /**
    unselect current window, it will set the z-index as original options.z
    **/
  def unselect(): scala.Unit = js.native
}

