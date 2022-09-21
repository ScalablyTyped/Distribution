package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.anon.FragmentSource
import typings.maplibreGl.anon.ReadonlyColorMode
import typings.maplibreGl.anon.ReadonlyCullFaceMode
import typings.maplibreGl.anon.ReadonlyDepthMode
import typings.maplibreGl.anon.ReadonlyStencilMode
import typings.std.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Program")
@js.native
open class Program[Us /* <: UniformBindings */] protected () extends StObject {
  def this(
    context: Context,
    name: String,
    source: FragmentSource,
    configuration: ProgramConfiguration,
    fixedUniforms: js.Function2[/* b */ Context, /* a */ UniformLocations, Us],
    showOverdrawInspector: Boolean,
    terrain: Terrain
  ) = this()
  
  var attributes: StringDictionary[Double] = js.native
  
  var binderUniforms: js.Array[BinderUniform] = js.native
  
  def draw(
    context: Context,
    drawMode: DrawMode,
    depthMode: ReadonlyDepthMode,
    stencilMode: ReadonlyStencilMode,
    colorMode: ReadonlyColorMode,
    cullFaceMode: ReadonlyCullFaceMode,
    uniformValues: UniformValues[Us],
    terrain: TerrainData,
    layerID: String,
    layoutVertexBuffer: VertexBuffer,
    indexBuffer: IndexBuffer,
    segments: SegmentVector,
    currentProperties: js.UndefOr[Any],
    zoom: js.UndefOr[Double | Null],
    configuration: js.UndefOr[ProgramConfiguration | Null],
    dynamicLayoutBuffer: js.UndefOr[VertexBuffer | Null],
    dynamicLayoutBuffer2: js.UndefOr[VertexBuffer | Null],
    dynamicLayoutBuffer3: js.UndefOr[VertexBuffer | Null]
  ): scala.Unit = js.native
  
  var failedToCreate: Boolean = js.native
  
  var fixedUniforms: Us = js.native
  
  var numAttributes: Double = js.native
  
  var program: WebGLProgram = js.native
  
  var terrainUniforms: TerrainPreludeUniformsType = js.native
}
