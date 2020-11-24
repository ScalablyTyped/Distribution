package typings.jqueryTools.JQueryTools.overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayStatic extends js.Object {
  
  def addEffect(
    effectName: String,
    effectFn: js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit],
    closeFn: js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]
  ): Unit = js.native
}
object OverlayStatic {
  
  @scala.inline
  def apply(
    addEffect: (String, js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit], js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]) => Unit
  ): OverlayStatic = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction3(addEffect))
    __obj.asInstanceOf[OverlayStatic]
  }
  
  @scala.inline
  implicit class OverlayStaticOps[Self <: OverlayStatic] (val x: Self) extends AnyVal {
    
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
    def setAddEffect(
      value: (String, js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit], js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]) => Unit
    ): Self = this.set("addEffect", js.Any.fromFunction3(value))
  }
}
