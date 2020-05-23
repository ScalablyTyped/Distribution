package typings.makerJs.global.MakerJs.models

import typings.makerJs.MakerJs.IModelMap
import typings.opentypeJs.mod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Text")
@js.native
class Text protected ()
  extends typings.makerJs.MakerJs.models.Text {
  def this(font: Font, text: String, fontSize: Double) = this()
  def this(font: Font, text: String, fontSize: Double, combine: Boolean) = this()
  def this(font: Font, text: String, fontSize: Double, combine: Boolean, centerCharacterOrigin: Boolean) = this()
  def this(
    font: Font,
    text: String,
    fontSize: Double,
    combine: Boolean,
    centerCharacterOrigin: Boolean,
    bezierAccuracy: Double
  ) = this()
  /* CompleteClass */
  @JSName("models")
  override var models_Text: IModelMap = js.native
}

