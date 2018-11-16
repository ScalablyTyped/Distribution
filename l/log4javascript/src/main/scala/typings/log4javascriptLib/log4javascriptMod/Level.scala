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
  
  val ALL: ALL with java.lang.String = js.native
  val DEBUG: DEBUG with java.lang.String = js.native
  val ERROR: ERROR with java.lang.String = js.native
  val FATAL: FATAL with java.lang.String = js.native
  val INFO: INFO with java.lang.String = js.native
  val OFF: OFF with java.lang.String = js.native
  val TRACE: TRACE with java.lang.String = js.native
  val WARN: WARN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[log4javascriptLib.log4javascriptMod.Level with java.lang.String] = js.native
}

