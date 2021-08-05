package typings.knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelBase
import typings.backbone.mod.ModelSetOptions
import typings.knockback.Knockback.FactoryOptions
import typings.knockback.Knockback.Static
import typings.knockback.Knockback.StoreOptions
import typings.knockback.Knockback.ViewModelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Knockback {
    
    @JSGlobal("Knockback.DefaultObservable")
    @js.native
    class DefaultObservable protected ()
      extends StObject
         with typings.knockback.Knockback.DefaultObservable {
      def this(
        targetObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        defaultValue: js.Any
      ) = this()
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      
      /* CompleteClass */
      override def setToDefault(): js.Any = js.native
    }
    
    @JSGlobal("Knockback.Destroyable")
    @js.native
    class Destroyable ()
      extends StObject
         with typings.knockback.Knockback.Destroyable {
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    
    @JSGlobal("Knockback.EventWatcher")
    @js.native
    class EventWatcher ()
      extends StObject
         with typings.knockback.Knockback.EventWatcher {
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    object EventWatcher {
      
      @JSGlobal("Knockback.EventWatcher")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def useOptionsOrCreate(
        options: js.Any,
        emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        obj: Model[js.Any, ModelSetOptions, js.Object],
        callback_options: js.Any
      ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useOptionsOrCreate")(options.asInstanceOf[js.Any], emitter.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback_options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    @JSGlobal("Knockback.Factory")
    @js.native
    class Factory protected ()
      extends StObject
         with typings.knockback.Knockback.Factory {
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
    object Factory {
      
      @JSGlobal("Knockback.Factory")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def useOptionsOrCreate(options: FactoryOptions, obj: js.Any, owner_path: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useOptionsOrCreate")(options.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], owner_path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    @JSGlobal("Knockback.FormattedObservable")
    @js.native
    class FormattedObservable protected ()
      extends StObject
         with typings.knockback.Knockback.Destroyable {
      def this(format: String, args: js.Array[js.Any]) = this()
      def this(
        format: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        args: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    
    @JSGlobal("Knockback.LocalizedObservable")
    @js.native
    class LocalizedObservable protected ()
      extends StObject
         with typings.knockback.Knockback.LocalizedObservable {
      def this(value: js.Any, options: js.Any, vm: js.Any) = this()
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      
      /* CompleteClass */
      override def observedValue(value: js.Any): js.Any = js.native
      
      /* CompleteClass */
      override def resetToCurrent(): js.Any = js.native
    }
    
    @JSGlobal("Knockback.Statistics")
    @js.native
    class Statistics ()
      extends StObject
         with typings.knockback.Knockback.Statistics {
      
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
    
    @JSGlobal("Knockback.Store")
    @js.native
    class Store protected ()
      extends StObject
         with typings.knockback.Knockback.Store {
      def this(model: Model[js.Any, ModelSetOptions, js.Object], options: StoreOptions) = this()
      
      /* CompleteClass */
      override def clear(): js.Any = js.native
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      
      /* CompleteClass */
      override def findOrCreate(obj: Model[js.Any, ModelSetOptions, js.Object], options: StoreOptions): js.Any = js.native
      
      /* CompleteClass */
      override def register(
        obj: Model[js.Any, ModelSetOptions, js.Object],
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        options: StoreOptions
      ): js.Any = js.native
    }
    object Store {
      
      @JSGlobal("Knockback.Store")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def useOptionsOrCreate(
        options: StoreOptions,
        obj: js.Any,
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
      ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useOptionsOrCreate")(options.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], observable.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    @JSGlobal("Knockback.TriggeredObservable")
    @js.native
    class TriggeredObservable protected ()
      extends StObject
         with typings.knockback.Knockback.TriggeredObservable {
      def this(emitter: ModelBase, event: String) = this()
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
    }
    
    @JSGlobal("Knockback.ViewModel")
    @js.native
    class ViewModel ()
      extends StObject
         with typings.knockback.Knockback.ViewModel {
      def this(model: Model[js.Any, ModelSetOptions, js.Object]) = this()
      def this(model: Unit, options: ViewModelOptions) = this()
      def this(model: Model[js.Any, ModelSetOptions, js.Object], options: ViewModelOptions) = this()
      def this(model: Unit, options: Unit, viewModel: typings.knockback.Knockback.ViewModel) = this()
      def this(model: Unit, options: ViewModelOptions, viewModel: typings.knockback.Knockback.ViewModel) = this()
      def this(
        model: Model[js.Any, ModelSetOptions, js.Object],
        options: Unit,
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: Model[js.Any, ModelSetOptions, js.Object],
        options: ViewModelOptions,
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      
      /* CompleteClass */
      override def destroy(): js.Any = js.native
      
      /* CompleteClass */
      override def extend(source: js.Any): js.Any = js.native
      
      /* CompleteClass */
      override def model(): Model[js.Any, ModelSetOptions, js.Object] = js.native
      
      /* CompleteClass */
      override def shareOptions(): ViewModelOptions = js.native
    }
  }
  
  @JSGlobal("kb")
  @js.native
  def kb: Static = js.native
  inline def kb_=(x: Static): Unit = js.Dynamic.global.updateDynamic("kb")(x.asInstanceOf[js.Any])
}
