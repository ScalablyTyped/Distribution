package typings.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntrypoints extends js.Object {
  /**
  	 * Webpack entrypoints to load (default to `["main"]`)
  	 */
  var entrypoints: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  	 * File system used to read files (default to fs)
  	 */
  var inputFileSystem: js.UndefOr[js.Object] = js.undefined
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

object AnonEntrypoints {
  @scala.inline
  def apply(
    entrypoints: String | js.Array[String] = null,
    inputFileSystem: js.Object = null,
    namespace: String = null,
    outputPath: String = null,
    publicPath: String = null
  ): AnonEntrypoints = {
    val __obj = js.Dynamic.literal()
    if (entrypoints != null) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (inputFileSystem != null) __obj.updateDynamic("inputFileSystem")(inputFileSystem.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntrypoints]
  }
}

