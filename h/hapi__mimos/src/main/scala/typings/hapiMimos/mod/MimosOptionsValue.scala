package typings.hapiMimos.mod

import typings.mimeDb.mod.MimeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimosOptionsValue extends MimeEntry {
  /** method with signature function(mime) when this mime type is found in the database, this function will run. This allows you make customizations to mime based on developer criteria. */
  var predicate: js.UndefOr[js.Function1[/* mime */ MimosOptionsValue, MimosOptionsValue]] = js.undefined
  /** specify the type value of result objects, defaults to key. See the example below for more clarification. */
  var `type`: js.UndefOr[String] = js.undefined
}

object MimosOptionsValue {
  @scala.inline
  def apply(
    charset: String = null,
    compressible: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    predicate: /* mime */ MimosOptionsValue => MimosOptionsValue = null,
    source: String = null,
    `type`: String = null
  ): MimosOptionsValue = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimosOptionsValue]
  }
}

