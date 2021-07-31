package typings.limiter

import typings.limiter.mod._Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limiterStrings {
  
  @js.native
  sealed trait day
    extends StObject
       with _Interval
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait hour
    extends StObject
       with _Interval
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait hr
    extends StObject
       with _Interval
  @scala.inline
  def hr: hr = "hr".asInstanceOf[hr]
  
  @js.native
  sealed trait min
    extends StObject
       with _Interval
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait minute
    extends StObject
       with _Interval
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait sec
    extends StObject
       with _Interval
  @scala.inline
  def sec: sec = "sec".asInstanceOf[sec]
  
  @js.native
  sealed trait second
    extends StObject
       with _Interval
  @scala.inline
  def second: second = "second".asInstanceOf[second]
}
