package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteBuffer extends StObject {
  
  var buffer: js.typedarray.Uint8Array
  
  def get(index: Double): Double
  
  def getInt(index: Double): Double
  
  def getShort(index: Double): Double
  
  def getString(index: Double): String
  
  var position: Double
  
  def put(b: Double): Unit
  
  def putInt(num: Double): Unit
  
  def putShort(num: Double): Unit
  
  def putString(str: String): Unit
  
  def readInt(): Double
  
  def reallocate(): Unit
  
  def shrink(): js.typedarray.Uint8Array
  
  def size(): Double
}
object ByteBuffer {
  
  inline def apply(
    buffer: js.typedarray.Uint8Array,
    get: Double => Double,
    getInt: Double => Double,
    getShort: Double => Double,
    getString: Double => String,
    position: Double,
    put: Double => Unit,
    putInt: Double => Unit,
    putShort: Double => Unit,
    putString: String => Unit,
    readInt: () => Double,
    reallocate: () => Unit,
    shrink: () => js.typedarray.Uint8Array,
    size: () => Double
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getInt = js.Any.fromFunction1(getInt), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), position = position.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), putInt = js.Any.fromFunction1(putInt), putShort = js.Any.fromFunction1(putShort), putString = js.Any.fromFunction1(putString), readInt = js.Any.fromFunction0(readInt), reallocate = js.Any.fromFunction0(reallocate), shrink = js.Any.fromFunction0(shrink), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ByteBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ByteBuffer] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Double => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetInt(value: Double => Double): Self = StObject.set(x, "getInt", js.Any.fromFunction1(value))
    
    inline def setGetShort(value: Double => Double): Self = StObject.set(x, "getShort", js.Any.fromFunction1(value))
    
    inline def setGetString(value: Double => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Double => Unit): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    
    inline def setPutInt(value: Double => Unit): Self = StObject.set(x, "putInt", js.Any.fromFunction1(value))
    
    inline def setPutShort(value: Double => Unit): Self = StObject.set(x, "putShort", js.Any.fromFunction1(value))
    
    inline def setPutString(value: String => Unit): Self = StObject.set(x, "putString", js.Any.fromFunction1(value))
    
    inline def setReadInt(value: () => Double): Self = StObject.set(x, "readInt", js.Any.fromFunction0(value))
    
    inline def setReallocate(value: () => Unit): Self = StObject.set(x, "reallocate", js.Any.fromFunction0(value))
    
    inline def setShrink(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "shrink", js.Any.fromFunction0(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
