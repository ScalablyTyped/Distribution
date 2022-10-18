package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackedarrayPackedArrayMod {
  
  @JSImport("hdr-histogram-js/dist/packedarray/PackedArray", "PackedArray")
  @js.native
  open class PackedArray protected () extends StObject {
    def this(virtualLength: Double) = this()
    def this(virtualLength: Double, initialPhysicalLength: Double) = this()
    
    /**
      * Add to a value at a virtual index in the array
      * @param index the virtual index of the value to be added to
      * @param value the value to add
      */
    def add(index: Double, value: Double): Unit = js.native
    
    /* private */ var arrayContext: Any = js.native
    
    /**
      * Clear the array contents
      */
    def clear(): Unit = js.native
    
    /**
      * Get value at virtual index in the array
      * @param index the virtual array index
      * @return the array value at the virtual index given
      */
    def get(index: Double): Double = js.native
    
    /**
      * Get the current physical length (in longs) of the array's backing storage
      * @return the current physical length (in longs) of the array's current backing storage
      */
    def getPhysicalLength(): Double = js.native
    
    /**
      * Increment value at a virrual index in the array
      * @param index virtual index of value to increment
      */
    def increment(index: Double): Unit = js.native
    
    /**
      * Get the (virtual) length of the array
      * @return the (virtual) length of the array
      */
    def length(): Double = js.native
    
    /* private */ var safeGetPackedIndexgetPackedIndex: Any = js.native
    
    /**
      * Set the value at a virtual index in the array
      * @param index the virtual index of the value to set
      * @param value the value to set
      */
    def set(index: Double, value: Double): Unit = js.native
    
    def setVirtualLength(newVirtualArrayLength: Double): Unit = js.native
  }
}
