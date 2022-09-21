package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTabStop extends StObject {
  
  /**
    * The alignment of this tab stop. If unset, the value defaults to START.
    */
  var alignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The offset between this tab stop and the start margin.
    */
  var offset: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaTabStop {
  
  inline def apply(): SchemaTabStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTabStop]
  }
  
  extension [Self <: SchemaTabStop](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentNull: Self = StObject.set(x, "alignment", null)
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setOffset(value: SchemaDimension): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
