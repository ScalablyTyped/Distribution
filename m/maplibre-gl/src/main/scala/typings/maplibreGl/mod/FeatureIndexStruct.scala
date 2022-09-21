package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "FeatureIndexStruct")
@js.native
open class FeatureIndexStruct protected () extends Struct {
  /**
  	 * @param {StructArray} structArray The StructArray the struct is stored in
  	 * @param {number} index The index of the struct in the StructArray.
  	 * @private
  	 */
  def this(structArray: StructArray, index: Double) = this()
  
  @JSName("_structArray")
  var _structArray_FeatureIndexStruct: FeatureIndexArray = js.native
  
  def bucketIndex: Double = js.native
  
  def featureIndex: Double = js.native
  
  def sourceLayerIndex: Double = js.native
}
