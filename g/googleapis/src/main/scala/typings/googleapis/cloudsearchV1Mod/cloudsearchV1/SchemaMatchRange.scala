package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Matched range of a snippet [start, end).
  */
trait SchemaMatchRange extends StObject {
  
  /**
    * End of the match in the snippet.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Starting position of the match in the snippet.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object SchemaMatchRange {
  
  @scala.inline
  def apply(): SchemaMatchRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchRange]
  }
  
  @scala.inline
  implicit class SchemaMatchRangeMutableBuilder[Self <: SchemaMatchRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
