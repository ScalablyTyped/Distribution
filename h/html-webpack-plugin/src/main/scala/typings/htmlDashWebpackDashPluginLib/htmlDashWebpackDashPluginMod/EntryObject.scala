package typings
package htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryObject extends js.Object {
  /** Webpack entry or chunk name */
  var entryName: java.lang.String
  /** Entry or chunk path */
  var path: java.lang.String
}

object EntryObject {
  @scala.inline
  def apply(entryName: java.lang.String, path: java.lang.String): EntryObject = {
    val __obj = js.Dynamic.literal(entryName = entryName, path = path)
  
    __obj.asInstanceOf[EntryObject]
  }
}

