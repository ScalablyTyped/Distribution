package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SegmentVector")
@js.native
open class SegmentVector () extends StObject {
  def this(segments: js.Array[Segment]) = this()
  
  def destroy(): scala.Unit = js.native
  
  def get(): js.Array[Segment] = js.native
  
  def prepareSegment(numVertices: Double, layoutVertexArray: StructArray, indexArray: StructArray): Segment = js.native
  def prepareSegment(numVertices: Double, layoutVertexArray: StructArray, indexArray: StructArray, sortKey: Double): Segment = js.native
  
  var segments: js.Array[Segment] = js.native
}
/* static members */
object SegmentVector {
  
  @JSImport("maplibre-gl", "SegmentVector")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "SegmentVector.MAX_VERTEX_ARRAY_LENGTH")
  @js.native
  def MAX_VERTEX_ARRAY_LENGTH: Double = js.native
  inline def MAX_VERTEX_ARRAY_LENGTH_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VERTEX_ARRAY_LENGTH")(x.asInstanceOf[js.Any])
  
  inline def simpleSegment(vertexOffset: Double, primitiveOffset: Double, vertexLength: Double, primitiveLength: Double): SegmentVector = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleSegment")(vertexOffset.asInstanceOf[js.Any], primitiveOffset.asInstanceOf[js.Any], vertexLength.asInstanceOf[js.Any], primitiveLength.asInstanceOf[js.Any])).asInstanceOf[SegmentVector]
}
