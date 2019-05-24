package typings
package locateDashPathLib.locateDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Allow symbolic links to match if they point to the requested path type.
  		@default true
  		*/
  val allowSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Current working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Type of path to match.
  		@default 'file'
  		*/
  val `type`: js.UndefOr[
    locateDashPathLib.locateDashPathLibStrings.file | locateDashPathLib.locateDashPathLibStrings.directory
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    `type`: locateDashPathLib.locateDashPathLibStrings.file | locateDashPathLib.locateDashPathLibStrings.directory = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSymlinks)) __obj.updateDynamic("allowSymlinks")(allowSymlinks)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

