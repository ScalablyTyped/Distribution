package typings.maplibreGl.mod

import typings.maplibreGl.anon.Instantiable
import typings.maplibreGl.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CollisionBuffers")
@js.native
open class CollisionBuffers protected () extends StObject {
  def this(LayoutArray: Instantiable, layoutAttributes: js.Array[StructArrayMember], IndexArray: `1`) = this()
  
  var collisionVertexArray: CollisionVertexArray = js.native
  
  var collisionVertexBuffer: VertexBuffer = js.native
  
  def destroy(): scala.Unit = js.native
  
  var indexArray: TriangleIndexArray | LineIndexArray = js.native
  
  var indexBuffer: IndexBuffer = js.native
  
  var layoutAttributes: js.Array[StructArrayMember] = js.native
  
  var layoutVertexArray: StructArray = js.native
  
  var layoutVertexBuffer: VertexBuffer = js.native
  
  var segments: SegmentVector = js.native
  
  def upload(context: Context): scala.Unit = js.native
}
