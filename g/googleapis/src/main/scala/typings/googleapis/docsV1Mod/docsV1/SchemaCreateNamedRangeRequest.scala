package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a NamedRange referencing the given range.
  */
@js.native
trait SchemaCreateNamedRangeRequest extends StObject {
  
  /**
    * The name of the NamedRange. Names do not need to be unique.  Names must
    * be at least 1 character and no more than 256 characters, measured in
    * UTF-16 code units.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The range to apply the name to.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}
object SchemaCreateNamedRangeRequest {
  
  @scala.inline
  def apply(): SchemaCreateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNamedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateNamedRangeRequestMutableBuilder[Self <: SchemaCreateNamedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
