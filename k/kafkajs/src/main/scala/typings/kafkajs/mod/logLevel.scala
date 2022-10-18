package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait logLevel extends StObject
@JSImport("kafkajs", "logLevel")
@js.native
object logLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[logLevel & Double] = js.native
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with logLevel
  /* 5 */ val DEBUG: typings.kafkajs.mod.logLevel.DEBUG & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with logLevel
  /* 1 */ val ERROR: typings.kafkajs.mod.logLevel.ERROR & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with logLevel
  /* 4 */ val INFO: typings.kafkajs.mod.logLevel.INFO & Double = js.native
  
  @js.native
  sealed trait NOTHING
    extends StObject
       with logLevel
  /* 0 */ val NOTHING: typings.kafkajs.mod.logLevel.NOTHING & Double = js.native
  
  @js.native
  sealed trait WARN
    extends StObject
       with logLevel
  /* 2 */ val WARN: typings.kafkajs.mod.logLevel.WARN & Double = js.native
}
