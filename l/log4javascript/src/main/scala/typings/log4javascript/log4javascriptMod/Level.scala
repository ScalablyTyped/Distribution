package typings.log4javascript.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Level extends js.Object

@JSImport("log4javascript", "Level")
@js.native
object Level extends js.Object {
  @js.native
  sealed trait ALL extends Level
  
  @js.native
  sealed trait DEBUG extends Level
  
  @js.native
  sealed trait ERROR extends Level
  
  @js.native
  sealed trait FATAL extends Level
  
  @js.native
  sealed trait INFO extends Level
  
  @js.native
  sealed trait OFF extends Level
  
  @js.native
  sealed trait TRACE extends Level
  
  @js.native
  sealed trait WARN extends Level
  
  /* 0 */ val ALL: typings.log4javascript.log4javascriptMod.Level.ALL with Double = js.native
  /* 2 */ val DEBUG: typings.log4javascript.log4javascriptMod.Level.DEBUG with Double = js.native
  /* 5 */ val ERROR: typings.log4javascript.log4javascriptMod.Level.ERROR with Double = js.native
  /* 6 */ val FATAL: typings.log4javascript.log4javascriptMod.Level.FATAL with Double = js.native
  /* 3 */ val INFO: typings.log4javascript.log4javascriptMod.Level.INFO with Double = js.native
  /* 7 */ val OFF: typings.log4javascript.log4javascriptMod.Level.OFF with Double = js.native
  /* 1 */ val TRACE: typings.log4javascript.log4javascriptMod.Level.TRACE with Double = js.native
  /* 4 */ val WARN: typings.log4javascript.log4javascriptMod.Level.WARN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
}

