package typings.jestConsole

import typings.jestConsole.typesMod.LogType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jestConsoleStrings {
  @js.native
  sealed trait assert extends LogType
  
  @js.native
  sealed trait count extends LogType
  
  @js.native
  sealed trait debug extends LogType
  
  @js.native
  sealed trait dir extends LogType
  
  @js.native
  sealed trait dirxml extends LogType
  
  @js.native
  sealed trait error extends LogType
  
  @js.native
  sealed trait group extends LogType
  
  @js.native
  sealed trait groupCollapsed extends LogType
  
  @js.native
  sealed trait info extends LogType
  
  @js.native
  sealed trait log extends LogType
  
  @js.native
  sealed trait time extends LogType
  
  @js.native
  sealed trait warn extends LogType
  
  @scala.inline
  def assert: assert = "assert".asInstanceOf[assert]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  @scala.inline
  def dirxml: dirxml = "dirxml".asInstanceOf[dirxml]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def groupCollapsed: groupCollapsed = "groupCollapsed".asInstanceOf[groupCollapsed]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

