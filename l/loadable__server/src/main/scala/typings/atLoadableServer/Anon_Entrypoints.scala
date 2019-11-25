package typings.atLoadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entrypoints extends js.Object {
  /**
  	 * Webpack entrypoints to load (default to `["main"]`)
  	 */
  var entrypoints: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  	 * Optional namespace in case of multiple apps on same page
  	 */
  var namespace: js.UndefOr[String] = js.undefined
  /**
  	 * Optional output path (only for `requireEntrypoint`)
  	 */
  var outputPath: js.UndefOr[String] = js.undefined
  /**
  	 * Optional public path to override stats.publicPath at runtime
  	 */
  var publicPath: js.UndefOr[String] = js.undefined
}

object Anon_Entrypoints {
  @scala.inline
  def apply(
    entrypoints: String | js.Array[String] = null,
    namespace: String = null,
    outputPath: String = null,
    publicPath: String = null
  ): Anon_Entrypoints = {
    val __obj = js.Dynamic.literal()
    if (entrypoints != null) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Entrypoints]
  }
}

