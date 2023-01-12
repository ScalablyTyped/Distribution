package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSOptions
  extends StObject
     with AbortOptions {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object DNSOptions {
  
  inline def apply(): DNSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DNSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DNSOptions] (val x: Self) extends AnyVal {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
