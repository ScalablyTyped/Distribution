package typings.karmaJsdomLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsdomLauncherOptions extends js.Object {
  
  /**
    * You can pass options directly to jsdom as shown below.
    * See jsdom's own documentation for all supported options.
    */
  var jsdom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jsdom.ConstructorOptions */ js.Any = js.native
}
object JsdomLauncherOptions {
  
  @scala.inline
  def apply(
    jsdom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jsdom.ConstructorOptions */ js.Any
  ): JsdomLauncherOptions = {
    val __obj = js.Dynamic.literal(jsdom = jsdom.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsdomLauncherOptions]
  }
  
  @scala.inline
  implicit class JsdomLauncherOptionsOps[Self <: JsdomLauncherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJsdom(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jsdom.ConstructorOptions */ js.Any
    ): Self = this.set("jsdom", value.asInstanceOf[js.Any])
  }
}
