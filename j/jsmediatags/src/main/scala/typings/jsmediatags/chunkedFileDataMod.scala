package typings.jsmediatags

import typings.jsmediatags.anon.EndIx
import typings.jsmediatags.typesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chunkedFileDataMod {
  
  @JSImport("jsmediatags/build2/ChunkedFileData", JSImport.Default)
  @js.native
  class default () extends ChunkedFileData
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ChunkedFileData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsmediatags/build2/ChunkedFileData", "default.NOT_FOUND")
    @js.native
    def NOT_FOUND: Double = js.native
    @scala.inline
    def NOT_FOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ChunkedFileData extends StObject {
    
    def _concatData(dataA: DataType, dataB: DataType): DataType = js.native
    
    def _getChunkRange(offsetStart: Double, offsetEnd: Double): EndIx = js.native
    
    def _sliceData(data: DataType, begin: Double, end: Double): DataType = js.native
    
    def addData(offset: Double, data: DataType): Unit = js.native
    
    def getByteAt(offset: Double): js.Any = js.native
    
    def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean = js.native
  }
  object ChunkedFileData {
    
    @scala.inline
    def apply(
      _concatData: (DataType, DataType) => DataType,
      _getChunkRange: (Double, Double) => EndIx,
      _sliceData: (DataType, Double, Double) => DataType,
      addData: (Double, DataType) => Unit,
      getByteAt: Double => js.Any,
      hasDataRange: (Double, Double) => Boolean
    ): ChunkedFileData = {
      val __obj = js.Dynamic.literal(_concatData = js.Any.fromFunction2(_concatData), _getChunkRange = js.Any.fromFunction2(_getChunkRange), _sliceData = js.Any.fromFunction3(_sliceData), addData = js.Any.fromFunction2(addData), getByteAt = js.Any.fromFunction1(getByteAt), hasDataRange = js.Any.fromFunction2(hasDataRange))
      __obj.asInstanceOf[ChunkedFileData]
    }
    
    @scala.inline
    implicit class ChunkedFileDataMutableBuilder[Self <: ChunkedFileData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddData(value: (Double, DataType) => Unit): Self = StObject.set(x, "addData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetByteAt(value: Double => js.Any): Self = StObject.set(x, "getByteAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasDataRange(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasDataRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_concatData(value: (DataType, DataType) => DataType): Self = StObject.set(x, "_concatData", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_getChunkRange(value: (Double, Double) => EndIx): Self = StObject.set(x, "_getChunkRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_sliceData(value: (DataType, Double, Double) => DataType): Self = StObject.set(x, "_sliceData", js.Any.fromFunction3(value))
    }
  }
}
