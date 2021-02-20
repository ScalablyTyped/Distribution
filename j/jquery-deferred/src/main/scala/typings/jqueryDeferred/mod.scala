package typings.jqueryDeferred

import typings.jqueryDeferred.libMod.JQueryCallback
import typings.jqueryDeferred.libMod.JQueryDeferred
import typings.jqueryDeferred.libMod.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("jquery-deferred", "default.Callbacks")
    @js.native
    def Callbacks(flags: js.Any): JQueryCallback = js.native
    
    @JSImport("jquery-deferred", "default.Deferred")
    @js.native
    def Deferred(): JQueryDeferred = js.native
    @JSImport("jquery-deferred", "default.Deferred")
    @js.native
    def Deferred(beforeStart: js.Function1[/* deferred */ JQueryDeferred, _]): JQueryDeferred = js.native
    
    @JSImport("jquery-deferred", "default.each")
    @js.native
    def each(
      collection: js.Any,
      callback: js.Function2[/* indexInArray */ js.Any, /* valueOfElement */ js.Any, _]
    ): js.Any = js.native
    
    @JSImport("jquery-deferred", "default.extend")
    @js.native
    def extend(deep: Boolean, target: js.Any, objs: js.Any*): js.Object = js.native
    @JSImport("jquery-deferred", "default.extend")
    @js.native
    def extend(target: js.Any, objs: js.Any*): js.Object = js.native
    
    @JSImport("jquery-deferred", "default.isArray")
    @js.native
    def isArray(obj: js.Any): Boolean = js.native
    
    @JSImport("jquery-deferred", "default.isFunction")
    @js.native
    def isFunction(obj: js.Any): Boolean = js.native
    
    @JSImport("jquery-deferred", "default.isPlainObject")
    @js.native
    def isPlainObject(obj: js.Any): Boolean = js.native
    
    @JSImport("jquery-deferred", "default.noop")
    @js.native
    def noop(): js.Any = js.native
    
    @JSImport("jquery-deferred", "default.when")
    @js.native
    def when(deferreds: js.Any*): JQueryPromise = js.native
    
    @JSImport("jquery-deferred", "default.type")
    @js.native
    def `type`(obj: js.Any): String = js.native
  }
}
