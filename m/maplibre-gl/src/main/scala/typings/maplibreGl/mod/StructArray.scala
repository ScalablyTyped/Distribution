package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructArray extends StObject {
  
  /**
  	 * Create TypedArray views for the current ArrayBuffer.
  	 */
  def _refreshViews(): scala.Unit
  
  /**
  	 * Resize the array to discard unused capacity.
  	 */
  def _trim(): scala.Unit
  
  var arrayBuffer: js.typedarray.ArrayBuffer
  
  var bytesPerElement: Double
  
  var capacity: Double
  
  /**
  	 * Resets the the length of the array to 0 without de-allocating capcacity.
  	 */
  def clear(): scala.Unit
  
  def emplace(i: Double, v: Double*): Any
  
  def emplaceBack(v: Double*): Any
  
  var isTransferred: Boolean
  
  var length: Double
  
  var members: js.Array[StructArrayMember]
  
  /**
  	 * Indicate a planned increase in size, so that any necessary allocation may
  	 * be done once, ahead of time.
  	 * @param {number} n The expected size of the array.
  	 */
  def reserve(n: Double): scala.Unit
  
  /**
  	 * Resize the array.
  	 * If `n` is greater than the current length then additional elements with undefined values are added.
  	 * If `n` is less than the current length then the array will be reduced to the first `n` elements.
  	 * @param {number} n The new size of the array.
  	 */
  def resize(n: Double): scala.Unit
  
  var uint8: js.typedarray.Uint8Array
}
object StructArray {
  
  inline def apply(
    _refreshViews: () => scala.Unit,
    _trim: () => scala.Unit,
    arrayBuffer: js.typedarray.ArrayBuffer,
    bytesPerElement: Double,
    capacity: Double,
    clear: () => scala.Unit,
    emplace: (Double, /* repeated */ Double) => Any,
    emplaceBack: /* repeated */ Double => Any,
    isTransferred: Boolean,
    length: Double,
    members: js.Array[StructArrayMember],
    reserve: Double => scala.Unit,
    resize: Double => scala.Unit,
    uint8: js.typedarray.Uint8Array
  ): StructArray = {
    val __obj = js.Dynamic.literal(_refreshViews = js.Any.fromFunction0(_refreshViews), _trim = js.Any.fromFunction0(_trim), arrayBuffer = arrayBuffer.asInstanceOf[js.Any], bytesPerElement = bytesPerElement.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), emplace = js.Any.fromFunction2(emplace), emplaceBack = js.Any.fromFunction1(emplaceBack), isTransferred = isTransferred.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], reserve = js.Any.fromFunction1(reserve), resize = js.Any.fromFunction1(resize), uint8 = uint8.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructArray] (val x: Self) extends AnyVal {
    
    inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setBytesPerElement(value: Double): Self = StObject.set(x, "bytesPerElement", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => scala.Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setEmplace(value: (Double, /* repeated */ Double) => Any): Self = StObject.set(x, "emplace", js.Any.fromFunction2(value))
    
    inline def setEmplaceBack(value: /* repeated */ Double => Any): Self = StObject.set(x, "emplaceBack", js.Any.fromFunction1(value))
    
    inline def setIsTransferred(value: Boolean): Self = StObject.set(x, "isTransferred", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[StructArrayMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: StructArrayMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setReserve(value: Double => scala.Unit): Self = StObject.set(x, "reserve", js.Any.fromFunction1(value))
    
    inline def setResize(value: Double => scala.Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setUint8(value: js.typedarray.Uint8Array): Self = StObject.set(x, "uint8", value.asInstanceOf[js.Any])
    
    inline def set_refreshViews(value: () => scala.Unit): Self = StObject.set(x, "_refreshViews", js.Any.fromFunction0(value))
    
    inline def set_trim(value: () => scala.Unit): Self = StObject.set(x, "_trim", js.Any.fromFunction0(value))
  }
}
