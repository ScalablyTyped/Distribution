package typings.locatePath.mod

import typings.locatePath.locatePathStrings.directory
import typings.locatePath.locatePathStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Allow symbolic links to match if they point to the requested path type.
  		@default true
  		*/
  val allowSymlinks: js.UndefOr[Boolean] = js.undefined
  /**
  		Current working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  /**
  		Type of path to match.
  		@default 'file'
  		*/
  val `type`: js.UndefOr[file | directory] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowSymlinks: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    `type`: file | directory = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSymlinks)) __obj.updateDynamic("allowSymlinks")(allowSymlinks.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

