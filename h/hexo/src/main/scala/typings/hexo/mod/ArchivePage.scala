package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchivePage
  extends StObject
     with IndexPage {
  
  var archive: js.UndefOr[Boolean] = js.undefined
  
  var month: js.UndefOr[Double] = js.undefined
  
  var year: js.UndefOr[Double] = js.undefined
}
object ArchivePage {
  
  inline def apply(): ArchivePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchivePage]
  }
  
  extension [Self <: ArchivePage](x: Self) {
    
    inline def setArchive(value: Boolean): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
    
    inline def setArchiveUndefined: Self = StObject.set(x, "archive", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
