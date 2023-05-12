package typings.kdbush

import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kdbush", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with KDBush {
    /**
      * Creates an index that will hold a given number of items.
      * @param {number} numItems
      * @param {number} [nodeSize=64] Size of the KD-tree node (64 by default).
      * @param {TypedArrayConstructor} [ArrayType=Float64Array] The array type used for coordinates storage (`Float64Array` by default).
      * @param {ArrayBuffer} [data] (For internal use only)
      */
    def this(numItems: Double) = this()
    def this(numItems: Double, nodeSize: Double) = this()
    def this(numItems: Double, nodeSize: Double, ArrayType: TypedArrayConstructor) = this()
    def this(numItems: Double, nodeSize: Unit, ArrayType: TypedArrayConstructor) = this()
    def this(numItems: Double, nodeSize: Double, ArrayType: Unit, data: js.typedarray.ArrayBuffer) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(numItems: Double, nodeSize: Unit, ArrayType: Unit, data: js.typedarray.ArrayBuffer) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    
    /* CompleteClass */
    var ArrayType: TypedArrayConstructor = js.native
    
    /* CompleteClass */
    var IndexArrayType: Uint16ArrayConstructor | Uint32ArrayConstructor = js.native
    
    /* CompleteClass */
    var _finished: Boolean = js.native
    
    /* CompleteClass */
    var _pos: Double = js.native
    
    /**
      * Add a point to the index.
      * @param {number} x
      * @param {number} y
      * @returns {number} An incremental index associated with the added item (starting from `0`).
      */
    /* CompleteClass */
    override def add(x: Double, y: Double): Double = js.native
    
    /* CompleteClass */
    var coords: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
    
    /* CompleteClass */
    var data: js.typedarray.ArrayBuffer = js.native
    
    /**
      * Perform indexing of the added points.
      */
    /* CompleteClass */
    override def finish(): KDBush = js.native
    
    /* CompleteClass */
    var ids: js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
    
    /* CompleteClass */
    var nodeSize: Double = js.native
    
    /* CompleteClass */
    var numItems: Double = js.native
    
    /**
      * Search the index for items within a given bounding box.
      * @param {number} minX
      * @param {number} minY
      * @param {number} maxX
      * @param {number} maxY
      * @returns {number[]} An array of indices correponding to the found items.
      */
    /* CompleteClass */
    override def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
    
    /**
      * Search the index for items within a given radius.
      * @param {number} qx
      * @param {number} qy
      * @param {number} r Query radius.
      * @returns {number[]} An array of indices correponding to the found items.
      */
    /* CompleteClass */
    override def within(qx: Double, qy: Double, r: Double): js.Array[Double] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("kdbush", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an index from raw `ArrayBuffer` data.
      * @param {ArrayBuffer} data
      */
    inline def from(data: js.typedarray.ArrayBuffer): KDBush = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[KDBush]
  }
  
  trait KDBush extends StObject {
    
    var ArrayType: TypedArrayConstructor
    
    var IndexArrayType: Uint16ArrayConstructor | Uint32ArrayConstructor
    
    var _finished: Boolean
    
    var _pos: Double
    
    /**
      * Add a point to the index.
      * @param {number} x
      * @param {number} y
      * @returns {number} An incremental index associated with the added item (starting from `0`).
      */
    def add(x: Double, y: Double): Double
    
    var coords: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    
    var data: js.typedarray.ArrayBuffer
    
    /**
      * Perform indexing of the added points.
      */
    def finish(): KDBush
    
    var ids: js.typedarray.Uint16Array | js.typedarray.Uint32Array
    
    var nodeSize: Double
    
    var numItems: Double
    
    /**
      * Search the index for items within a given bounding box.
      * @param {number} minX
      * @param {number} minY
      * @param {number} maxX
      * @param {number} maxY
      * @returns {number[]} An array of indices correponding to the found items.
      */
    def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double]
    
    /**
      * Search the index for items within a given radius.
      * @param {number} qx
      * @param {number} qy
      * @param {number} r Query radius.
      * @returns {number[]} An array of indices correponding to the found items.
      */
    def within(qx: Double, qy: Double, r: Double): js.Array[Double]
  }
  object KDBush {
    
    inline def apply(
      ArrayType: TypedArrayConstructor,
      IndexArrayType: Uint16ArrayConstructor | Uint32ArrayConstructor,
      _finished: Boolean,
      _pos: Double,
      add: (Double, Double) => Double,
      coords: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array,
      data: js.typedarray.ArrayBuffer,
      finish: () => KDBush,
      ids: js.typedarray.Uint16Array | js.typedarray.Uint32Array,
      nodeSize: Double,
      numItems: Double,
      range: (Double, Double, Double, Double) => js.Array[Double],
      within: (Double, Double, Double) => js.Array[Double]
    ): KDBush = {
      val __obj = js.Dynamic.literal(ArrayType = ArrayType.asInstanceOf[js.Any], IndexArrayType = IndexArrayType.asInstanceOf[js.Any], _finished = _finished.asInstanceOf[js.Any], _pos = _pos.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), coords = coords.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), ids = ids.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], numItems = numItems.asInstanceOf[js.Any], range = js.Any.fromFunction4(range), within = js.Any.fromFunction3(within))
      __obj.asInstanceOf[KDBush]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KDBush] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (Double, Double) => Double): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setArrayType(value: TypedArrayConstructor): Self = StObject.set(x, "ArrayType", value.asInstanceOf[js.Any])
      
      inline def setCoords(
        value: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
      ): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: () => KDBush): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setIds(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIndexArrayType(value: Uint16ArrayConstructor | Uint32ArrayConstructor): Self = StObject.set(x, "IndexArrayType", value.asInstanceOf[js.Any])
      
      inline def setNodeSize(value: Double): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNumItems(value: Double): Self = StObject.set(x, "numItems", value.asInstanceOf[js.Any])
      
      inline def setRange(value: (Double, Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "range", js.Any.fromFunction4(value))
      
      inline def setWithin(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "within", js.Any.fromFunction3(value))
      
      inline def set_finished(value: Boolean): Self = StObject.set(x, "_finished", value.asInstanceOf[js.Any])
      
      inline def set_pos(value: Double): Self = StObject.set(x, "_pos", value.asInstanceOf[js.Any])
    }
  }
  
  type TypedArrayConstructor = Int8ArrayConstructor | Uint8ArrayConstructor | Uint8ClampedArrayConstructor | Int16ArrayConstructor | Uint16ArrayConstructor | Int32ArrayConstructor | Uint32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor
}
