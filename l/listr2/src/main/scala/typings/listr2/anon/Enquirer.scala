package typings.listr2.anon

import typings.enquirer.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enquirer extends StObject {
  
  /**
    * Inject an `enquirer` instance for using with prompts.
    */
  var enquirer: js.UndefOr[^[js.Object]] = js.undefined
}
object Enquirer {
  
  inline def apply(): Enquirer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enquirer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enquirer] (val x: Self) extends AnyVal {
    
    inline def setEnquirer(value: ^[js.Object]): Self = StObject.set(x, "enquirer", value.asInstanceOf[js.Any])
    
    inline def setEnquirerUndefined: Self = StObject.set(x, "enquirer", js.undefined)
  }
}
