package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyUsage extends StObject {
  
  /**
    * Describes high-level ways in which a key may be used.
    */
  var baseKeyUsage: js.UndefOr[SchemaKeyUsageOptions] = js.undefined
  
  /**
    * Detailed scenarios in which a key may be used.
    */
  var extendedKeyUsage: js.UndefOr[SchemaExtendedKeyUsageOptions] = js.undefined
  
  /**
    * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
    */
  var unknownExtendedKeyUsages: js.UndefOr[js.Array[SchemaObjectId]] = js.undefined
}
object SchemaKeyUsage {
  
  inline def apply(): SchemaKeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyUsage]
  }
  
  extension [Self <: SchemaKeyUsage](x: Self) {
    
    inline def setBaseKeyUsage(value: SchemaKeyUsageOptions): Self = StObject.set(x, "baseKeyUsage", value.asInstanceOf[js.Any])
    
    inline def setBaseKeyUsageUndefined: Self = StObject.set(x, "baseKeyUsage", js.undefined)
    
    inline def setExtendedKeyUsage(value: SchemaExtendedKeyUsageOptions): Self = StObject.set(x, "extendedKeyUsage", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsageUndefined: Self = StObject.set(x, "extendedKeyUsage", js.undefined)
    
    inline def setUnknownExtendedKeyUsages(value: js.Array[SchemaObjectId]): Self = StObject.set(x, "unknownExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    inline def setUnknownExtendedKeyUsagesUndefined: Self = StObject.set(x, "unknownExtendedKeyUsages", js.undefined)
    
    inline def setUnknownExtendedKeyUsagesVarargs(value: SchemaObjectId*): Self = StObject.set(x, "unknownExtendedKeyUsages", js.Array(value*))
  }
}
