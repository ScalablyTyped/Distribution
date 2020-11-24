package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** parameter of ko.observable constructor
  Options Hash: (option):
  key (String) — the name of the attribute.
  read (Function) — a function used to provide transform the attribute value before passing it to the caller. Signature: read()
  write (Function) — a function used to provide transform the value before passing it to the model set function. Signature: write(value)
  args (Array) — arguments to pass to the read and write functions (they can be ko.observables). Can be useful for passing arguments to a locale manager.
  localizer (Constructor) — a concrete kb.LocalizedObservable constructor for localization.
  default (Data|ko.observable) — the default value. Can be a value, string or ko.observable.
  path (String) — the path to the value (used to create related observables from the factory).
  store (kb.Store) — a store used to cache and share view models.
  factory (kb.Factory) — a factory used to create view models.
  options (Object) — a set of options merge into these options using _.defaults. Useful for extending options when deriving classes rather than merging them by hand.
  */
@js.native
trait IObservableOptions extends js.Object {
  
  var args: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ _
    ]
  ] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
  var factory: js.UndefOr[js.Any] = js.native
  
  var key: String = js.native
  
  var localizer: js.UndefOr[LocalizedObservable] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var read: js.UndefOr[js.Function0[_]] = js.native
  
  var store: js.UndefOr[js.Any] = js.native
  
  var write: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
}
object IObservableOptions {
  
  @scala.inline
  def apply(key: String): IObservableOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableOptions]
  }
  
  @scala.inline
  implicit class IObservableOptionsOps[Self <: IObservableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ _
        ]
    ): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setFactory(value: js.Any): Self = this.set("factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactory: Self = this.set("factory", js.undefined)
    
    @scala.inline
    def setLocalizer(value: LocalizedObservable): Self = this.set("localizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizer: Self = this.set("localizer", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRead(value: () => _): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setWrite(value: /* value */ js.Any => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
}
