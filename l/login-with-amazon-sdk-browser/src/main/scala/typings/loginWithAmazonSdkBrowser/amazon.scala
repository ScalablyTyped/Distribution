package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amazon {
  
  object Login {
    
    @js.native
    sealed trait Region extends StObject
    @JSGlobal("amazon.Login.Region")
    @js.native
    object Region extends StObject {
      
      @js.native
      sealed trait AsiaPacific extends Region
      
      @js.native
      sealed trait Europe extends Region
      
      @js.native
      sealed trait NorthAmerica extends Region
    }
  }
}
