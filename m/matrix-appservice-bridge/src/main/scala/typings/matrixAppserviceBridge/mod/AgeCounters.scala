package typings.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AgeCounters")
@js.native
/***
  * @param {String[]} counterPeriods A set of strings denoting the bucket periods
  * used by the gauge. It is in the format of '#X' where # is the integer period and
  * X is the unit of time. A unit can be one of 'h, d, w' for hours, days and weeks.
  * 7d would be 7 days. If not given, the periods are 1h, 1d and 7d.
  */
open class AgeCounters ()
  extends typings.matrixAppserviceBridge.libComponentsAgecountersMod.AgeCounters {
  def this(counterPeriods: js.Array[String]) = this()
}
