package typings.jqueryDeferred

import typings.jqueryDeferred.libMod.JQueryCallback
import typings.jqueryDeferred.libMod.JQueryDeferred
import typings.jqueryDeferred.libMod.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("jquery-deferred", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Callbacks(flags: js.Any): JQueryCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("Callbacks")(flags.asInstanceOf[js.Any]).asInstanceOf[JQueryCallback]
    
    inline def Deferred(): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")().asInstanceOf[JQueryDeferred]
    inline def Deferred(beforeStart: js.Function1[/* deferred */ JQueryDeferred, js.Any]): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")(beforeStart.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred]
    
    inline def each(
      collection: js.Any,
      callback: js.Function2[/* indexInArray */ js.Any, /* valueOfElement */ js.Any, js.Any]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def extend(deep: Boolean, target: js.Any, objs: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(deep.asInstanceOf[js.Any], target.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def extend(target: js.Any, objs: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def isArray(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPlainObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def noop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[js.Any]
    
    inline def `type`(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def when(deferreds: js.Any*): JQueryPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(deferreds.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise]
  }
}
