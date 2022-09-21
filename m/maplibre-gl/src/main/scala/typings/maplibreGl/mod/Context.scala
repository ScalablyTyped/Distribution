package typings.maplibreGl.mod

import typings.maplibreGl.anon.ReadonlyColorMode
import typings.maplibreGl.anon.ReadonlyCullFaceMode
import typings.maplibreGl.anon.ReadonlyDepthMode
import typings.maplibreGl.anon.ReadonlyStencilMode
import typings.std.WebGLRenderbuffer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Context")
@js.native
open class Context protected () extends StObject {
  def this(gl: WebGLRenderingContext) = this()
  
  var activeTexture: ActiveTextureUnit = js.native
  
  var bindElementBuffer: BindElementBuffer = js.native
  
  var bindFramebuffer: BindFramebuffer = js.native
  
  var bindRenderbuffer: BindRenderbuffer = js.native
  
  var bindTexture: BindTexture = js.native
  
  var bindVertexArrayOES: BindVertexArrayOES = js.native
  
  var bindVertexBuffer: BindVertexBuffer = js.native
  
  var blend: Blend = js.native
  
  var blendColor: BlendColor = js.native
  
  var blendEquation: BlendEquation = js.native
  
  var blendFunc: BlendFunc = js.native
  
  def clear(hasColorDepth: ClearArgs): scala.Unit = js.native
  
  var clearColor: ClearColor = js.native
  
  var clearDepth: ClearDepth = js.native
  
  var clearStencil: ClearStencil = js.native
  
  var colorMask: ColorMask = js.native
  
  def createFramebuffer(width: Double, height: Double, hasDepth: Boolean): Framebuffer = js.native
  
  def createIndexBuffer(array: LineIndexArray): IndexBuffer = js.native
  def createIndexBuffer(array: LineIndexArray, dynamicDraw: Boolean): IndexBuffer = js.native
  def createIndexBuffer(array: LineStripIndexArray): IndexBuffer = js.native
  def createIndexBuffer(array: LineStripIndexArray, dynamicDraw: Boolean): IndexBuffer = js.native
  def createIndexBuffer(array: TriangleIndexArray): IndexBuffer = js.native
  def createIndexBuffer(array: TriangleIndexArray, dynamicDraw: Boolean): IndexBuffer = js.native
  
  def createRenderbuffer(storageFormat: Double, width: Double, height: Double): WebGLRenderbuffer = js.native
  
  def createVertexBuffer(array: StructArray, attributes: js.Array[StructArrayMember]): VertexBuffer = js.native
  def createVertexBuffer(array: StructArray, attributes: js.Array[StructArrayMember], dynamicDraw: Boolean): VertexBuffer = js.native
  
  var cullFace: CullFace = js.native
  
  var cullFaceSide: CullFaceSide = js.native
  
  var currentNumAttributes: Double = js.native
  
  var depthFunc: DepthFunc = js.native
  
  var depthMask: DepthMask = js.native
  
  var depthRange: DepthRange = js.native
  
  var depthTest: DepthTest = js.native
  
  var extRenderToTextureHalfFloat: Any = js.native
  
  var extTextureFilterAnisotropic: Any = js.native
  
  var extTextureFilterAnisotropicMax: Any = js.native
  
  var extTextureHalfFloat: Any = js.native
  
  var extTimerQuery: Any = js.native
  
  var extVertexArrayObject: Any = js.native
  
  var frontFace: FrontFace = js.native
  
  var gl: WebGLRenderingContext = js.native
  
  var maxTextureSize: Double = js.native
  
  var pixelStoreUnpack: PixelStoreUnpack = js.native
  
  var pixelStoreUnpackFlipY: PixelStoreUnpackFlipY = js.native
  
  var pixelStoreUnpackPremultiplyAlpha: PixelStoreUnpackPremultiplyAlpha = js.native
  
  var program: ProgramValue = js.native
  
  def setColorMode(colorMode: ReadonlyColorMode): scala.Unit = js.native
  
  def setCullFace(cullFaceMode: ReadonlyCullFaceMode): scala.Unit = js.native
  
  def setDefault(): scala.Unit = js.native
  
  def setDepthMode(depthMode: ReadonlyDepthMode): scala.Unit = js.native
  
  def setDirty(): scala.Unit = js.native
  
  def setStencilMode(stencilMode: ReadonlyStencilMode): scala.Unit = js.native
  
  var stencilFunc: StencilFunc = js.native
  
  var stencilMask: StencilMask = js.native
  
  var stencilOp: StencilOp = js.native
  
  var stencilTest: StencilTest = js.native
  
  def unbindVAO(): scala.Unit = js.native
  
  var viewport: Viewport = js.native
}
