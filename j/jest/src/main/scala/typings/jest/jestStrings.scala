package typings.jest

import typings.jest.jestMod.jestNs.LogType
import typings.jest.jestMod.jestNs.SnapshotUpdateState
import typings.jest.jestMod.jestNs.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jestStrings {
  @js.native
  sealed trait Matchers extends js.Object
  
  @js.native
  sealed trait Mocked extends js.Object
  
  @js.native
  sealed trait all extends SnapshotUpdateState
  
  @js.native
  sealed trait error extends LogType
  
  @js.native
  sealed trait failed extends Status
  
  @js.native
  sealed trait fake extends js.Object
  
  @js.native
  sealed trait get extends js.Object
  
  @js.native
  sealed trait incomplete extends js.Object
  
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
  sealed trait real extends js.Object
  
  @js.native
  sealed trait `return` extends js.Object
  
  @js.native
  sealed trait set extends js.Object
  
  @js.native
  sealed trait skipped extends Status
  
  @js.native
  sealed trait `throw` extends js.Object
  
  @js.native
  sealed trait warn extends LogType
  
  @scala.inline
  def Matchers: Matchers = "Matchers".asInstanceOf[Matchers]
  @scala.inline
  def Mocked: Mocked = "Mocked".asInstanceOf[Mocked]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fake: fake = "fake".asInstanceOf[fake]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
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
  def real: real = "real".asInstanceOf[real]
  @scala.inline
  def `return`: `return` = "return".asInstanceOf[`return`]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
  @scala.inline
  def `throw`: `throw` = "throw".asInstanceOf[`throw`]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

