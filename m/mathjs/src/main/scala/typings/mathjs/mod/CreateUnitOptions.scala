package typings.mathjs.mod

import typings.mathjs.mathjsStrings.binary_long
import typings.mathjs.mathjsStrings.binary_short
import typings.mathjs.mathjsStrings.long
import typings.mathjs.mathjsStrings.none
import typings.mathjs.mathjsStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUnitOptions extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var `override`: js.UndefOr[Boolean] = js.native
  
  var prefixes: js.UndefOr[none | short | long | binary_short | binary_long] = js.native
}
object CreateUnitOptions {
  
  @scala.inline
  def apply(): CreateUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUnitOptions]
  }
  
  @scala.inline
  implicit class CreateUnitOptionsMutableBuilder[Self <: CreateUnitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    @scala.inline
    def setPrefixes(value: none | short | long | binary_short | binary_long): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
  }
}
