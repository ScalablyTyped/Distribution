package typings.krakenJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var basedir: js.UndefOr[String] = js.native
  
  var configdir: js.UndefOr[String] = js.native
  
  var inheritViews: js.UndefOr[Boolean] = js.native
  
  var mountpath: js.UndefOr[String] = js.native
  
  var onconfig: js.UndefOr[
    js.Function2[
      /* config */ Map[String, _], 
      /* next */ js.Function2[/* err */ Error | Null, /* config */ js.UndefOr[js.Object], _], 
      _
    ]
  ] = js.native
  
  var protocols: js.UndefOr[js.Object] = js.native
  
  var startupHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
  var uncaughtException: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
    
    @scala.inline
    def setConfigdir(value: String): Self = this.set("configdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigdir: Self = this.set("configdir", js.undefined)
    
    @scala.inline
    def setInheritViews(value: Boolean): Self = this.set("inheritViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritViews: Self = this.set("inheritViews", js.undefined)
    
    @scala.inline
    def setMountpath(value: String): Self = this.set("mountpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountpath: Self = this.set("mountpath", js.undefined)
    
    @scala.inline
    def setOnconfig(
      value: (/* config */ Map[String, _], /* next */ js.Function2[/* err */ Error | Null, /* config */ js.UndefOr[js.Object], _]) => _
    ): Self = this.set("onconfig", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnconfig: Self = this.set("onconfig", js.undefined)
    
    @scala.inline
    def setProtocols(value: js.Object): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setStartupHeaders(value: StringDictionary[String]): Self = this.set("startupHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupHeaders: Self = this.set("startupHeaders", js.undefined)
    
    @scala.inline
    def setUncaughtException(value: /* err */ Error => _): Self = this.set("uncaughtException", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUncaughtException: Self = this.set("uncaughtException", js.undefined)
  }
}
