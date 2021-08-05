package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A run of a text format. The format of this run continues until the start
  * index of the next run. When updating, all fields must be set.
  */
trait SchemaTextFormatRun extends StObject {
  
  /**
    * The format of this run.  Absent values inherit the cell&#39;s format.
    */
  var format: js.UndefOr[SchemaTextFormat] = js.undefined
  
  /**
    * The character index where this run starts.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object SchemaTextFormatRun {
  
  inline def apply(): SchemaTextFormatRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextFormatRun]
  }
  
  extension [Self <: SchemaTextFormatRun](x: Self) {
    
    inline def setFormat(value: SchemaTextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
