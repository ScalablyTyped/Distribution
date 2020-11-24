package typings.konva.textPathMod

import typings.konva.anon.HeightWidth
import typings.konva.anon.P0
import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/TextPath", "TextPath")
@js.native
class TextPath () extends Shape[TextPathConfig] {
  def this(config: TextPathConfig) = this()
  
  def _getContextFont(): js.Any = js.native
  
  def _getTextSize(text: js.Any): HeightWidth = js.native
  
  def _hitFunc(context: js.Any): Unit = js.native
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def _setTextData(): Unit = js.native
  
  def align(): String = js.native
  def align(v: String): this.type = js.native
  @JSName("align")
  var align_Original: GetSet[String, this.type] = js.native
  
  def data(): String = js.native
  def data(v: String): this.type = js.native
  
  var dataArray: js.Array[_] = js.native
  
  @JSName("data")
  var data_Original: GetSet[String, this.type] = js.native
  
  var dummyCanvas: HTMLCanvasElement = js.native
  
  def fontFamily(): String = js.native
  def fontFamily(v: String): this.type = js.native
  @JSName("fontFamily")
  var fontFamily_Original: GetSet[String, this.type] = js.native
  
  def fontSize(): Double = js.native
  def fontSize(v: Double): this.type = js.native
  @JSName("fontSize")
  var fontSize_Original: GetSet[Double, this.type] = js.native
  
  def fontStyle(): String = js.native
  def fontStyle(v: String): this.type = js.native
  @JSName("fontStyle")
  var fontStyle_Original: GetSet[String, this.type] = js.native
  
  def fontVariant(): String = js.native
  def fontVariant(v: String): this.type = js.native
  @JSName("fontVariant")
  var fontVariant_Original: GetSet[String, this.type] = js.native
  
  def getTextHeight(): Double = js.native
  
  def getTextWidth(): Double = js.native
  
  var glyphInfo: js.Array[P0] = js.native
  
  def kerningFunc(): js.Function2[/* leftChar */ String, /* rightChar */ String, Double] = js.native
  def kerningFunc(v: js.Function2[/* leftChar */ String, /* rightChar */ String, Double]): this.type = js.native
  @JSName("kerningFunc")
  var kerningFunc_Original: GetSet[js.Function2[/* leftChar */ String, /* rightChar */ String, Double], this.type] = js.native
  
  def letterSpacing(): Double = js.native
  def letterSpacing(v: Double): this.type = js.native
  @JSName("letterSpacing")
  var letterSpacing_Original: GetSet[Double, this.type] = js.native
  
  var partialText: String = js.native
  
  def setText(text: js.Any): js.Any = js.native
  
  def text(): String = js.native
  def text(v: String): this.type = js.native
  
  def textBaseline(): String = js.native
  def textBaseline(v: String): this.type = js.native
  @JSName("textBaseline")
  var textBaseline_Original: GetSet[String, this.type] = js.native
  
  def textDecoration(): String = js.native
  def textDecoration(v: String): this.type = js.native
  @JSName("textDecoration")
  var textDecoration_Original: GetSet[String, this.type] = js.native
  
  var textHeight: Double = js.native
  
  var textWidth: Double = js.native
  
  @JSName("text")
  var text_Original: GetSet[String, this.type] = js.native
}
