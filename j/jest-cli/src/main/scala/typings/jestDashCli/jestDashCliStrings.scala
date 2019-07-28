package typings.jestDashCli

import typings.jestDashCli.jestDashCliMod.LogType
import typings.jestDashCli.jestDashCliMod.SnapshotUpdateState
import typings.jestDashCli.jestDashCliMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jestDashCliStrings {
  @js.native
  sealed trait all extends SnapshotUpdateState
  
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
  sealed trait failed extends Status
  
  @js.native
  sealed trait group extends LogType
  
  @js.native
  sealed trait groupCollapsed extends LogType
  
  @js.native
  sealed trait info extends LogType
  
  @js.native
  sealed trait log extends LogType
  
  @js.native
  sealed trait `new` extends SnapshotUpdateState
  
  @js.native
  sealed trait none extends SnapshotUpdateState
  
  @js.native
  sealed trait passed extends Status
  
  @js.native
  sealed trait pending extends Status
  
  @js.native
  sealed trait skipped extends Status
  
  @js.native
  sealed trait time extends LogType
  
  @js.native
  sealed trait warn extends LogType
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
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
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def groupCollapsed: groupCollapsed = "groupCollapsed".asInstanceOf[groupCollapsed]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def passed: passed = "passed".asInstanceOf[passed]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

