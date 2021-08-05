package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes bullets from all of the paragraphs that overlap with the given
  * range.  The nesting level of each paragraph will be visually preserved by
  * adding indent to the start of the corresponding paragraph.
  */
trait SchemaDeleteParagraphBulletsRequest extends StObject {
  
  /**
    * The range to delete bullets from.
    */
  var range: js.UndefOr[SchemaRange] = js.undefined
}
object SchemaDeleteParagraphBulletsRequest {
  
  inline def apply(): SchemaDeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteParagraphBulletsRequest]
  }
  
  extension [Self <: SchemaDeleteParagraphBulletsRequest](x: Self) {
    
    inline def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
