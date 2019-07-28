package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressionTypes extends js.Object

@JSImport("kafkajs", "CompressionTypes")
@js.native
object CompressionTypes extends js.Object {
  @js.native
  sealed trait GZIP extends CompressionTypes
  
  @js.native
  sealed trait LZ4 extends CompressionTypes
  
  @js.native
  sealed trait None extends CompressionTypes
  
  @js.native
  sealed trait Snappy extends CompressionTypes
  
  @js.native
  sealed trait ZSTD extends CompressionTypes
  
  /* 1 */ val GZIP: typings.kafkajs.kafkajsMod.CompressionTypes.GZIP with Double = js.native
  /* 3 */ val LZ4: typings.kafkajs.kafkajsMod.CompressionTypes.LZ4 with Double = js.native
  /* 0 */ val None: typings.kafkajs.kafkajsMod.CompressionTypes.None with Double = js.native
  /* 2 */ val Snappy: typings.kafkajs.kafkajsMod.CompressionTypes.Snappy with Double = js.native
  /* 4 */ val ZSTD: typings.kafkajs.kafkajsMod.CompressionTypes.ZSTD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionTypes with Double] = js.native
}

