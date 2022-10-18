package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResourcePatternTypes extends StObject
@JSImport("kafkajs", "ResourcePatternTypes")
@js.native
object ResourcePatternTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResourcePatternTypes & Double] = js.native
  
  @js.native
  sealed trait ANY
    extends StObject
       with ResourcePatternTypes
  /* 1 */ val ANY: typings.kafkajs.mod.ResourcePatternTypes.ANY & Double = js.native
  
  @js.native
  sealed trait LITERAL
    extends StObject
       with ResourcePatternTypes
  /* 3 */ val LITERAL: typings.kafkajs.mod.ResourcePatternTypes.LITERAL & Double = js.native
  
  @js.native
  sealed trait MATCH
    extends StObject
       with ResourcePatternTypes
  /* 2 */ val MATCH: typings.kafkajs.mod.ResourcePatternTypes.MATCH & Double = js.native
  
  @js.native
  sealed trait PREFIXED
    extends StObject
       with ResourcePatternTypes
  /* 4 */ val PREFIXED: typings.kafkajs.mod.ResourcePatternTypes.PREFIXED & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ResourcePatternTypes
  /* 0 */ val UNKNOWN: typings.kafkajs.mod.ResourcePatternTypes.UNKNOWN & Double = js.native
}
