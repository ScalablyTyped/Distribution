package typings.jimpCore.pluginsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WellFormedPlugin[ImageType /* <: Image */] extends js.Object {
  // Extend the Jimp class with the following constants, etc
  var `class`: js.UndefOr[js.Any] = js.native
  var constants: js.UndefOr[// Contants to assign to the Jimp instance
  StringDictionary[js.Any]] = js.native
  var decoders: js.UndefOr[StringDictionary[DecoderFn]] = js.native
  var encoders: js.UndefOr[// Jimp Image
  StringDictionary[EncoderFn[ImageType]]] = js.native
  var hasAlpha: js.UndefOr[StringDictionary[Boolean]] = js.native
  var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object WellFormedPlugin {
  @scala.inline
  def apply[/* <: typings.jimpCore.etcMod.Image */ ImageType](): WellFormedPlugin[ImageType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WellFormedPlugin[ImageType]]
  }
  @scala.inline
  implicit class WellFormedPluginOps[Self <: WellFormedPlugin[_], /* <: typings.jimpCore.etcMod.Image */ ImageType] (val x: Self with WellFormedPlugin[ImageType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClass(value: js.Any): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setConstants(value: // Contants to assign to the Jimp instance
    StringDictionary[js.Any]): Self = this.set("constants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstants: Self = this.set("constants", js.undefined)
    @scala.inline
    def setDecoders(value: StringDictionary[DecoderFn]): Self = this.set("decoders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecoders: Self = this.set("decoders", js.undefined)
    @scala.inline
    def setEncoders(value: // Jimp Image
    StringDictionary[EncoderFn[ImageType]]): Self = this.set("encoders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoders: Self = this.set("encoders", js.undefined)
    @scala.inline
    def setHasAlpha(value: StringDictionary[Boolean]): Self = this.set("hasAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAlpha: Self = this.set("hasAlpha", js.undefined)
    @scala.inline
    def setMime(value: StringDictionary[js.Array[String]]): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
  }
  
}

