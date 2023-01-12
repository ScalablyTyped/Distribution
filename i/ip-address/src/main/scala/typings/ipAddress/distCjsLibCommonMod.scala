package typings.ipAddress

import typings.ipAddress.distCjsLibIpv4Mod.Address4
import typings.ipAddress.distCjsLibIpv6Mod.Address6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsLibCommonMod {
  
  @JSImport("ip-address/dist/cjs/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCorrect(defaultBits: Double): js.ThisFunction0[/* this */ Address4 | Address6, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCorrect")(defaultBits.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction0[/* this */ Address4 | Address6, Boolean]]
  
  inline def isInSubnet(address: Address4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInSubnet")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isInSubnet(address: Address6): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInSubnet")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ReverseFormOptions extends StObject {
    
    var omitSuffix: js.UndefOr[Boolean] = js.undefined
  }
  object ReverseFormOptions {
    
    inline def apply(): ReverseFormOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReverseFormOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReverseFormOptions] (val x: Self) extends AnyVal {
      
      inline def setOmitSuffix(value: Boolean): Self = StObject.set(x, "omitSuffix", value.asInstanceOf[js.Any])
      
      inline def setOmitSuffixUndefined: Self = StObject.set(x, "omitSuffix", js.undefined)
    }
  }
}
