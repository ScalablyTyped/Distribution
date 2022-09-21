package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait IObservableOptions extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var args: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
    ]
  ] = js.undefined
  
  var factory: js.UndefOr[Any] = js.undefined
  
  var key: String
  
  var localizer: js.UndefOr[LocalizedObservable] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var read: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var store: js.UndefOr[Any] = js.undefined
  
  var write: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
}
object IObservableOptions {
  
  inline def apply(key: String): IObservableOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableOptions]
  }
  
  extension [Self <: IObservableOptions](x: Self) {
    
    inline def setArgs(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
        ]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any)*
    ): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setFactory(value: Any): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLocalizer(value: LocalizedObservable): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
    
    inline def setLocalizerUndefined: Self = StObject.set(x, "localizer", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRead(value: () => Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setWrite(value: /* value */ Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
