package typings.hlsJs.mod

import typings.hlsJs.anon.keyinSourceBufferNameHlsC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "ChunkMetadata")
@js.native
open class ChunkMetadata protected () extends StObject {
  def this(level: Double, sn: Double, id: Double) = this()
  def this(level: Double, sn: Double, id: Double, size: Double) = this()
  def this(level: Double, sn: Double, id: Double, size: Double, part: Double) = this()
  def this(level: Double, sn: Double, id: Double, size: Unit, part: Double) = this()
  def this(level: Double, sn: Double, id: Double, size: Double, part: Double, partial: Boolean) = this()
  def this(level: Double, sn: Double, id: Double, size: Double, part: Unit, partial: Boolean) = this()
  def this(level: Double, sn: Double, id: Double, size: Unit, part: Double, partial: Boolean) = this()
  def this(level: Double, sn: Double, id: Double, size: Unit, part: Unit, partial: Boolean) = this()
  
  val buffering: keyinSourceBufferNameHlsC = js.native
  
  val id: Double = js.native
  
  val level: Double = js.native
  
  val part: Double = js.native
  
  val partial: Boolean = js.native
  
  val size: Double = js.native
  
  val sn: Double = js.native
  
  val transmuxing: HlsChunkPerformanceTiming = js.native
}
