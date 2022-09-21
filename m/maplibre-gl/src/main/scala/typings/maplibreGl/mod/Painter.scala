package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.glMatrix.mod.mat4
import typings.maplibreGl.anon.Dirty
import typings.maplibreGl.anon.ReadonlyColorMode
import typings.maplibreGl.anon.ReadonlyDepthMode
import typings.maplibreGl.anon.ReadonlyStencilMode
import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Painter")
@js.native
open class Painter protected () extends StObject {
  def this(gl: WebGLRenderingContext, transform: Transform) = this()
  
  def _renderTileClippingMasks(layer: StyleLayer, tileIDs: js.Array[OverscaledTileID]): scala.Unit = js.native
  
  var _showOverdrawInspector: Boolean = js.native
  
  var _tileClippingMaskIDs: StringDictionary[Double] = js.native
  
  var _tileTextures: NumberDictionary[js.Array[Texture]] = js.native
  
  var cache: StringDictionary[Program[Any]] = js.native
  
  def clearStencil(): scala.Unit = js.native
  
  def collectGpuTimers(): StringDictionary[Any] = js.native
  
  def colorModeForRenderPass(): ReadonlyColorMode = js.native
  
  var context: Context = js.native
  
  var crossTileSymbolIndex: CrossTileSymbolIndex = js.native
  
  var currentLayer: Double = js.native
  
  var currentStencilSource: String = js.native
  
  var debugBuffer: VertexBuffer = js.native
  
  var debugOverlayCanvas: HTMLCanvasElement = js.native
  
  var debugOverlayTexture: Texture = js.native
  
  var debugSegments: SegmentVector = js.native
  
  var depthEpsilon: Double = js.native
  
  def depthModeForSublayer(n: Double, mask: DepthMaskType): ReadonlyDepthMode = js.native
  def depthModeForSublayer(n: Double, mask: DepthMaskType, func: DepthFuncType): ReadonlyDepthMode = js.native
  
  var depthRangeFor3D: DepthRangeType = js.native
  
  def destroy(): scala.Unit = js.native
  
  var emptyProgramConfiguration: ProgramConfiguration = js.native
  
  var emptyTexture: Texture = js.native
  
  def getTileTexture(size: Double): Texture = js.native
  
  var glyphManager: GlyphManager = js.native
  
  var gpuTimers: StringDictionary[Any] = js.native
  
  def gpuTimingEnd(): scala.Unit = js.native
  
  def gpuTimingStart(layer: StyleLayer): scala.Unit = js.native
  
  var height: Double = js.native
  
  var id: String = js.native
  
  var imageManager: ImageManager = js.native
  
  def initDebugOverlayCanvas(): scala.Unit = js.native
  
  /**
  	 * Checks whether a pattern image is needed, and if it is, whether it is not loaded.
  	 *
  	 * @returns true if a needed image is missing and rendering needs to be skipped.
  	 * @private
  	 */
  def isPatternMissing(): Boolean = js.native
  def isPatternMissing(image: CrossFaded[ResolvedImage]): Boolean = js.native
  
  var lineAtlas: LineAtlas = js.native
  
  var nextStencilID: Double = js.native
  
  var numSublayers: Double = js.native
  
  var opaquePassCutoff: Double = js.native
  
  def opaquePassEnabledForLayer(): Boolean = js.native
  
  var options: PainterOptions = js.native
  
  var pixelRatio: Double = js.native
  
  var quadTriangleIndexBuffer: IndexBuffer = js.native
  
  def queryGpuTimers(gpuTimers: StringDictionary[Any]): js.Object = js.native
  
  var rasterBoundsBuffer: VertexBuffer = js.native
  
  var rasterBoundsSegments: SegmentVector = js.native
  
  def render(style: Style, options: PainterOptions): scala.Unit = js.native
  
  def renderLayer(painter: Painter, sourceCache: SourceCache, layer: StyleLayer, coords: js.Array[OverscaledTileID]): scala.Unit = js.native
  
  var renderPass: RenderPass = js.native
  
  def resize(width: Double, height: Double, pixelRatio: Double): scala.Unit = js.native
  
  def saveTileTexture(texture: Texture): scala.Unit = js.native
  
  def setBaseState(): scala.Unit = js.native
  
  def setCustomLayerDefaults(): scala.Unit = js.native
  
  def setup(): scala.Unit = js.native
  
  var stencilClearMode: StencilMode = js.native
  
  def stencilConfigForOverlap(tileIDs: js.Array[OverscaledTileID]): js.Tuple2[NumberDictionary[ReadonlyStencilMode], js.Array[OverscaledTileID]] = js.native
  
  def stencilModeFor3D(): StencilMode = js.native
  
  def stencilModeForClipping(tileID: OverscaledTileID): StencilMode = js.native
  
  var style: Style = js.native
  
  var symbolFadeChange: Double = js.native
  
  var terrainFacilitator: Dirty = js.native
  
  var tileBorderIndexBuffer: IndexBuffer = js.native
  
  var tileExtentBuffer: VertexBuffer = js.native
  
  var tileExtentSegments: SegmentVector = js.native
  
  var transform: Transform = js.native
  
  /**
  	 * Transform a matrix to incorporate the *-translate and *-translate-anchor properties into it.
  	 * @param inViewportPixelUnitsUnits True when the units accepted by the matrix are in viewport pixels instead of tile units.
  	 * @returns {mat4} matrix
  	 * @private
  	 */
  def translatePosMatrix(matrix: mat4, tile: Tile, translate: js.Tuple2[Double, Double], translateAnchor: map | viewport): mat4 = js.native
  def translatePosMatrix(
    matrix: mat4,
    tile: Tile,
    translate: js.Tuple2[Double, Double],
    translateAnchor: map | viewport,
    inViewportPixelUnitsUnits: Boolean
  ): mat4 = js.native
  
  def useProgram(name: String): Program[Any] = js.native
  def useProgram(name: String, programConfiguration: ProgramConfiguration): Program[Any] = js.native
  
  var viewportBuffer: VertexBuffer = js.native
  
  var viewportSegments: SegmentVector = js.native
  
  var width: Double = js.native
}
