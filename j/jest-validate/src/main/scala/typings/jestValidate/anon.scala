package typings.jestValidate

import org.scalablytyped.runtime.StringDictionary
import typings.jestValidate.mod.DeprecatedOptions
import typings.yargs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dicts
    extends StObject
       with /* s */ StringDictionary[Options] {
    
    var deprecationEntries: DeprecatedOptions
  }
  object Dicts {
    
    inline def apply(deprecationEntries: DeprecatedOptions): Dicts = {
      val __obj = js.Dynamic.literal(deprecationEntries = deprecationEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dicts]
    }
    
    extension [Self <: Dicts](x: Self) {
      
      inline def setDeprecationEntries(value: DeprecatedOptions): Self = StObject.set(x, "deprecationEntries", value.asInstanceOf[js.Any])
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
