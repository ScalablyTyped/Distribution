package typings.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lolex.lolexStrings.setTimeout
  - typings.lolex.lolexStrings.clearTimeout
  - typings.lolex.lolexStrings.setImmediate
  - typings.lolex.lolexStrings.clearImmediate
  - typings.lolex.lolexStrings.setInterval
  - typings.lolex.lolexStrings.clearInterval
  - typings.lolex.lolexStrings.Date
  - typings.lolex.lolexStrings.nextTick
  - typings.lolex.lolexStrings.hrtime
  - typings.lolex.lolexStrings.requestAnimationFrame
  - typings.lolex.lolexStrings.cancelAnimationFrame
  - typings.lolex.lolexStrings.requestIdleCallback
  - typings.lolex.lolexStrings.cancelIdleCallback
*/
trait FakeMethod extends js.Object

object FakeMethod {
  @scala.inline
  def Date: typings.lolex.lolexStrings.Date = this.cast("Date")
  @scala.inline
  def cancelAnimationFrame: typings.lolex.lolexStrings.cancelAnimationFrame = this.cast("cancelAnimationFrame")
  @scala.inline
  def cancelIdleCallback: typings.lolex.lolexStrings.cancelIdleCallback = this.cast("cancelIdleCallback")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clearImmediate: typings.lolex.lolexStrings.clearImmediate = this.cast("clearImmediate")
  @scala.inline
  def clearInterval: typings.lolex.lolexStrings.clearInterval = this.cast("clearInterval")
  @scala.inline
  def clearTimeout: typings.lolex.lolexStrings.clearTimeout = this.cast("clearTimeout")
  @scala.inline
  def hrtime: typings.lolex.lolexStrings.hrtime = this.cast("hrtime")
  @scala.inline
  def nextTick: typings.lolex.lolexStrings.nextTick = this.cast("nextTick")
  @scala.inline
  def requestAnimationFrame: typings.lolex.lolexStrings.requestAnimationFrame = this.cast("requestAnimationFrame")
  @scala.inline
  def requestIdleCallback: typings.lolex.lolexStrings.requestIdleCallback = this.cast("requestIdleCallback")
  @scala.inline
  def setImmediate: typings.lolex.lolexStrings.setImmediate = this.cast("setImmediate")
  @scala.inline
  def setInterval: typings.lolex.lolexStrings.setInterval = this.cast("setInterval")
  @scala.inline
  def setTimeout: typings.lolex.lolexStrings.setTimeout = this.cast("setTimeout")
}

