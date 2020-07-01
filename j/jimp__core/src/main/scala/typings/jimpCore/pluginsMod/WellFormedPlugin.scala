package typings.jimpCore.pluginsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WellFormedPlugin[ImageType /* <: Image */] extends js.Object {
  // Extend the Jimp class with the following constants, etc
  var `class`: js.UndefOr[js.Any] = js.undefined
  var constants: js.UndefOr[// Contants to assign to the Jimp instance
  StringDictionary[js.Any]] = js.undefined
  var decoders: js.UndefOr[StringDictionary[DecoderFn]] = js.undefined
  var encoders: js.UndefOr[// Jimp Image
  StringDictionary[EncoderFn[ImageType]]] = js.undefined
  var hasAlpha: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object WellFormedPlugin {
  @scala.inline
  def apply[/* <: typings.jimpCore.etcMod.Image */ ImageType](
    `class`: js.Any = null,
    constants: // Contants to assign to the Jimp instance
  StringDictionary[js.Any] = null,
    decoders: StringDictionary[DecoderFn] = null,
    encoders: // Jimp Image
  StringDictionary[EncoderFn[ImageType]] = null,
    hasAlpha: StringDictionary[Boolean] = null,
    mime: StringDictionary[js.Array[String]] = null
  ): WellFormedPlugin[ImageType] = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (constants != null) __obj.updateDynamic("constants")(constants.asInstanceOf[js.Any])
    if (decoders != null) __obj.updateDynamic("decoders")(decoders.asInstanceOf[js.Any])
    if (encoders != null) __obj.updateDynamic("encoders")(encoders.asInstanceOf[js.Any])
    if (hasAlpha != null) __obj.updateDynamic("hasAlpha")(hasAlpha.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WellFormedPlugin[ImageType]]
  }
}

