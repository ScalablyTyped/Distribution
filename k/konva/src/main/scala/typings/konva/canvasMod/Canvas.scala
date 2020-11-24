package typings.konva.canvasMod

import typings.konva.contextMod.Context
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Canvas", "Canvas")
@js.native
class Canvas protected () extends js.Object {
  def this(config: ICanvasConfig) = this()
  
  var _canvas: HTMLCanvasElement = js.native
  
  var context: Context = js.native
  
  def getContext(): Context = js.native
  
  def getHeight(): Double = js.native
  
  def getPixelRatio(): Double = js.native
  
  def getWidth(): Double = js.native
  
  var height: Double = js.native
  
  var isCache: Boolean = js.native
  
  var pixelRatio: Double = js.native
  
  def setHeight(height: js.Any): Unit = js.native
  
  def setPixelRatio(pixelRatio: js.Any): Unit = js.native
  
  def setSize(width: js.Any, height: js.Any): Unit = js.native
  
  def setWidth(width: js.Any): Unit = js.native
  
  def toDataURL(mimeType: js.Any, quality: js.Any): String = js.native
  
  var width: Double = js.native
}
