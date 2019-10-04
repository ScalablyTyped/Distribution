package typings.atJimpCore.typesPluginsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJimpCore.typesEtcMod.DecoderFn
import typings.atJimpCore.typesEtcMod.EncoderFn
import typings.atJimpCore.typesEtcMod.Image
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
  def apply[ImageType /* <: Image */](
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
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (constants != null) __obj.updateDynamic("constants")(constants)
    if (decoders != null) __obj.updateDynamic("decoders")(decoders)
    if (encoders != null) __obj.updateDynamic("encoders")(encoders)
    if (hasAlpha != null) __obj.updateDynamic("hasAlpha")(hasAlpha)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    __obj.asInstanceOf[WellFormedPlugin[ImageType]]
  }
}

