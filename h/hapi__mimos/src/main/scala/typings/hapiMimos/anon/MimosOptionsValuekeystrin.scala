package typings.hapiMimos.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mimeDb.mod.MimeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @hapi/mimos.@hapi/mimos.MimosOptionsValue & {[key: string] : any} */
trait MimosOptionsValuekeystrin
  extends /* key */ StringDictionary[js.Any] {
  /** The default charset associated with this type, if any. */
  val charset: js.UndefOr[String] = js.undefined
  /** Whether a file of this type can be gzipped. */
  val compressible: js.UndefOr[Boolean] = js.undefined
  /** Known extensions associated with this mime type. */
  val extensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Where the mime type is defined.
    * If not set, it's probably a custom media type.
    */
  val source: js.UndefOr[MimeSource] = js.undefined
  /**
    * Specify the type value of result objects, defaults to key.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MimosOptionsValuekeystrin {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    charset: String = null,
    compressible: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    source: MimeSource = null,
    `type`: String = null
  ): MimosOptionsValuekeystrin = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimosOptionsValuekeystrin]
  }
}

