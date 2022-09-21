package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateFooterRequest extends StObject {
  
  /**
    * The location of the SectionBreak immediately preceding the section whose SectionStyle this footer should belong to. If this is unset or refers to the first section break in the document, the footer applies to the document style.
    */
  var sectionBreakLocation: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * The type of footer to create.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateFooterRequest {
  
  inline def apply(): SchemaCreateFooterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateFooterRequest]
  }
  
  extension [Self <: SchemaCreateFooterRequest](x: Self) {
    
    inline def setSectionBreakLocation(value: SchemaLocation): Self = StObject.set(x, "sectionBreakLocation", value.asInstanceOf[js.Any])
    
    inline def setSectionBreakLocationUndefined: Self = StObject.set(x, "sectionBreakLocation", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
