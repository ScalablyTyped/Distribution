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
    open class DefaultObservable protected ()
      extends StObject
         with typings.knockback.Knockback.DefaultObservable {
      def this(
        targetObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
        defaultValue: Any
      ) = this()
      
      /* CompleteClass */
      override def destroy(): Any = js.native
      
      /* CompleteClass */
      override def setToDefault(): Any = js.native
    }
    
    @JSGlobal("Knockback.Destroyable")
    @js.native
    open class Destroyable ()
      extends StObject
         with typings.knockback.Knockback.Destroyable {
      
      /* CompleteClass */
      override def destroy(): Any = js.native
    }
    
    @JSGlobal("Knockback.EventWatcher")
    @js.native
    open class EventWatcher ()
      extends StObject
         with typings.knockback.Knockback.EventWatcher {
      
      /* CompleteClass */
      override def destroy(): Any = js.native
    }
    object EventWatcher {
      
      @JSGlobal("Knockback.EventWatcher")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def useOptionsOrCreate(
        options: Any,
        emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
        obj: Model[Any, ModelSetOptions, Any],
        callback_options: Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useOptionsOrCreate")(options.asInstanceOf[js.Any], emitter.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback_options.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSGlobal("Knockback.Factory")
    @js.native
    open class Factory protected ()
      extends StObject
         with typings.knockback.Knockback.Factory {
      def this(parent_factory: Any) = this()
      
      /* CompleteClass */
      override def addPathMapping(path: String, create_info: Any): Any = js.native
      
      /* CompleteClass */
      override def addPathMappings(factories: Any, owner_path: String): Any = js.native
      
      /* CompleteClass */
      override def creatorForPath(obj: Any, path: String): Any = js.native
      
      /* CompleteClass */
      override def hasPath(path: String): Boolean = js.native
      
      /* CompleteClass */
      override def hasPathMappings(factories: Any, owner_path: String): Boolean = js.native
    }
    object Factory {
      
      @JSGlobal("Knockback.Factory")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def useOptionsOrCreate(options: FactoryOptions, obj: Any, owner_path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useOptionsOrCreate")(options.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], owner_path.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSGlobal("Knockback.FormattedObservable")
    @js.native
    open class FormattedObservable protected ()
      extends StObject
         with typings.knockback.Knockback.Destroyable {
      def this(format: String, args: js.Array[Any]) = this()
      def this(
        format: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
        args: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def destroy(): Any = js.native
    }
    
    @JSGlobal("Knockback.LocalizedObservable")
    @js.native
    open class LocalizedObservable protected ()
      extends StObject
         with typings.knockback.Knockback.LocalizedObservable {
      def this(value: Any, options: Any, vm: Any) = this()
      
      /* CompleteClass */
      override def destroy(): Any = js.native
      
      /* CompleteClass */
      override def observedValue(value: Any): Any = js.native
      
      /* CompleteClass */
      override def resetToCurrent(): Any = js.native
    }
    
    @JSGlobal("Knockback.Statistics")
    @js.native
    open class Statistics ()
      extends StObject
         with typings.knockback.Knockback.Statistics {
      
      /* CompleteClass */
      override def addModelEvent(event: String): Any = js.native
      
      /* CompleteClass */
      override def clear(): Any = js.native
      
      /* CompleteClass */
      override def modelEventsStatsString(): Any = js.native
      
      /* CompleteClass */
      override def register(key: String, obj: Any): Any = js.native
      
      /* CompleteClass */
      override def registeredCount(`type`: Any): Double = js.native
      
      /* CompleteClass */
      override def registeredStatsString(success_message: String): String = js.native
      
      /* CompleteClass */
      override def unregister(key: String, obj: Any): Any = js.native
    }
    
    @JSGlobal("Knockback.Store")
    @js.native
    open class Store protected ()
      extends StObject
         with typings.knockback.Knockback.Store {
      def this(model: Model[Any, ModelSetOptions, Any], options: StoreOptions) = this()
      
      /* CompleteClass */
      override def clear(): Any = js.native
      
      /* CompleteClass */
      override def destroy(): Any = js.native
      
      /* CompleteClass */
      override def findOrCreate(obj: Model[Any, ModelSetOptions, Any], options: StoreOptions): Any = js.native
      
      /* CompleteClass */
      override def register(
        obj: Model[Any, ModelSetOptions, Any],
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
        options: StoreOptions
      ): Any = js.native
    }
    object Store {
      
      @JSGlobal("Knockback.Store")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def useOptionsOrCreate(
        options: StoreOptions,
        obj: Any,
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
      ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useOptionsOrCreate")(options.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], observable.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSGlobal("Knockback.TriggeredObservable")
    @js.native
    open class TriggeredObservable protected ()
      extends StObject
         with typings.knockback.Knockback.TriggeredObservable {
      def this(emitter: ModelBase, event: String) = this()
      
      /* CompleteClass */
      override def destroy(): Any = js.native
    }
    
    @JSGlobal("Knockback.ViewModel")
    @js.native
    open class ViewModel ()
      extends StObject
         with typings.knockback.Knockback.ViewModel {
      def this(model: Model[Any, ModelSetOptions, Any]) = this()
      def this(model: Unit, options: ViewModelOptions) = this()
      def this(model: Model[Any, ModelSetOptions, Any], options: ViewModelOptions) = this()
      def this(model: Unit, options: Unit, viewModel: typings.knockback.Knockback.ViewModel) = this()
      def this(model: Unit, options: ViewModelOptions, viewModel: typings.knockback.Knockback.ViewModel) = this()
      def this(
        model: Model[Any, ModelSetOptions, Any],
        options: Unit,
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: Model[Any, ModelSetOptions, Any],
        options: ViewModelOptions,
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      
      /* CompleteClass */
      override def destroy(): Any = js.native
      
      /* CompleteClass */
      override def extend(source: Any): Any = js.native
      
      /* CompleteClass */
      override def model(): Model[Any, ModelSetOptions, Any] = js.native
      
      /* CompleteClass */
      override def shareOptions(): ViewModelOptions = js.native
    }
  }
  
  @JSGlobal("kb")
  @js.native
  def kb: Static = js.native
  inline def kb_=(x: Static): Unit = js.Dynamic.global.updateDynamic("kb")(x.asInstanceOf[js.Any])
}
