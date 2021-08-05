package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorSerialization extends StObject {
  
  var custom: js.UndefOr[js.Function] = js.undefined
  
  var entities: js.UndefOr[Boolean] = js.undefined
  
  var scripts: js.UndefOr[Boolean] = js.undefined
  
  var semantic: js.UndefOr[Boolean] = js.undefined
}
object EditorSerialization {
  
  inline def apply(): EditorSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSerialization]
  }
  
  extension [Self <: EditorSerialization](x: Self) {
    
    inline def setCustom(value: js.Function): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setEntities(value: Boolean): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    inline def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
  }
}
