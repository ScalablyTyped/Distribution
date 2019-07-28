package typings.atLoadableServer.atLoadableServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkExtractorOptions extends js.Object {
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
  /**
  	 * Stats generated using `@loadable/webpack-plugin`.
  	 */
  var stats: js.UndefOr[js.Object] = js.undefined
  /**
  	 * Stats file path generated using `@loadable/webpack-plugin`
  	 */
  var statsFile: js.UndefOr[String] = js.undefined
}

object ChunkExtractorOptions {
  @scala.inline
  def apply(
    entrypoints: String | js.Array[String] = null,
    namespace: String = null,
    outputPath: String = null,
    publicPath: String = null,
    stats: js.Object = null,
    statsFile: String = null
  ): ChunkExtractorOptions = {
    val __obj = js.Dynamic.literal()
    if (entrypoints != null) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (statsFile != null) __obj.updateDynamic("statsFile")(statsFile)
    __obj.asInstanceOf[ChunkExtractorOptions]
  }
}

