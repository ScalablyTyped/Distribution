package typings.jqueryDeferred

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("jquery-deferred/lib", "Callbacks")
  @js.native
  def Callbacks(flags: js.Any): JQueryCallback = js.native
  
  @JSImport("jquery-deferred/lib", "Deferred")
  @js.native
  def Deferred(): JQueryDeferred = js.native
  @JSImport("jquery-deferred/lib", "Deferred")
  @js.native
  def Deferred(beforeStart: js.Function1[/* deferred */ JQueryDeferred, _]): JQueryDeferred = js.native
  
  @JSImport("jquery-deferred/lib", "each")
  @js.native
  def each(
    collection: js.Any,
    callback: js.Function2[/* indexInArray */ js.Any, /* valueOfElement */ js.Any, _]
  ): js.Any = js.native
  
  @JSImport("jquery-deferred/lib", "extend")
  @js.native
  def extend(deep: Boolean, target: js.Any, objs: js.Any*): js.Object = js.native
  @JSImport("jquery-deferred/lib", "extend")
  @js.native
  def extend(target: js.Any, objs: js.Any*): js.Object = js.native
  
  @JSImport("jquery-deferred/lib", "isArray")
  @js.native
  def isArray(obj: js.Any): Boolean = js.native
  
  @JSImport("jquery-deferred/lib", "isFunction")
  @js.native
  def isFunction(obj: js.Any): Boolean = js.native
  
  @JSImport("jquery-deferred/lib", "isPlainObject")
  @js.native
  def isPlainObject(obj: js.Any): Boolean = js.native
  
  @JSImport("jquery-deferred/lib", "noop")
  @js.native
  def noop(): js.Any = js.native
  
  @JSImport("jquery-deferred/lib", "when")
  @js.native
  def when(deferreds: js.Any*): JQueryPromise = js.native
  
  @js.native
  trait JQueryCallback extends StObject {
    
    def add(callbacks: js.Any*): js.Any = js.native
    
    def disable(): js.Any = js.native
    
    def disabled(): Boolean = js.native
    
    def empty(): js.Any = js.native
    
    def fire(arguments: js.Any*): js.Any = js.native
    
    def fireWith(context: js.Any, args: js.Any*): js.Any = js.native
    
    def fired(): Boolean = js.native
    
    def has(callback: js.Any): Boolean = js.native
    
    def lock(): js.Any = js.native
    
    def locked(): Boolean = js.native
    
    def remove(callbacks: js.Any*): js.Any = js.native
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
  trait JQueryDeferred extends JQueryPromise {
    
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
    def pipe(
      doneFilter: js.UndefOr[scala.Nothing],
      failFilter: js.UndefOr[scala.Nothing],
      progressFilter: js.Function1[/* x */ js.Any, _]
    ): JQueryPromise = js.native
    def pipe(doneFilter: js.UndefOr[scala.Nothing], failFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise = js.native
    def pipe(
      doneFilter: js.UndefOr[scala.Nothing],
      failFilter: js.Function1[/* x */ js.Any, _],
      progressFilter: js.Function1[/* x */ js.Any, _]
    ): JQueryPromise = js.native
    def pipe(doneFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise = js.native
    def pipe(
      doneFilter: js.Function1[/* x */ js.Any, _],
      failFilter: js.UndefOr[scala.Nothing],
      progressFilter: js.Function1[/* x */ js.Any, _]
    ): JQueryPromise = js.native
    def pipe(doneFilter: js.Function1[/* x */ js.Any, _], failFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise = js.native
    def pipe(
      doneFilter: js.Function1[/* x */ js.Any, _],
      failFilter: js.Function1[/* x */ js.Any, _],
      progressFilter: js.Function1[/* x */ js.Any, _]
    ): JQueryPromise = js.native
    
    def promise(): JQueryPromise = js.native
    
    def state(): String = js.native
    
    def `then`(doneCallbacks: js.Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: js.Any, failCallbacks: js.UndefOr[scala.Nothing], progressCallbacks: js.Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: js.Any, failCallbacks: js.Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: js.Any, failCallbacks: js.Any, progressCallbacks: js.Any): JQueryDeferred = js.native
  }
  
  @JSImport("jquery-deferred/lib", "type")
  @js.native
  def `type`(obj: js.Any): String = js.native
}
