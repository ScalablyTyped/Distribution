package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchivePage extends IndexPage {
  
  var archive: js.UndefOr[Boolean] = js.native
  
  var month: js.UndefOr[Double] = js.native
  
  var year: js.UndefOr[Double] = js.native
}
object ArchivePage {
  
  @scala.inline
  def apply(): ArchivePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchivePage]
  }
  
  @scala.inline
  implicit class ArchivePageOps[Self <: ArchivePage] (val x: Self) extends AnyVal {
    
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
    def setArchive(value: Boolean): Self = this.set("archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchive: Self = this.set("archive", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
