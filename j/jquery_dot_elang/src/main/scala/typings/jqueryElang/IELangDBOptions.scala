package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ELang database (LocalStorage) functionality with Singleton instance
@js.native
trait IELangDBOptions extends StObject {
  
  var autocompleteRows: Double = js.native
}
object IELangDBOptions {
  
  @scala.inline
  def apply(autocompleteRows: Double): IELangDBOptions = {
    val __obj = js.Dynamic.literal(autocompleteRows = autocompleteRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBOptions]
  }
  
  @scala.inline
  implicit class IELangDBOptionsMutableBuilder[Self <: IELangDBOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocompleteRows(value: Double): Self = StObject.set(x, "autocompleteRows", value.asInstanceOf[js.Any])
  }
}
