package typings.jestRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'cache' | 'config' | 'debug' | 'version' | 'watchman', / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any> */
@js.native
trait Recordcacheconfigdebugver extends js.Object {
  
  var cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any = js.native
  
  var config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any = js.native
  
  var debug: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any = js.native
  
  var version: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any = js.native
  
  var watchman: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any = js.native
}
object Recordcacheconfigdebugver {
  
  @scala.inline
  def apply(
    cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any,
    debug: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any,
    version: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any,
    watchman: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): Recordcacheconfigdebugver = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordcacheconfigdebugver]
  }
  
  @scala.inline
  implicit class RecordcacheconfigdebugverOps[Self <: Recordcacheconfigdebugver] (val x: Self) extends AnyVal {
    
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
    def setCache(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
    ): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
    ): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
    ): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
    ): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchman(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
    ): Self = this.set("watchman", value.asInstanceOf[js.Any])
  }
}
