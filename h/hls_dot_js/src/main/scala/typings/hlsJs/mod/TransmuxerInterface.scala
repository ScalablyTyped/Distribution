package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransmuxerInterface extends StObject {
  
  /* private */ var configureTransmuxer: Any = js.native
  
  def destroy(): Unit = js.native
  
  def flush(chunkMeta: ChunkMetadata): Unit = js.native
  
  /* private */ var frag: Any = js.native
  
  /* private */ var handleFlushResult: Any = js.native
  
  /* private */ var handleTransmuxComplete: Any = js.native
  
  /* private */ var hls: Any = js.native
  
  /* private */ var id: Any = js.native
  
  /* private */ var observer: Any = js.native
  
  /* private */ var onFlush: Any = js.native
  
  /* private */ var onTransmuxComplete: Any = js.native
  
  /* private */ var onWorkerMessage: Any = js.native
  
  /* private */ var onwmsg: Any = js.native
  
  /* private */ var part: Any = js.native
  
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: js.typedarray.Uint8Array,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: String,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: String,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Null,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata
  ): Unit = js.native
  def push(
    data: js.typedarray.ArrayBuffer,
    initSegmentData: Unit,
    audioCodec: Unit,
    videoCodec: Unit,
    frag: Fragment,
    part: Part,
    duration: Double,
    accurateTimeOffset: Boolean,
    chunkMeta: ChunkMetadata,
    defaultInitPTS: Double
  ): Unit = js.native
  
  /* private */ var transmuxer: Any = js.native
  
  /* private */ var useWorker: Any = js.native
  
  /* private */ var worker: Any = js.native
}
