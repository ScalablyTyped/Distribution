package typings.gulpConcat.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFsStats extends js.Object {
  
  var atime: js.UndefOr[Date] = js.native
  
  var blksize: js.UndefOr[Double] = js.native
  
  var blocks: js.UndefOr[Double] = js.native
  
  var ctime: js.UndefOr[Date] = js.native
  
  var dev: js.UndefOr[Double] = js.native
  
  var gid: js.UndefOr[Double] = js.native
  
  var ino: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var mtime: js.UndefOr[Date] = js.native
  
  var nlink: js.UndefOr[Double] = js.native
  
  var rdev: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var uid: js.UndefOr[Double] = js.native
}
object IFsStats {
  
  @scala.inline
  def apply(): IFsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFsStats]
  }
  
  @scala.inline
  implicit class IFsStatsOps[Self <: IFsStats] (val x: Self) extends AnyVal {
    
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
    def setAtime(value: Date): Self = this.set("atime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtime: Self = this.set("atime", js.undefined)
    
    @scala.inline
    def setBlksize(value: Double): Self = this.set("blksize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlksize: Self = this.set("blksize", js.undefined)
    
    @scala.inline
    def setBlocks(value: Double): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    
    @scala.inline
    def setCtime(value: Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtime: Self = this.set("ctime", js.undefined)
    
    @scala.inline
    def setDev(value: Double): Self = this.set("dev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    
    @scala.inline
    def setIno(value: Double): Self = this.set("ino", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIno: Self = this.set("ino", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    
    @scala.inline
    def setNlink(value: Double): Self = this.set("nlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNlink: Self = this.set("nlink", js.undefined)
    
    @scala.inline
    def setRdev(value: Double): Self = this.set("rdev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdev: Self = this.set("rdev", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
}
