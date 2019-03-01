package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressionTypes extends js.Object

@JSImport("kafkajs", "CompressionTypes")
@js.native
object CompressionTypes extends js.Object {
  @js.native
  sealed trait GZIP
    extends kafkajsLib.kafkajsMod.CompressionTypes
  
  @js.native
  sealed trait LZ4
    extends kafkajsLib.kafkajsMod.CompressionTypes
  
  @js.native
  sealed trait None
    extends kafkajsLib.kafkajsMod.CompressionTypes
  
  @js.native
  sealed trait Snappy
    extends kafkajsLib.kafkajsMod.CompressionTypes
  
  @js.native
  sealed trait ZSTD
    extends kafkajsLib.kafkajsMod.CompressionTypes
  
  /* 1 */ val GZIP: GZIP with scala.Double = js.native
  /* 3 */ val LZ4: LZ4 with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Snappy: Snappy with scala.Double = js.native
  /* 4 */ val ZSTD: ZSTD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kafkajsLib.kafkajsMod.CompressionTypes with scala.Double] = js.native
}

