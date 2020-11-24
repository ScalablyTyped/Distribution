package typings.koa2Ratelimit

import typings.koa2Ratelimit.mod.TimeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object koa2RatelimitStrings {
  
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @scala.inline
  def ms: ms = "ms".asInstanceOf[ms]
  
  @scala.inline
  def sec: sec = "sec".asInstanceOf[sec]
  
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait day extends TimeKey
  
  @js.native
  sealed trait hour extends TimeKey
  
  @js.native
  sealed trait min extends TimeKey
  
  @js.native
  sealed trait month extends TimeKey
  
  @js.native
  sealed trait ms extends TimeKey
  
  @js.native
  sealed trait sec extends TimeKey
  
  @js.native
  sealed trait week extends TimeKey
  
  @js.native
  sealed trait year extends TimeKey
}
