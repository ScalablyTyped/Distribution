package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CollisionBoxStruct")
@js.native
open class CollisionBoxStruct protected () extends Struct {
  /**
  	 * @param {StructArray} structArray The StructArray the struct is stored in
  	 * @param {number} index The index of the struct in the StructArray.
  	 * @private
  	 */
  def this(structArray: StructArray, index: Double) = this()
  
  @JSName("_structArray")
  var _structArray_CollisionBoxStruct: CollisionBoxArray = js.native
  
  def anchorPoint: ^ = js.native
  
  def anchorPointX: Double = js.native
  
  def anchorPointY: Double = js.native
  
  def bucketIndex: Double = js.native
  
  def featureIndex: Double = js.native
  
  def sourceLayerIndex: Double = js.native
  
  def x1: Double = js.native
  
  def x2: Double = js.native
  
  def y1: Double = js.native
  
  def y2: Double = js.native
}
