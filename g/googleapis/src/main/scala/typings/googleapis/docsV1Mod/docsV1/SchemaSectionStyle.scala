package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The styling that applies to a section.
  */
trait SchemaSectionStyle extends StObject {
  
  /**
    * The section&#39;s columns properties.  If empty, the section contains one
    * column with the default properties in the Docs editor.
    */
  var columnProperties: js.UndefOr[js.Array[SchemaSectionColumnProperties]] = js.undefined
  
  /**
    * The style of column separators.  This style can be set even when there is
    * one column in the section.
    */
  var columnSeparatorStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The content direction of this section. If unset, the value defaults to
    * LEFT_TO_RIGHT.
    */
  var contentDirection: js.UndefOr[String] = js.undefined
}
object SchemaSectionStyle {
  
  inline def apply(): SchemaSectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSectionStyle]
  }
  
  extension [Self <: SchemaSectionStyle](x: Self) {
    
    inline def setColumnProperties(value: js.Array[SchemaSectionColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    inline def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    inline def setColumnPropertiesVarargs(value: SchemaSectionColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value :_*))
    
    inline def setColumnSeparatorStyle(value: String): Self = StObject.set(x, "columnSeparatorStyle", value.asInstanceOf[js.Any])
    
    inline def setColumnSeparatorStyleUndefined: Self = StObject.set(x, "columnSeparatorStyle", js.undefined)
    
    inline def setContentDirection(value: String): Self = StObject.set(x, "contentDirection", value.asInstanceOf[js.Any])
    
    inline def setContentDirectionUndefined: Self = StObject.set(x, "contentDirection", js.undefined)
  }
}
