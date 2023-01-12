package typings.libp2pInterfaceDht.mod

import typings.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions
  extends StObject
     with AbortOptions {
  
  var queryFuncTimeout: js.UndefOr[Double] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    inline def setQueryFuncTimeout(value: Double): Self = StObject.set(x, "queryFuncTimeout", value.asInstanceOf[js.Any])
    
    inline def setQueryFuncTimeoutUndefined: Self = StObject.set(x, "queryFuncTimeout", js.undefined)
  }
}
