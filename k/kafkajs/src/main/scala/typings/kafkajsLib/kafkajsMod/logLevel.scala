package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait logLevel extends js.Object

@JSImport("kafkajs", "logLevel")
@js.native
object logLevel extends js.Object {
  @js.native
  sealed trait DEBUG
    extends kafkajsLib.kafkajsMod.logLevel
  
  @js.native
  sealed trait ERROR
    extends kafkajsLib.kafkajsMod.logLevel
  
  @js.native
  sealed trait INFO
    extends kafkajsLib.kafkajsMod.logLevel
  
  @js.native
  sealed trait NOTHING
    extends kafkajsLib.kafkajsMod.logLevel
  
  @js.native
  sealed trait WARN
    extends kafkajsLib.kafkajsMod.logLevel
  
  /* 5 */ val DEBUG: DEBUG with scala.Double = js.native
  /* 1 */ val ERROR: ERROR with scala.Double = js.native
  /* 4 */ val INFO: INFO with scala.Double = js.native
  /* 0 */ val NOTHING: NOTHING with scala.Double = js.native
  /* 2 */ val WARN: WARN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kafkajsLib.kafkajsMod.logLevel with scala.Double] = js.native
}

