package typings.log4javascript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Level extends js.Object
@JSImport("log4javascript", "Level")
@js.native
object Level extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
  
  @js.native
  sealed trait ALL extends Level
  /* 0 */ @js.native
  object ALL extends TopLevel[ALL with Double]
  
  @js.native
  sealed trait DEBUG extends Level
  /* 2 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  @js.native
  sealed trait ERROR extends Level
  /* 5 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait FATAL extends Level
  /* 6 */ @js.native
  object FATAL extends TopLevel[FATAL with Double]
  
  @js.native
  sealed trait INFO extends Level
  /* 3 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  @js.native
  sealed trait OFF extends Level
  /* 7 */ @js.native
  object OFF extends TopLevel[OFF with Double]
  
  @js.native
  sealed trait TRACE extends Level
  /* 1 */ @js.native
  object TRACE extends TopLevel[TRACE with Double]
  
  @js.native
  sealed trait WARN extends Level
  /* 4 */ @js.native
  object WARN extends TopLevel[WARN with Double]
}
