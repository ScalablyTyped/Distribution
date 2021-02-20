package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A named range.
  */
@js.native
trait SchemaNamedRange extends StObject {
  
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /**
    * The range this represents.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaNamedRange {
  
  @scala.inline
  def apply(): SchemaNamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRange]
  }
  
  @scala.inline
  implicit class SchemaNamedRangeMutableBuilder[Self <: SchemaNamedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
