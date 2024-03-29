package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.serveColonbefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeBeforeHookInput
  extends StObject
     with HookInput {
  
  val name: serveColonbefore
  
  val serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions
}
object ServeBeforeHookInput {
  
  inline def apply(serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = "serve:before", serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeBeforeHookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServeBeforeHookInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: serveColonbefore): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServe(value: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
  }
}
