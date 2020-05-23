package typings.knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelBase
import typings.backbone.mod.ModelSetOptions
import typings.knockback.Knockback.FactoryOptions
import typings.knockback.Knockback.Static
import typings.knockback.Knockback.StoreOptions
import typings.knockback.Knockback.ViewModelOptions
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var kb: Static = js.native
  @js.native
  object Knockback extends js.Object {
    @js.native
    class DefaultObservable protected ()
      extends typings.knockback.Knockback.DefaultObservable {
      def this(targetObservable: KnockoutObservable[_], defaultValue: js.Any) = this()
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      /* CompleteClass */
      override def setToDefault(): js.Any = js.native
    }
    
    @js.native
    class Destroyable ()
      extends typings.knockback.Knockback.Destroyable {
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    
    @js.native
    class EventWatcher ()
      extends typings.knockback.Knockback.EventWatcher {
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    
    @js.native
    class Factory protected ()
      extends typings.knockback.Knockback.Factory {
      def this(parent_factory: js.Any) = this()
      /* CompleteClass */
      override def addPathMapping(path: String, create_info: js.Any): js.Any = js.native
      /* CompleteClass */
      override def addPathMappings(factories: js.Any, owner_path: String): js.Any = js.native
      /* CompleteClass */
      override def creatorForPath(obj: js.Any, path: String): js.Any = js.native
      /* CompleteClass */
      override def hasPath(path: String): Boolean = js.native
      /* CompleteClass */
      override def hasPathMappings(factories: js.Any, owner_path: String): Boolean = js.native
    }
    
    @js.native
    class FormattedObservable protected ()
      extends typings.knockback.Knockback.Destroyable {
      def this(format: String, args: js.Array[_]) = this()
      def this(format: KnockoutObservable[_], args: js.Array[_]) = this()
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    
    @js.native
    class LocalizedObservable protected ()
      extends typings.knockback.Knockback.LocalizedObservable {
      def this(value: js.Any, options: js.Any, vm: js.Any) = this()
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      /* CompleteClass */
      override def observedValue(value: js.Any): js.Any = js.native
      /* CompleteClass */
      override def resetToCurrent(): js.Any = js.native
    }
    
    @js.native
    class Statistics ()
      extends typings.knockback.Knockback.Statistics {
      /* CompleteClass */
      override def addModelEvent(event: String): js.Any = js.native
      /* CompleteClass */
      override def clear(): js.Any = js.native
      /* CompleteClass */
      override def modelEventsStatsString(): js.Any = js.native
      /* CompleteClass */
      override def register(key: String, obj: js.Any): js.Any = js.native
      /* CompleteClass */
      override def registeredCount(`type`: js.Any): Double = js.native
      /* CompleteClass */
      override def registeredStatsString(success_message: String): String = js.native
      /* CompleteClass */
      override def unregister(key: String, obj: js.Any): js.Any = js.native
    }
    
    @js.native
    class Store protected ()
      extends typings.knockback.Knockback.Store {
      def this(model: Model[_, ModelSetOptions], options: StoreOptions) = this()
      /* CompleteClass */
      override def clear(): js.Any = js.native
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      /* CompleteClass */
      override def findOrCreate(obj: Model[_, ModelSetOptions], options: StoreOptions): js.Any = js.native
      /* CompleteClass */
      override def register(obj: Model[_, ModelSetOptions], observable: KnockoutObservable[_], options: StoreOptions): js.Any = js.native
    }
    
    @js.native
    class TriggeredObservable protected ()
      extends typings.knockback.Knockback.TriggeredObservable {
      def this(emitter: ModelBase, event: String) = this()
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    
    @js.native
    class ViewModel ()
      extends typings.knockback.Knockback.ViewModel {
      def this(model: Model[_, ModelSetOptions]) = this()
      def this(model: Model[_, ModelSetOptions], options: ViewModelOptions) = this()
      def this(
        model: Model[_, ModelSetOptions],
        options: ViewModelOptions,
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      /* CompleteClass */
      override def extend(source: js.Any): js.Any = js.native
      /* CompleteClass */
      override def model(): Model[_, ModelSetOptions] = js.native
      /* CompleteClass */
      override def shareOptions(): ViewModelOptions = js.native
    }
    
    /* static members */
    @js.native
    object EventWatcher extends js.Object {
      def useOptionsOrCreate(
        options: js.Any,
        emitter: KnockoutObservable[_],
        obj: Model[_, ModelSetOptions],
        callback_options: js.Any
      ): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object Factory extends js.Object {
      def useOptionsOrCreate(options: FactoryOptions, obj: js.Any, owner_path: String): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object Store extends js.Object {
      def useOptionsOrCreate(options: StoreOptions, obj: js.Any, observable: KnockoutObservable[_]): js.Any = js.native
    }
    
  }
  
}

