package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagesize extends StObject {
  
  var pagesize: js.UndefOr[Double] = js.undefined
  
  var sender: js.UndefOr[String] = js.undefined
}
object Pagesize {
  
  inline def apply(): Pagesize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagesize]
  }
  
  extension [Self <: Pagesize](x: Self) {
    
    inline def setPagesize(value: Double): Self = StObject.set(x, "pagesize", value.asInstanceOf[js.Any])
    
    inline def setPagesizeUndefined: Self = StObject.set(x, "pagesize", js.undefined)
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
