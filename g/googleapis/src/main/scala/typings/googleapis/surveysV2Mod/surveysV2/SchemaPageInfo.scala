package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageInfo extends StObject {
  
  var resultPerPage: js.UndefOr[Double] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
  
  var totalResults: js.UndefOr[Double] = js.undefined
}
object SchemaPageInfo {
  
  @scala.inline
  def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  
  @scala.inline
  implicit class SchemaPageInfoMutableBuilder[Self <: SchemaPageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultPerPage(value: Double): Self = StObject.set(x, "resultPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultPerPageUndefined: Self = StObject.set(x, "resultPerPage", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
