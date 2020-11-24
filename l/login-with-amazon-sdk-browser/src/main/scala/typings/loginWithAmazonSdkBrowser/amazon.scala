package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("amazon")
@js.native
object amazon extends js.Object {
  
  @js.native
  object Login extends js.Object {
    
    @js.native
    sealed trait Region extends js.Object
    @js.native
    object Region extends js.Object {
      
      @js.native
      sealed trait AsiaPacific extends Region
      
      @js.native
      sealed trait Europe extends Region
      
      @js.native
      sealed trait NorthAmerica extends Region
    }
  }
}
