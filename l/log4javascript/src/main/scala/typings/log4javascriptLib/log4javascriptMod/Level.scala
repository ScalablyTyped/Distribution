package typings
package log4javascriptLib.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Level extends js.Object

@JSImport("log4javascript", "Level")
@js.native
object Level extends js.Object {
  @js.native
  sealed trait ALL
    extends log4javascriptLib.log4javascriptMod.Level
  
  @js.native
  sealed trait DEBUG
    extends log4javascriptLib.log4javascriptMod.Level
  
  @js.native
  sealed trait ERROR
    extends log4javascriptLib.log4javascriptMod.Level
  
  @js.native
  sealed trait FATAL
    extends log4javascriptLib.log4javascriptMod.Level
  
  @js.native
  sealed trait INFO
    extends log4javascriptLib.log4javascriptMod.Level
  
  @js.native
  sealed trait OFF
    extends log4javascriptLib.log4javascriptMod.Level
  
  @js.native
  sealed trait TRACE
    extends log4javascriptLib.log4javascriptMod.Level
  
  @js.native
  sealed trait WARN
    extends log4javascriptLib.log4javascriptMod.Level
  
  /* 0 */ val ALL: ALL with scala.Double = js.native
  /* 2 */ val DEBUG: DEBUG with scala.Double = js.native
  /* 5 */ val ERROR: ERROR with scala.Double = js.native
  /* 6 */ val FATAL: FATAL with scala.Double = js.native
  /* 3 */ val INFO: INFO with scala.Double = js.native
  /* 7 */ val OFF: OFF with scala.Double = js.native
  /* 1 */ val TRACE: TRACE with scala.Double = js.native
  /* 4 */ val WARN: WARN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[log4javascriptLib.log4javascriptMod.Level with scala.Double] = js.native
}

