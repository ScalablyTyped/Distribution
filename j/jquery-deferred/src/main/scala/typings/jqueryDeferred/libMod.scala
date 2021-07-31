package typings.jqueryDeferred

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("jquery-deferred/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Callbacks(flags: js.Any): JQueryCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("Callbacks")(flags.asInstanceOf[js.Any]).asInstanceOf[JQueryCallback]
  
  @scala.inline
  def Deferred(): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")().asInstanceOf[JQueryDeferred]
  @scala.inline
  def Deferred(beforeStart: js.Function1[/* deferred */ JQueryDeferred, js.Any]): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")(beforeStart.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred]
  
  @scala.inline
  def each(
    collection: js.Any,
    callback: js.Function2[/* indexInArray */ js.Any, /* valueOfElement */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def extend(deep: Boolean, target: js.Any, objs: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(deep.asInstanceOf[js.Any], target.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def extend(target: js.Any, objs: js.Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def isArray(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPlainObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def noop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[js.Any]
  
  @scala.inline
  def `type`(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def when(deferreds: js.Any*): JQueryPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(deferreds.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise]
  
  trait JQueryCallback extends StObject {
    
    def add(callbacks: js.Any*): js.Any
    
    def disable(): js.Any
    
    def disabled(): Boolean
    
    def empty(): js.Any
    
    def fire(arguments: js.Any*): js.Any
    
    def fireWith(context: js.Any, args: js.Any*): js.Any
    
    def fired(): Boolean
    
    def has(callback: js.Any): Boolean
    
    def lock(): js.Any
    
    def locked(): Boolean
    
    def remove(callbacks: js.Any*): js.Any
  }
  object JQueryCallback {
    
    @scala.inline
    def apply(
      add: /* repeated */ js.Any => js.Any,
      disable: () => js.Any,
      disabled: () => Boolean,
      empty: () => js.Any,
      fire: /* repeated */ js.Any => js.Any,
      fireWith: (js.Any, /* repeated */ js.Any) => js.Any,
      fired: () => Boolean,
      has: js.Any => Boolean,
      lock: () => js.Any,
      locked: () => Boolean,
      remove: /* repeated */ js.Any => js.Any
    ): JQueryCallback = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), disable = js.Any.fromFunction0(disable), disabled = js.Any.fromFunction0(disabled), empty = js.Any.fromFunction0(empty), fire = js.Any.fromFunction1(fire), fireWith = js.Any.fromFunction2(fireWith), fired = js.Any.fromFunction0(fired), has = js.Any.fromFunction1(has), lock = js.Any.fromFunction0(lock), locked = js.Any.fromFunction0(locked), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[JQueryCallback]
    }
    
    @scala.inline
    implicit class JQueryCallbackMutableBuilder[Self <: JQueryCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisable(value: () => js.Any): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabled(value: () => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmpty(value: () => js.Any): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFire(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFireWith(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "fireWith", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFired(value: () => Boolean): Self = StObject.set(x, "fired", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHas(value: js.Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLock(value: () => js.Any): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLocked(value: () => Boolean): Self = StObject.set(x, "locked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait JQueryDeferred
    extends StObject
       with JQueryPromise {
    
    def notify(args: js.Any*): JQueryDeferred = js.native
    
    def notifyWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
    
    def progress(progressCallbacks: js.Any*): JQueryDeferred = js.native
    
    def reject(args: js.Any*): JQueryDeferred = js.native
    
    def rejectWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
    
    def resolve(args: js.Any*): JQueryDeferred = js.native
    
    def resolveWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
  }
  
  @js.native
  trait JQueryPromise extends StObject {
    
    def always(alwaysCallbacks: js.Any*): JQueryDeferred = js.native
    
    def done(doneCallbacks: js.Any*): JQueryDeferred = js.native
    
    def fail(failCallbacks: js.Any*): JQueryDeferred = js.native
    
    def pipe(): JQueryPromise = js.native
    def pipe(doneFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise = js.native
    def pipe(doneFilter: js.Function1[/* x */ js.Any, js.Any], failFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise = js.native
    def pipe(
      doneFilter: js.Function1[/* x */ js.Any, js.Any],
      failFilter: js.Function1[/* x */ js.Any, js.Any],
      progressFilter: js.Function1[/* x */ js.Any, js.Any]
    ): JQueryPromise = js.native
    def pipe(
      doneFilter: js.Function1[/* x */ js.Any, js.Any],
      failFilter: Unit,
      progressFilter: js.Function1[/* x */ js.Any, js.Any]
    ): JQueryPromise = js.native
    def pipe(doneFilter: Unit, failFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise = js.native
    def pipe(
      doneFilter: Unit,
      failFilter: js.Function1[/* x */ js.Any, js.Any],
      progressFilter: js.Function1[/* x */ js.Any, js.Any]
    ): JQueryPromise = js.native
    def pipe(doneFilter: Unit, failFilter: Unit, progressFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise = js.native
    
    def promise(): JQueryPromise = js.native
    
    def state(): String = js.native
    
    def `then`(doneCallbacks: js.Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: js.Any, failCallbacks: js.Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: js.Any, failCallbacks: js.Any, progressCallbacks: js.Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: js.Any, failCallbacks: Unit, progressCallbacks: js.Any): JQueryDeferred = js.native
  }
}
