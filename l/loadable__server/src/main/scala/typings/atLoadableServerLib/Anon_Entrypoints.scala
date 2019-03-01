package typings
package atLoadableServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entrypoints extends js.Object {
  /**
  	 * Webpack entrypoints to load (default to `["main"]`)
  	 */
  var entrypoints: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  	 * Optional output path (only for `requireEntrypoint`)
  	 */
  var outputPath: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Entrypoints {
  @scala.inline
  def apply(
    entrypoints: java.lang.String | js.Array[java.lang.String] = null,
    outputPath: java.lang.String = null
  ): Anon_Entrypoints = {
    val __obj = js.Dynamic.literal()
    if (entrypoints != null) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    __obj.asInstanceOf[Anon_Entrypoints]
  }
}

