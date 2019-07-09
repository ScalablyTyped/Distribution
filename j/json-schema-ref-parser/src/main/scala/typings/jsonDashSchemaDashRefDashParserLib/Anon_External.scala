package typings
package jsonDashSchemaDashRefDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_External extends js.Object {
  /**
    * Determines whether external $ref pointers will be resolved. If this option is disabled, then external `$ref` pointers will simply be ignored.
    */
  var external: js.UndefOr[scala.Boolean] = js.undefined
  var file: js.UndefOr[
    (stdLib.Partial[
      jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.ResolverOptions
    ]) | scala.Boolean
  ] = js.undefined
  var http: js.UndefOr[
    jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.HTTPResolverOptions | scala.Boolean
  ] = js.undefined
}

object Anon_External {
  @scala.inline
  def apply(
    external: js.UndefOr[scala.Boolean] = js.undefined,
    file: (stdLib.Partial[
      jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.ResolverOptions
    ]) | scala.Boolean = null,
    http: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.HTTPResolverOptions | scala.Boolean = null
  ): Anon_External = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_External]
  }
}

