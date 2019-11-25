package typings.lls.llsMod.LargeLocalStorageInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Force LLS to use a specific storage implementation: 'IndexedDB' or 'WebSQL' or 'FilesystemAPI'.
    */
  var forceProvider: js.UndefOr[String] = js.undefined
  /**
    * Optional name for your LLS database. Defaults to lls. This is the name given to the underlying IndexedDB or WebSQL DB or FSAPI Folder. LLS's with different names are independent.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Desired capacity in bytes.
    */
  var size: Double
}

object Options {
  @scala.inline
  def apply(size: Double, forceProvider: String = null, name: String = null): Options = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (forceProvider != null) __obj.updateDynamic("forceProvider")(forceProvider.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

