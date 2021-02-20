package typings.hexo.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ArchivePageMutableBuilder[Self <: ArchivePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchive(value: Boolean): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveUndefined: Self = StObject.set(x, "archive", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
