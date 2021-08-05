package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties that apply to a section&#39;s column.
  */
trait SchemaSectionColumnProperties extends StObject {
  
  /**
    * The padding at the end of the column.
    */
  var paddingEnd: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The width of the column.
    */
  var width: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaSectionColumnProperties {
  
  inline def apply(): SchemaSectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSectionColumnProperties]
  }
  
  extension [Self <: SchemaSectionColumnProperties](x: Self) {
    
    inline def setPaddingEnd(value: SchemaDimension): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
    
    inline def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
    
    inline def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
