package typings.maplibreGl.mod

import typings.maplibreGl.anon.Premultiply
import typings.maplibreGl.anon.X
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Texture")
@js.native
open class Texture protected () extends StObject {
  def this(context: Context, image: TextureImage, format: TextureFormat) = this()
  def this(context: Context, image: TextureImage, format: TextureFormat, options: Premultiply) = this()
  
  def bind(filter: TextureFilter, wrap: TextureWrap): scala.Unit = js.native
  def bind(filter: TextureFilter, wrap: TextureWrap, minFilter: TextureFilter): scala.Unit = js.native
  
  var context: Context = js.native
  
  def destroy(): scala.Unit = js.native
  
  var filter: TextureFilter = js.native
  
  var format: TextureFormat = js.native
  
  def isSizePowerOfTwo(): Boolean = js.native
  
  var size: js.Tuple2[Double, Double] = js.native
  
  var texture: WebGLTexture = js.native
  
  def update(image: TextureImage): scala.Unit = js.native
  def update(image: TextureImage, options: Null, position: X): scala.Unit = js.native
  def update(image: TextureImage, options: scala.Unit, position: X): scala.Unit = js.native
  def update(image: TextureImage, options: Premultiply): scala.Unit = js.native
  def update(image: TextureImage, options: Premultiply, position: X): scala.Unit = js.native
  
  var useMipmap: Boolean = js.native
  
  var wrap: TextureWrap = js.native
}
