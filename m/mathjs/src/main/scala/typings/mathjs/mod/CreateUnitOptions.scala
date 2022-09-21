package typings.mathjs.mod

import typings.mathjs.mathjsStrings.binary_long
import typings.mathjs.mathjsStrings.binary_short
import typings.mathjs.mathjsStrings.long
import typings.mathjs.mathjsStrings.none
import typings.mathjs.mathjsStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUnitOptions extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  var prefixes: js.UndefOr[none | short | long | binary_short | binary_long] = js.undefined
}
object CreateUnitOptions {
  
  inline def apply(): CreateUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUnitOptions]
  }
  
  extension [Self <: CreateUnitOptions](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setPrefixes(value: none | short | long | binary_short | binary_long): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
  }
}
