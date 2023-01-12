package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typings.licenseWebpackPlugin.distWebpackChunkModuleMod.WebpackChunkModule
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChunkGraphMod {
  
  trait ChunkGraph extends StObject {
    
    def getChunkEntryModulesIterable(chunk: WebpackChunk): IterableIterator[WebpackChunkModule]
    
    def getChunkModulesIterable(chunk: WebpackChunk): IterableIterator[WebpackChunkModule]
  }
  object ChunkGraph {
    
    inline def apply(
      getChunkEntryModulesIterable: WebpackChunk => IterableIterator[WebpackChunkModule],
      getChunkModulesIterable: WebpackChunk => IterableIterator[WebpackChunkModule]
    ): ChunkGraph = {
      val __obj = js.Dynamic.literal(getChunkEntryModulesIterable = js.Any.fromFunction1(getChunkEntryModulesIterable), getChunkModulesIterable = js.Any.fromFunction1(getChunkModulesIterable))
      __obj.asInstanceOf[ChunkGraph]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChunkGraph] (val x: Self) extends AnyVal {
      
      inline def setGetChunkEntryModulesIterable(value: WebpackChunk => IterableIterator[WebpackChunkModule]): Self = StObject.set(x, "getChunkEntryModulesIterable", js.Any.fromFunction1(value))
      
      inline def setGetChunkModulesIterable(value: WebpackChunk => IterableIterator[WebpackChunkModule]): Self = StObject.set(x, "getChunkModulesIterable", js.Any.fromFunction1(value))
    }
  }
}
