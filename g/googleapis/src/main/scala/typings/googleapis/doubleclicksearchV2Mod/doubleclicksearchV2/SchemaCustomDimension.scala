package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message containing the custome dimension.
  */
trait SchemaCustomDimension extends StObject {
  
  /**
    * Custom dimension name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Custom dimension value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaCustomDimension {
  
  inline def apply(): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDimension]
  }
  
  extension [Self <: SchemaCustomDimension](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
