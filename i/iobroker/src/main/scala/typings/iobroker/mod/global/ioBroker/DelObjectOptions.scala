package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelObjectOptions
  extends StObject
     with // Allow non-documented properties
/* other */ StringDictionary[Any] {
  
  /** Whether all child objects should be deleted aswell */
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object DelObjectOptions {
  
  inline def apply(): DelObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
