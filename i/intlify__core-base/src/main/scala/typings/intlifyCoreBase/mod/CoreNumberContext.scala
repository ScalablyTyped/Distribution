package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNumberContext[NumberFormats] extends StObject {
  
  var numberFormats: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof NumberFormats ]: NumberFormats[K]} */ js.Any
}
object CoreNumberContext {
  
  inline def apply[NumberFormats](
    numberFormats: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof NumberFormats ]: NumberFormats[K]} */ js.Any
  ): CoreNumberContext[NumberFormats] = {
    val __obj = js.Dynamic.literal(numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreNumberContext[NumberFormats]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreNumberContext[?], NumberFormats] (val x: Self & CoreNumberContext[NumberFormats]) extends AnyVal {
    
    inline def setNumberFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof NumberFormats ]: NumberFormats[K]} */ js.Any
    ): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
  }
}
