package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressionTypes extends StObject
@JSImport("kafkajs", "CompressionTypes")
@js.native
object CompressionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionTypes & Double] = js.native
  
  @js.native
  sealed trait GZIP
    extends StObject
       with CompressionTypes
  /* 1 */ val GZIP: typings.kafkajs.mod.CompressionTypes.GZIP & Double = js.native
  
  @js.native
  sealed trait LZ4
    extends StObject
       with CompressionTypes
  /* 3 */ val LZ4: typings.kafkajs.mod.CompressionTypes.LZ4 & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CompressionTypes
  /* 0 */ val None: typings.kafkajs.mod.CompressionTypes.None & Double = js.native
  
  @js.native
  sealed trait Snappy
    extends StObject
       with CompressionTypes
  /* 2 */ val Snappy: typings.kafkajs.mod.CompressionTypes.Snappy & Double = js.native
  
  @js.native
  sealed trait ZSTD
    extends StObject
       with CompressionTypes
  /* 4 */ val ZSTD: typings.kafkajs.mod.CompressionTypes.ZSTD & Double = js.native
}
