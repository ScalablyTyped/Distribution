package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConfigSource extends StObject
@JSImport("kafkajs", "ConfigSource")
@js.native
object ConfigSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigSource & Double] = js.native
  
  @js.native
  sealed trait DEFAULT_CONFIG
    extends StObject
       with ConfigSource
  /* 5 */ val DEFAULT_CONFIG: typings.kafkajs.mod.ConfigSource.DEFAULT_CONFIG & Double = js.native
  
  @js.native
  sealed trait DYNAMIC_BROKER_CONFIG
    extends StObject
       with ConfigSource
  /* 2 */ val DYNAMIC_BROKER_CONFIG: typings.kafkajs.mod.ConfigSource.DYNAMIC_BROKER_CONFIG & Double = js.native
  
  @js.native
  sealed trait DYNAMIC_BROKER_LOGGER_CONFIG
    extends StObject
       with ConfigSource
  /* 6 */ val DYNAMIC_BROKER_LOGGER_CONFIG: typings.kafkajs.mod.ConfigSource.DYNAMIC_BROKER_LOGGER_CONFIG & Double = js.native
  
  @js.native
  sealed trait DYNAMIC_DEFAULT_BROKER_CONFIG
    extends StObject
       with ConfigSource
  /* 3 */ val DYNAMIC_DEFAULT_BROKER_CONFIG: typings.kafkajs.mod.ConfigSource.DYNAMIC_DEFAULT_BROKER_CONFIG & Double = js.native
  
  @js.native
  sealed trait STATIC_BROKER_CONFIG
    extends StObject
       with ConfigSource
  /* 4 */ val STATIC_BROKER_CONFIG: typings.kafkajs.mod.ConfigSource.STATIC_BROKER_CONFIG & Double = js.native
  
  @js.native
  sealed trait TOPIC_CONFIG
    extends StObject
       with ConfigSource
  /* 1 */ val TOPIC_CONFIG: typings.kafkajs.mod.ConfigSource.TOPIC_CONFIG & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ConfigSource
  /* 0 */ val UNKNOWN: typings.kafkajs.mod.ConfigSource.UNKNOWN & Double = js.native
}
