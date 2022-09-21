package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNumberContext[NumberFormats] extends StObject {
  
  var numberFormats: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof NumberFormats ]: NumberFormats[K]}
    */ typings.intlifyCoreBase.intlifyCoreBaseStrings.CoreNumberContext & TopLevel[NumberFormats]
}
object CoreNumberContext {
  
  inline def apply[NumberFormats](
    numberFormats: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof NumberFormats ]: NumberFormats[K]}
    */ typings.intlifyCoreBase.intlifyCoreBaseStrings.CoreNumberContext & TopLevel[NumberFormats]
  ): CoreNumberContext[NumberFormats] = {
    val __obj = js.Dynamic.literal(numberFormats = numberFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreNumberContext[NumberFormats]]
  }
  
  extension [Self <: CoreNumberContext[?], NumberFormats](x: Self & CoreNumberContext[NumberFormats]) {
    
    inline def setNumberFormats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof NumberFormats ]: NumberFormats[K]}
      */ typings.intlifyCoreBase.intlifyCoreBaseStrings.CoreNumberContext & TopLevel[NumberFormats]
    ): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
  }
}
