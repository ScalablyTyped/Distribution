package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellOutputOptions
  extends StObject
     with IShellSpawnOptions {
  
  var fatalOnError: js.UndefOr[Boolean] = js.undefined
  
  var fatalOnNotFound: js.UndefOr[Boolean] = js.undefined
  
  var showError: js.UndefOr[Boolean] = js.undefined
}
object IShellOutputOptions {
  
  inline def apply(): IShellOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellOutputOptions]
  }
  
  extension [Self <: IShellOutputOptions](x: Self) {
    
    inline def setFatalOnError(value: Boolean): Self = StObject.set(x, "fatalOnError", value.asInstanceOf[js.Any])
    
    inline def setFatalOnErrorUndefined: Self = StObject.set(x, "fatalOnError", js.undefined)
    
    inline def setFatalOnNotFound(value: Boolean): Self = StObject.set(x, "fatalOnNotFound", value.asInstanceOf[js.Any])
    
    inline def setFatalOnNotFoundUndefined: Self = StObject.set(x, "fatalOnNotFound", js.undefined)
    
    inline def setShowError(value: Boolean): Self = StObject.set(x, "showError", value.asInstanceOf[js.Any])
    
    inline def setShowErrorUndefined: Self = StObject.set(x, "showError", js.undefined)
  }
}
