package typings.jestValidate

import typings.jestValidate.mod.DeprecatedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DeprecationEntries extends StObject {
    
    var deprecationEntries: js.UndefOr[DeprecatedOptions] = js.undefined
  }
  object DeprecationEntries {
    
    inline def apply(): DeprecationEntries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecationEntries]
    }
    
    extension [Self <: DeprecationEntries](x: Self) {
      
      inline def setDeprecationEntries(value: DeprecatedOptions): Self = StObject.set(x, "deprecationEntries", value.asInstanceOf[js.Any])
      
      inline def setDeprecationEntriesUndefined: Self = StObject.set(x, "deprecationEntries", js.undefined)
    }
  }
  
  trait HasDeprecationWarnings extends StObject {
    
    var hasDeprecationWarnings: Boolean
    
    var isValid: Boolean
  }
  object HasDeprecationWarnings {
    
    inline def apply(hasDeprecationWarnings: Boolean, isValid: Boolean): HasDeprecationWarnings = {
      val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasDeprecationWarnings]
    }
    
    extension [Self <: HasDeprecationWarnings](x: Self) {
      
      inline def setHasDeprecationWarnings(value: Boolean): Self = StObject.set(x, "hasDeprecationWarnings", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
}
