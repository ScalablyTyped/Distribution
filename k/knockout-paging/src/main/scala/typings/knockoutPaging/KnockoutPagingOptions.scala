package typings.knockoutPaging

import typings.knockoutPaging.anon.Dictname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutPagingOptions extends StObject {
  
  var defaults: KnockoutPagingDefaultOptions
  
  var generators: Dictname
}
object KnockoutPagingOptions {
  
  inline def apply(defaults: KnockoutPagingDefaultOptions, generators: Dictname): KnockoutPagingOptions = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], generators = generators.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutPagingOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: KnockoutPagingDefaultOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setGenerators(value: Dictname): Self = StObject.set(x, "generators", value.asInstanceOf[js.Any])
  }
}
