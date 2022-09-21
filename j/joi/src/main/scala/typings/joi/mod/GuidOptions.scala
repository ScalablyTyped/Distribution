package typings.joi.mod

import typings.joi.joiStrings.Colon
import typings.joi.joiStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidOptions extends StObject {
  
  var separator: js.UndefOr[Boolean | `-_` | Colon] = js.undefined
  
  var version: js.UndefOr[js.Array[GuidVersions] | GuidVersions] = js.undefined
}
object GuidOptions {
  
  inline def apply(): GuidOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuidOptions]
  }
  
  extension [Self <: GuidOptions](x: Self) {
    
    inline def setSeparator(value: Boolean | `-_` | Colon): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setVersion(value: js.Array[GuidVersions] | GuidVersions): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: GuidVersions*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
