package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a NamedRange referencing the given range.
  */
trait SchemaCreateNamedRangeRequest extends StObject {
  
  /**
    * The name of the NamedRange. Names do not need to be unique.  Names must
    * be at least 1 character and no more than 256 characters, measured in
    * UTF-16 code units.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The range to apply the name to.
    */
  var range: js.UndefOr[SchemaRange] = js.undefined
}
object SchemaCreateNamedRangeRequest {
  
  inline def apply(): SchemaCreateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNamedRangeRequest]
  }
  
  extension [Self <: SchemaCreateNamedRangeRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
