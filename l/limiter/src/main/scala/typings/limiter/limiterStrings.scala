package typings.limiter

import typings.limiter.mod._Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object limiterStrings {
  @js.native
  sealed trait day extends _Interval
  
  @js.native
  sealed trait hour extends _Interval
  
  @js.native
  sealed trait hr extends _Interval
  
  @js.native
  sealed trait min extends _Interval
  
  @js.native
  sealed trait minute extends _Interval
  
  @js.native
  sealed trait sec extends _Interval
  
  @js.native
  sealed trait second extends _Interval
  
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def hr: hr = "hr".asInstanceOf[hr]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def sec: sec = "sec".asInstanceOf[sec]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
}

