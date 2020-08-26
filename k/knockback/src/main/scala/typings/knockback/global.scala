package typings.knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelBase
import typings.backbone.mod.ModelSetOptions
import typings.knockback.Knockback.FactoryOptions
import typings.knockback.Knockback.Static
import typings.knockback.Knockback.StoreOptions
import typings.knockback.Knockback.ViewModelOptions
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
      def this(
        targetObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        defaultValue: js.Any
      ) = this()
    }
    
    @js.native
    class Destroyable ()
      extends typings.knockback.Knockback.Destroyable
    
    @js.native
    class EventWatcher ()
      extends typings.knockback.Knockback.EventWatcher
    
    @js.native
    class Factory protected ()
      extends typings.knockback.Knockback.Factory {
      def this(parent_factory: js.Any) = this()
    }
    
    @js.native
    class FormattedObservable protected ()
      extends typings.knockback.Knockback.Destroyable {
      def this(format: String, args: js.Array[_]) = this()
      def this(
        format: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        args: js.Array[_]
      ) = this()
    }
    
    @js.native
    class LocalizedObservable protected ()
      extends typings.knockback.Knockback.LocalizedObservable {
      def this(value: js.Any, options: js.Any, vm: js.Any) = this()
    }
    
    @js.native
    class Statistics ()
      extends typings.knockback.Knockback.Statistics
    
    @js.native
    class Store protected ()
      extends typings.knockback.Knockback.Store {
      def this(model: Model[_, ModelSetOptions], options: StoreOptions) = this()
    }
    
    @js.native
    class TriggeredObservable protected ()
      extends typings.knockback.Knockback.TriggeredObservable {
      def this(emitter: ModelBase, event: String) = this()
    }
    
    @js.native
    class ViewModel ()
      extends typings.knockback.Knockback.ViewModel {
      def this(model: Model[_, ModelSetOptions]) = this()
      def this(model: js.UndefOr[scala.Nothing], options: ViewModelOptions) = this()
      def this(model: Model[_, ModelSetOptions], options: ViewModelOptions) = this()
      def this(
        model: js.UndefOr[scala.Nothing],
        options: js.UndefOr[scala.Nothing],
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: js.UndefOr[scala.Nothing],
        options: ViewModelOptions,
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: Model[_, ModelSetOptions],
        options: js.UndefOr[scala.Nothing],
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: Model[_, ModelSetOptions],
        options: ViewModelOptions,
        viewModel: typings.knockback.Knockback.ViewModel
      ) = this()
    }
    
    /* static members */
    @js.native
    object EventWatcher extends js.Object {
      def useOptionsOrCreate(
        options: js.Any,
        emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
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
      def useOptionsOrCreate(
        options: StoreOptions,
        obj: js.Any,
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
      ): js.Any = js.native
    }
    
  }
  
}

