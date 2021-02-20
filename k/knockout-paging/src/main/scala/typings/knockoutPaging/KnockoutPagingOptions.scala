package typings.knockoutPaging

import typings.knockoutPaging.anon.Dictname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPagingOptions extends StObject {
  
  var defaults: KnockoutPagingDefaultOptions = js.native
  
  var generators: Dictname = js.native
}
object KnockoutPagingOptions {
  
  @scala.inline
  def apply(defaults: KnockoutPagingDefaultOptions, generators: Dictname): KnockoutPagingOptions = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], generators = generators.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingOptions]
  }
  
  @scala.inline
  implicit class KnockoutPagingOptionsMutableBuilder[Self <: KnockoutPagingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: KnockoutPagingDefaultOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerators(value: Dictname): Self = StObject.set(x, "generators", value.asInstanceOf[js.Any])
  }
}
