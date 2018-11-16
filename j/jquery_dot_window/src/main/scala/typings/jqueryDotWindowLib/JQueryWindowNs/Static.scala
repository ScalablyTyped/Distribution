package typings
package jqueryDotWindowLib.JQueryWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Static methods
@js.native
trait Static extends js.Object {
  def apply(options: WindowOptions): Window = js.native
  /**
          close all created windows
          **/
  def closeAll(): scala.Unit = js.native
  /**
          close all created windows
          **/
  def closeAll(quiet: scala.Boolean): scala.Unit = js.native
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
  def getWindow(windowId: java.lang.String): Window = js.native
  /**
          hide all created windows
          **/
  def hideAll(): scala.Unit = js.native
  /**
          initialize with customerized static setting attributes
          **/
  def prepare(): scala.Unit = js.native
  /**
          initialize with customerized static setting attributes
          **/
  def prepare(options: StaticOptions): scala.Unit = js.native
  /**
          show all created windows
          **/
  def showAll(): scala.Unit = js.native
}

