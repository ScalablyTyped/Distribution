package typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryObject extends js.Object {
  /** Webpack entry or chunk name */
  var entryName: String
  /** Entry or chunk path */
  var path: String
}

object EntryObject {
  @scala.inline
  def apply(entryName: String, path: String): EntryObject = {
    val __obj = js.Dynamic.literal(entryName = entryName, path = path)
  
    __obj.asInstanceOf[EntryObject]
  }
}

