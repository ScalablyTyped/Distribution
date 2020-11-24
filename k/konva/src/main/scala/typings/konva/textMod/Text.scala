package typings.konva.textMod

import typings.konva.anon.HeightNumber
import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Text", "Text")
@js.native
class Text () extends Shape[TextConfig] {
  def this(config: TextConfig) = this()
  
  def _addTextLine(line: js.Any): Double = js.native
  
  def _getContextFont(): String = js.native
  
  def _getTextWidth(text: js.Any): js.Any = js.native
  
  def _hitFunc(context: js.Any): Unit = js.native
  
  var _partialText: String = js.native
  
  var _partialTextX: Double = js.native
  
  var _partialTextY: Double = js.native
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def _setTextData(): Unit = js.native
  
  def align(): String = js.native
  def align(v: String): this.type = js.native
  @JSName("align")
  var align_Original: GetSet[String, this.type] = js.native
  
  def ellipsis(): Boolean = js.native
  def ellipsis(v: Boolean): this.type = js.native
  @JSName("ellipsis")
  var ellipsis_Original: GetSet[Boolean, this.type] = js.native
  
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
  
  def getHeight(): js.Any = js.native
  
  def getStrokeScaleEnabled(): Boolean = js.native
  
  def getTextHeight(): Double = js.native
  
  def getTextWidth(): Double = js.native
  
  def getWidth(): js.Any = js.native
  
  def letterSpacing(): Double = js.native
  def letterSpacing(v: Double): this.type = js.native
  @JSName("letterSpacing")
  var letterSpacing_Original: GetSet[Double, this.type] = js.native
  
  def lineHeight(): Double = js.native
  def lineHeight(v: Double): this.type = js.native
  @JSName("lineHeight")
  var lineHeight_Original: GetSet[Double, this.type] = js.native
  
  def measureSize(text: js.Any): HeightNumber = js.native
  
  def padding(): Double = js.native
  def padding(v: Double): this.type = js.native
  @JSName("padding")
  var padding_Original: GetSet[Double, this.type] = js.native
  
  def setText(text: js.Any): this.type = js.native
  
  def text(): String = js.native
  def text(v: String): this.type = js.native
  
  var textArr: js.Array[typings.konva.anon.Text] = js.native
  
  def textDecoration(): String = js.native
  def textDecoration(v: String): this.type = js.native
  @JSName("textDecoration")
  var textDecoration_Original: GetSet[String, this.type] = js.native
  
  var textHeight: Double = js.native
  
  var textWidth: Double = js.native
  
  @JSName("text")
  var text_Original: GetSet[String, this.type] = js.native
  
  def verticalAlign(): String = js.native
  def verticalAlign(v: String): this.type = js.native
  @JSName("verticalAlign")
  var verticalAlign_Original: GetSet[String, this.type] = js.native
  
  def wrap(): String = js.native
  def wrap(v: String): this.type = js.native
  @JSName("wrap")
  var wrap_Original: GetSet[String, this.type] = js.native
}
