package typings.jsmediatags

import typings.jsmediatags.anon.EndIx
import typings.jsmediatags.typesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2ChunkedFileDataMod {
  
  @JSImport("jsmediatags/build2/ChunkedFileData", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ChunkedFileData {
    
    /* CompleteClass */
    override def _concatData(dataA: DataType, dataB: DataType): DataType = js.native
    
    /* CompleteClass */
    override def _getChunkRange(offsetStart: Double, offsetEnd: Double): EndIx = js.native
    
    /* CompleteClass */
    override def _sliceData(data: DataType, begin: Double, end: Double): DataType = js.native
    
    /* CompleteClass */
    override def addData(offset: Double, data: DataType): Unit = js.native
    
    /* CompleteClass */
    override def getByteAt(offset: Double): Any = js.native
    
    /* CompleteClass */
    override def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ChunkedFileData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsmediatags/build2/ChunkedFileData", "default.NOT_FOUND")
    @js.native
    def NOT_FOUND: Double = js.native
    inline def NOT_FOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
  }
  
  trait ChunkedFileData extends StObject {
    
    def _concatData(dataA: DataType, dataB: DataType): DataType
    
    def _getChunkRange(offsetStart: Double, offsetEnd: Double): EndIx
    
    def _sliceData(data: DataType, begin: Double, end: Double): DataType
    
    def addData(offset: Double, data: DataType): Unit
    
    def getByteAt(offset: Double): Any
    
    def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean
  }
  object ChunkedFileData {
    
    inline def apply(
      _concatData: (DataType, DataType) => DataType,
      _getChunkRange: (Double, Double) => EndIx,
      _sliceData: (DataType, Double, Double) => DataType,
      addData: (Double, DataType) => Unit,
      getByteAt: Double => Any,
      hasDataRange: (Double, Double) => Boolean
    ): ChunkedFileData = {
      val __obj = js.Dynamic.literal(_concatData = js.Any.fromFunction2(_concatData), _getChunkRange = js.Any.fromFunction2(_getChunkRange), _sliceData = js.Any.fromFunction3(_sliceData), addData = js.Any.fromFunction2(addData), getByteAt = js.Any.fromFunction1(getByteAt), hasDataRange = js.Any.fromFunction2(hasDataRange))
      __obj.asInstanceOf[ChunkedFileData]
    }
    
    extension [Self <: ChunkedFileData](x: Self) {
      
      inline def setAddData(value: (Double, DataType) => Unit): Self = StObject.set(x, "addData", js.Any.fromFunction2(value))
      
      inline def setGetByteAt(value: Double => Any): Self = StObject.set(x, "getByteAt", js.Any.fromFunction1(value))
      
      inline def setHasDataRange(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasDataRange", js.Any.fromFunction2(value))
      
      inline def set_concatData(value: (DataType, DataType) => DataType): Self = StObject.set(x, "_concatData", js.Any.fromFunction2(value))
      
      inline def set_getChunkRange(value: (Double, Double) => EndIx): Self = StObject.set(x, "_getChunkRange", js.Any.fromFunction2(value))
      
      inline def set_sliceData(value: (DataType, Double, Double) => DataType): Self = StObject.set(x, "_sliceData", js.Any.fromFunction3(value))
    }
  }
}
