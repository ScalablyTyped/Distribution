package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The named styles. Paragraphs in the document can inherit their TextStyle
  * and ParagraphStyle from these named styles.
  */
trait SchemaNamedStyles extends StObject {
  
  /**
    * The named styles.  There is an entry for each of the possible named style
    * types.
    */
  var styles: js.UndefOr[js.Array[SchemaNamedStyle]] = js.undefined
}
object SchemaNamedStyles {
  
  inline def apply(): SchemaNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStyles]
  }
  
  extension [Self <: SchemaNamedStyles](x: Self) {
    
    inline def setStyles(value: js.Array[SchemaNamedStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: SchemaNamedStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
