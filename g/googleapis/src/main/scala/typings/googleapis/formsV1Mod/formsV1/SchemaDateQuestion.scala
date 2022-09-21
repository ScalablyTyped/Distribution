package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateQuestion extends StObject {
  
  /**
    * Whether to include the time as part of the question.
    */
  var includeTime: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to include the year as part of the question.
    */
  var includeYear: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDateQuestion {
  
  inline def apply(): SchemaDateQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateQuestion]
  }
  
  extension [Self <: SchemaDateQuestion](x: Self) {
    
    inline def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
    
    inline def setIncludeTimeNull: Self = StObject.set(x, "includeTime", null)
    
    inline def setIncludeTimeUndefined: Self = StObject.set(x, "includeTime", js.undefined)
    
    inline def setIncludeYear(value: Boolean): Self = StObject.set(x, "includeYear", value.asInstanceOf[js.Any])
    
    inline def setIncludeYearNull: Self = StObject.set(x, "includeYear", null)
    
    inline def setIncludeYearUndefined: Self = StObject.set(x, "includeYear", js.undefined)
  }
}
