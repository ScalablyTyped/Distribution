package typings
package llsLib.llsMod.LargeLocalStorageInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Force LLS to use a specific storage implementation: 'IndexedDB' or 'WebSQL' or 'FilesystemAPI'.
    */
  var forceProvider: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional name for your LLS database. Defaults to lls. This is the name given to the underlying IndexedDB or WebSQL DB or FSAPI Folder. LLS's with different names are independent.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Desired capacity in bytes.
    */
  var size: scala.Double
}

object Options {
  @scala.inline
  def apply(size: scala.Double, forceProvider: java.lang.String = null, name: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("size")(size)
    if (forceProvider != null) __obj.updateDynamic("forceProvider")(forceProvider)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Options]
  }
}

