package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait logLevel extends js.Object

@JSImport("kafkajs", "logLevel")
@js.native
object logLevel extends js.Object {
  @js.native
  sealed trait DEBUG extends logLevel
  
  @js.native
  sealed trait ERROR extends logLevel
  
  @js.native
  sealed trait INFO extends logLevel
  
  @js.native
  sealed trait NOTHING extends logLevel
  
  @js.native
  sealed trait WARN extends logLevel
  
  /* 5 */ val DEBUG: typings.kafkajs.kafkajsMod.logLevel.DEBUG with Double = js.native
  /* 1 */ val ERROR: typings.kafkajs.kafkajsMod.logLevel.ERROR with Double = js.native
  /* 4 */ val INFO: typings.kafkajs.kafkajsMod.logLevel.INFO with Double = js.native
  /* 0 */ val NOTHING: typings.kafkajs.kafkajsMod.logLevel.NOTHING with Double = js.native
  /* 2 */ val WARN: typings.kafkajs.kafkajsMod.logLevel.WARN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[logLevel with Double] = js.native
}

