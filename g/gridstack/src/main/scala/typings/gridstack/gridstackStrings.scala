package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gridstackStrings {
  @js.native
  sealed trait added extends _GridStackEvent
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait change extends _GridStackEvent
  
  @js.native
  sealed trait disable extends _GridStackEvent
  
  @js.native
  sealed trait dragstart extends _GridStackEvent
  
  @js.native
  sealed trait dragstop extends _GridStackEvent
  
  @js.native
  sealed trait dropped extends _GridStackEvent
  
  @js.native
  sealed trait enable extends _GridStackEvent
  
  @js.native
  sealed trait gsresizestop extends _GridStackEvent
  
  @js.native
  sealed trait removed extends _GridStackEvent
  
  @js.native
  sealed trait resize extends _GridStackEvent
  
  @js.native
  sealed trait resizestart extends _GridStackEvent
  
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  @scala.inline
  def dragstop: dragstop = "dragstop".asInstanceOf[dragstop]
  @scala.inline
  def dropped: dropped = "dropped".asInstanceOf[dropped]
  @scala.inline
  def enable: enable = "enable".asInstanceOf[enable]
  @scala.inline
  def gsresizestop: gsresizestop = "gsresizestop".asInstanceOf[gsresizestop]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def resizestart: resizestart = "resizestart".asInstanceOf[resizestart]
}

