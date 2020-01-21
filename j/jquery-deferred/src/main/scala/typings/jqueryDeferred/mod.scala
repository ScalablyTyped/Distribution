package typings.jqueryDeferred

import typings.jqueryDeferred.libMod.JQueryCallback
import typings.jqueryDeferred.libMod.JQueryDeferred
import typings.jqueryDeferred.libMod.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jquery-deferred", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    def Callbacks(flags: js.Any): JQueryCallback = js.native
    def Deferred(): JQueryDeferred = js.native
    def Deferred(beforeStart: js.Function1[/* deferred */ JQueryDeferred, _]): JQueryDeferred = js.native
    def each(
      collection: js.Any,
      callback: js.Function2[/* indexInArray */ js.Any, /* valueOfElement */ js.Any, _]
    ): js.Any = js.native
    def extend(deep: Boolean, target: js.Any, objs: js.Any*): js.Object = js.native
    def extend(target: js.Any, objs: js.Any*): js.Object = js.native
    def isArray(obj: js.Any): Boolean = js.native
    def isFunction(obj: js.Any): Boolean = js.native
    def isPlainObject(obj: js.Any): Boolean = js.native
    def noop(): js.Any = js.native
    def `type`(obj: js.Any): String = js.native
    def when(deferreds: js.Any*): JQueryPromise = js.native
  }
  
}

