package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferAppendingData extends StObject {
  
  var chunkMeta: ChunkMetadata
  
  var data: js.typedarray.Uint8Array
  
  var frag: Fragment
  
  var parent: PlaylistLevelType
  
  var part: Part | Null
  
  var `type`: SourceBufferName
}
object BufferAppendingData {
  
  inline def apply(
    chunkMeta: ChunkMetadata,
    data: js.typedarray.Uint8Array,
    frag: Fragment,
    parent: PlaylistLevelType,
    `type`: SourceBufferName
  ): BufferAppendingData = {
    val __obj = js.Dynamic.literal(chunkMeta = chunkMeta.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], part = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferAppendingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferAppendingData] (val x: Self) extends AnyVal {
    
    inline def setChunkMeta(value: ChunkMetadata): Self = StObject.set(x, "chunkMeta", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setParent(value: PlaylistLevelType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
    
    inline def setType(value: SourceBufferName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
