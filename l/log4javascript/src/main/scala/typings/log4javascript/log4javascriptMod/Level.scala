package typings.log4javascript.log4javascriptMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
  /* 0 */ @js.native
  object ALL extends TopLevel[ALL with Double]
  
  /* 2 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 5 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 6 */ @js.native
  object FATAL extends TopLevel[FATAL with Double]
  
  /* 3 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  /* 7 */ @js.native
  object OFF extends TopLevel[OFF with Double]
  
  /* 1 */ @js.native
  object TRACE extends TopLevel[TRACE with Double]
  
  /* 4 */ @js.native
  object WARN extends TopLevel[WARN with Double]
  
}

