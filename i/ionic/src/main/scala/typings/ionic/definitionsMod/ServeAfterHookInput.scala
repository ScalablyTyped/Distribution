package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.serveColonafter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServeAfterHookInput extends HookInput {
  
  val name: serveColonafter = js.native
  
  val serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails = js.native
}
object ServeAfterHookInput {
  
  @scala.inline
  def apply(
    name: serveColonafter,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeAfterHookInput]
  }
  
  @scala.inline
  implicit class ServeAfterHookInputMutableBuilder[Self <: ServeAfterHookInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: serveColonafter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServe(value: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
  }
}
