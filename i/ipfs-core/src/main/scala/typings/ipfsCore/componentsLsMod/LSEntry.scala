package typings.ipfsCore.componentsLsMod

import typings.ipfsCore.ipfsCoreStrings.dir
import typings.ipfsCore.ipfsCoreStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ipfsCore.srcUtilsMod.File
  - typings.ipfsCore.srcUtilsMod.Directory
*/
trait LSEntry extends js.Object
object LSEntry {
  
  @scala.inline
  def File(cid: typings.cids.mod.^, depth: Double, name: String, path: String, size: Double, `type`: file): LSEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSEntry]
  }
  
  @scala.inline
  def Directory(cid: typings.cids.mod.^, depth: Double, name: String, path: String, size: Double, `type`: dir): LSEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSEntry]
  }
}
