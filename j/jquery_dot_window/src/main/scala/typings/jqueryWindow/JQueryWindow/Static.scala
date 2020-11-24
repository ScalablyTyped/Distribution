package typings.jqueryWindow.JQueryWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Static methods
@js.native
trait Static extends js.Object {
  
  def apply(options: WindowOptions): Window = js.native
  
  /**
    close all created windows
    **/
  def closeAll(): Unit = js.native
  def closeAll(quiet: Boolean): Unit = js.native
  
  /**
    return all created windows instance
    **/
  def getAll(): js.Array[Window] = js.native
  
  /**
    get the selected window instance
    **/
  def getSelectedWindow(): Window = js.native
  
  /**
    get the window instance by passed window id
    **/
  def getWindow(windowId: String): Window = js.native
  
  /**
    hide all created windows
    **/
  def hideAll(): Unit = js.native
  
  /**
    initialize with customerized static setting attributes
    **/
  def prepare(): Unit = js.native
  def prepare(options: StaticOptions): Unit = js.native
  
  /**
    show all created windows
    **/
  def showAll(): Unit = js.native
}
