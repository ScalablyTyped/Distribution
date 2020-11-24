package typings.javaApplet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object JavaAppletStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.javaApplet.JavaAppletStatus with Double] = js.native
    
    /* 3 */ val Error: typings.javaApplet.JavaAppletStatus.Error with Double = js.native
    
    /* 1 */ val Loading: typings.javaApplet.JavaAppletStatus.Loading with Double = js.native
    
    /* 2 */ val Ready: typings.javaApplet.JavaAppletStatus.Ready with Double = js.native
  }
}
