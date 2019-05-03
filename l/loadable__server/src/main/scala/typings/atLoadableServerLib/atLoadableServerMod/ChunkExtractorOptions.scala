package typings
package atLoadableServerLib.atLoadableServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkExtractorOptions extends js.Object {
  /**
  	 * Webpack entrypoints to load (default to `["main"]`)
  	 */
  var entrypoints: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Optional namespace in case of multiple apps on same page
    */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional output path (only for `requireEntrypoint`)
  	 */
  var outputPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	  * Stats generated using `@loadable/webpack-plugin`.
  	  */
  var stats: js.UndefOr[js.Object] = js.undefined
  /**
  	 * Stats file path generated using `@loadable/webpack-plugin`
  	 */
  var statsFile: js.UndefOr[java.lang.String] = js.undefined
}

object ChunkExtractorOptions {
  @scala.inline
  def apply(
    entrypoints: java.lang.String | js.Array[java.lang.String] = null,
    namespace: java.lang.String = null,
    outputPath: java.lang.String = null,
    stats: js.Object = null,
    statsFile: java.lang.String = null
  ): ChunkExtractorOptions = {
    val __obj = js.Dynamic.literal()
    if (entrypoints != null) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (statsFile != null) __obj.updateDynamic("statsFile")(statsFile)
    __obj.asInstanceOf[ChunkExtractorOptions]
  }
}

