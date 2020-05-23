package typings.hapiMimos.anon

import typings.mimeDb.mod.MimeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @hapi/mimos.@hapi/mimos.MimosOptionsValue & {predicate ? (mime : @hapi/mimos.@hapi/mimos.MimosOptionsValue & {[key: string] : any}): @hapi/mimos.@hapi/mimos.MimosOptionsValue & {[key: string] : any}} */
trait MimosOptionsValuepredicat extends js.Object {
  /** The default charset associated with this type, if any. */
  val charset: js.UndefOr[String] = js.undefined
  /** Whether a file of this type can be gzipped. */
  val compressible: js.UndefOr[Boolean] = js.undefined
  /** Known extensions associated with this mime type. */
  val extensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Method with signature function(mime) when this mime type is found in the database,
    * this function will run. This allows you make customizations to mime based on developer criteria.
    */
  var predicate: js.UndefOr[js.Function1[/* mime */ MimosOptionsValuekeystrin, MimosOptionsValuekeystrin]] = js.undefined
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

object MimosOptionsValuepredicat {
  @scala.inline
  def apply(
    charset: String = null,
    compressible: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    predicate: /* mime */ MimosOptionsValuekeystrin => MimosOptionsValuekeystrin = null,
    source: MimeSource = null,
    `type`: String = null
  ): MimosOptionsValuepredicat = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimosOptionsValuepredicat]
  }
}

