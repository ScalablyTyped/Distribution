package typings.massive.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecomposeOptions
  extends StObject
     with /* foreignTable */ StringDictionary[DecomposeOptions | Any] {
  
  var columns: js.UndefOr[js.Array[String] | AnyObject[String]] = js.undefined
  
  var pk: String
}
object DecomposeOptions {
  
  inline def apply(pk: String): DecomposeOptions = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposeOptions]
  }
  
  extension [Self <: DecomposeOptions](x: Self) {
    
    inline def setColumns(value: js.Array[String] | AnyObject[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
  }
}
