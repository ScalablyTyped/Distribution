package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "StructArrayLayout8i15ui1ul4f68")
@js.native
open class StructArrayLayout8i15ui1ul4f68 ()
  extends StObject
     with StructArray {
  
  /**
  	 * Create TypedArray views for the current ArrayBuffer.
  	 */
  /* CompleteClass */
  override def _refreshViews(): scala.Unit = js.native
  
  /**
  	 * Resize the array to discard unused capacity.
  	 */
  /* CompleteClass */
  override def _trim(): scala.Unit = js.native
  
  /* CompleteClass */
  var arrayBuffer: js.typedarray.ArrayBuffer = js.native
  
  /* CompleteClass */
  var bytesPerElement: Double = js.native
  
  /* CompleteClass */
  var capacity: Double = js.native
  
  /**
  	 * Resets the the length of the array to 0 without de-allocating capcacity.
  	 */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  
  def emplace(
    i: Double,
    v0: Double,
    v1: Double,
    v2: Double,
    v3: Double,
    v4: Double,
    v5: Double,
    v6: Double,
    v7: Double,
    v8: Double,
    v9: Double,
    v10: Double,
    v11: Double,
    v12: Double,
    v13: Double,
    v14: Double,
    v15: Double,
    v16: Double,
    v17: Double,
    v18: Double,
    v19: Double,
    v20: Double,
    v21: Double,
    v22: Double,
    v23: Double,
    v24: Double,
    v25: Double,
    v26: Double,
    v27: Double
  ): Double = js.native
  /* CompleteClass */
  override def emplace(i: Double, v: Double*): Any = js.native
  
  def emplaceBack(
    v0: Double,
    v1: Double,
    v2: Double,
    v3: Double,
    v4: Double,
    v5: Double,
    v6: Double,
    v7: Double,
    v8: Double,
    v9: Double,
    v10: Double,
    v11: Double,
    v12: Double,
    v13: Double,
    v14: Double,
    v15: Double,
    v16: Double,
    v17: Double,
    v18: Double,
    v19: Double,
    v20: Double,
    v21: Double,
    v22: Double,
    v23: Double,
    v24: Double,
    v25: Double,
    v26: Double,
    v27: Double
  ): Double = js.native
  /* CompleteClass */
  override def emplaceBack(v: Double*): Any = js.native
  
  var float32: js.typedarray.Float32Array = js.native
  
  var int16: js.typedarray.Int16Array = js.native
  
  /* CompleteClass */
  var isTransferred: Boolean = js.native
  
  /* CompleteClass */
  var length: Double = js.native
  
  /* CompleteClass */
  var members: js.Array[StructArrayMember] = js.native
  
  /**
  	 * Indicate a planned increase in size, so that any necessary allocation may
  	 * be done once, ahead of time.
  	 * @param {number} n The expected size of the array.
  	 */
  /* CompleteClass */
  override def reserve(n: Double): scala.Unit = js.native
  
  /**
  	 * Resize the array.
  	 * If `n` is greater than the current length then additional elements with undefined values are added.
  	 * If `n` is less than the current length then the array will be reduced to the first `n` elements.
  	 * @param {number} n The new size of the array.
  	 */
  /* CompleteClass */
  override def resize(n: Double): scala.Unit = js.native
  
  var uint16: js.typedarray.Uint16Array = js.native
  
  var uint32: js.typedarray.Uint32Array = js.native
  
  /* CompleteClass */
  var uint8: js.typedarray.Uint8Array = js.native
}
