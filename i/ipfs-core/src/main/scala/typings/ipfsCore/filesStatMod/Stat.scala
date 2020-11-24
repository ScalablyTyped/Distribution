package typings.ipfsCore.filesStatMod

import typings.ipfsCore.ipfsCoreStrings.directory
import typings.ipfsCore.ipfsCoreStrings.file
import typings.ipfsCore.srcUtilsMod.MTime_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stat extends js.Object {
  
  /**
    * - If type is directory, this is the number of files
    * in the directory. If it is file it is the number of blocks that make up the
    * file.
    */
  var blocks: Double = js.native
  
  /**
    * - Content idenntifier
    */
  var cid: CID = js.native
  
  /**
    * - An integer with the size of the
    * DAGNodes making up the file in bytes.
    */
  var cumulativeSize: Double = js.native
  
  /**
    * - Is a boolean to indicate if the queried dag is
    * fully present locally.
    */
  var local: js.UndefOr[Boolean] = js.native
  
  /**
    * - File mode
    */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * - Modification time
    */
  var mtime: js.UndefOr[MTime_] = js.native
  
  /**
    * - An integer with the file size in bytes.
    */
  var size: Double = js.native
  
  /**
    * - An integer indicating the cumulative size of
    * the data present locally.
    */
  var sizeLocal: js.UndefOr[Double] = js.native
  
  /**
    * - Type of the file which is  either directory
    * or file.
    */
  var `type`: directory | file = js.native
  
  /**
    * - A boolean to indicate if locality
    * information is present.
    */
  var withLocality: js.UndefOr[Boolean] = js.native
}
object Stat {
  
  @scala.inline
  def apply(blocks: Double, cid: CID, cumulativeSize: Double, size: Double, `type`: directory | file): Stat = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], cumulativeSize = cumulativeSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlocks(value: Double): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCid(value: CID): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeSize(value: Double): Self = this.set("cumulativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: directory | file): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtime(value: MTime_): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    
    @scala.inline
    def setSizeLocal(value: Double): Self = this.set("sizeLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeLocal: Self = this.set("sizeLocal", js.undefined)
    
    @scala.inline
    def setWithLocality(value: Boolean): Self = this.set("withLocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithLocality: Self = this.set("withLocality", js.undefined)
  }
}
