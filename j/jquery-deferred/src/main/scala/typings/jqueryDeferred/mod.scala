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
    
    inline def Callbacks(flags: Any): JQueryCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("Callbacks")(flags.asInstanceOf[js.Any]).asInstanceOf[JQueryCallback]
    
    inline def Deferred(): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")().asInstanceOf[JQueryDeferred]
    inline def Deferred(beforeStart: js.Function1[/* deferred */ JQueryDeferred, Any]): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")(beforeStart.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred]
    
    inline def each(collection: Any, callback: js.Function2[/* indexInArray */ Any, /* valueOfElement */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def extend(deep: Boolean, target: Any, objs: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(deep.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).`++`(objs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
    inline def extend(target: Any, objs: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(List(target.asInstanceOf[js.Any]).`++`(objs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
    
    inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPlainObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def noop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Any]
    
    inline def `type`(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def when(deferreds: Any*): JQueryPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(deferreds.asInstanceOf[Seq[js.Any]]*).asInstanceOf[JQueryPromise]
  }
}
