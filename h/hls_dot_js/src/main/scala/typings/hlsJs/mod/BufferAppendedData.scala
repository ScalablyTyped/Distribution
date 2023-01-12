package typings.hlsJs.mod

import typings.hlsJs.anon.PartialRecordSourceBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferAppendedData extends StObject {
  
  var chunkMeta: ChunkMetadata
  
  var frag: Fragment
  
  var parent: PlaylistLevelType
  
  var part: Part | Null
  
  var timeRanges: PartialRecordSourceBuffer
  
  var `type`: SourceBufferName
}
object BufferAppendedData {
  
  inline def apply(
    chunkMeta: ChunkMetadata,
    frag: Fragment,
    parent: PlaylistLevelType,
    timeRanges: PartialRecordSourceBuffer,
    `type`: SourceBufferName
  ): BufferAppendedData = {
    val __obj = js.Dynamic.literal(chunkMeta = chunkMeta.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], timeRanges = timeRanges.asInstanceOf[js.Any], part = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferAppendedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferAppendedData] (val x: Self) extends AnyVal {
    
    inline def setChunkMeta(value: ChunkMetadata): Self = StObject.set(x, "chunkMeta", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setParent(value: PlaylistLevelType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
    
    inline def setTimeRanges(value: PartialRecordSourceBuffer): Self = StObject.set(x, "timeRanges", value.asInstanceOf[js.Any])
    
    inline def setType(value: SourceBufferName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
