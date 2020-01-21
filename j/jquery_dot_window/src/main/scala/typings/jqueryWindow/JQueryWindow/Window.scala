package typings.jqueryWindow.JQueryWindow

import typings.jqueryWindow.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance methods
@js.native
trait Window extends js.Object {
  /**
    set current window as screen center
    **/
  def alignCenter(): Unit = js.native
  /**
    set current window as horizontal center
    **/
  def alignHorizontalCenter(): Unit = js.native
  /**
    set current window as vertical center
    **/
  def alignVerticalCenter(): Unit = js.native
  /**
    close current window
    **/
  def close(quiet: Boolean): Unit = js.native
  /**
    get window container's parent panel, it's a jQuery object
    **/
  def getCaller(): JQuery = js.native
  /**
    get window container panel, it's a jQuery object
    **/
  def getContainer(): JQuery = js.native
  /**
    get frame html content
    **/
  def getContent(): String = js.native
  /**
    get window footer panel, it's a jQuery object
    **/
  def getFooter(): JQuery = js.native
  /**
    get footer html content
    **/
  def getFooterContent(): String = js.native
  /**
    get window frame panel, it's a jQuery object
    **/
  def getFrame(): JQuery = js.native
  /**
    get window header panel, it's a jQuery object
    **/
  def getHeader(): JQuery = js.native
  /**
    get window title text
    **/
  def getTitle(): String = js.native
  /**
    get url string
    **/
  def getUrl(): String = js.native
  /**
    get window id
    **/
  def getWindowId(): String = js.native
  /**
    hide current window
    **/
  def hide(): Unit = js.native
  /**
    hide window icon
    **/
  def hideIcon(): Unit = js.native
  /**
    get window maximized status
    **/
  def isMaximized(): Boolean = js.native
  /**
    get window minmized status
    **/
  def isMinimized(): Boolean = js.native
  /**
    get window selected status
    **/
  def isSelected(): Boolean = js.native
  /**
    maximize current window
    **/
  def maximize(): Unit = js.native
  /**
    minimize current window
    **/
  def minimize(): Unit = js.native
  /**
    move current window to target position or shift it by passed distance
    **/
  def move(x: Double, y: Double, bShift: Boolean): Unit = js.native
  /**
    resize current window to target width/height
    **/
  def resize(width: Double, height: Double): Unit = js.native
  /**
    restore current window, it could be maximized or cascade status
    **/
  def restore(): Unit = js.native
  /**
    select current window, it will increase the original z-index value with 2
    **/
  def select(): Unit = js.native
  /**
    change frame content
    **/
  def setContent(content: String): Unit = js.native
  def setContent(content: JQuery): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  /**
    change footer content
    **/
  def setFooterContent(content: String): Unit = js.native
  def setFooterContent(content: JQuery): Unit = js.native
  def setFooterContent(content: HTMLElement): Unit = js.native
  /**
    set window icon
    **/
  def setIcon(iconUrl: String): Unit = js.native
  /**
    change window title
    **/
  def setTitle(title: String): Unit = js.native
  /**
    change iframe url
    **/
  def setUrl(url: String): Unit = js.native
  /**
    show current window
    **/
  def show(): Unit = js.native
  /**
    show window icon
    **/
  def showIcon(): Unit = js.native
  /**
    unselect current window, it will set the z-index as original options.z
    **/
  def unselect(): Unit = js.native
}

