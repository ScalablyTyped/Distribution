package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait IObservableOptions extends js.Object {
  var args: js.UndefOr[js.Array[knockoutLib.KnockoutObservable[_]]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var factory: js.UndefOr[js.Any] = js.undefined
  var key: java.lang.String
  var localizer: js.UndefOr[LocalizedObservable] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var read: js.UndefOr[js.Function0[_]] = js.undefined
  var store: js.UndefOr[js.Any] = js.undefined
  var write: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
}

object IObservableOptions {
  @scala.inline
  def apply(
    key: java.lang.String,
    args: js.Array[knockoutLib.KnockoutObservable[_]] = null,
    default: js.Any = null,
    factory: js.Any = null,
    localizer: LocalizedObservable = null,
    options: js.Any = null,
    path: java.lang.String = null,
    read: () => _ = null,
    store: js.Any = null,
    write: /* value */ js.Any => scala.Unit = null
  ): IObservableOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (args != null) __obj.updateDynamic("args")(args)
    if (default != null) __obj.updateDynamic("default")(default)
    if (factory != null) __obj.updateDynamic("factory")(factory)
    if (localizer != null) __obj.updateDynamic("localizer")(localizer)
    if (options != null) __obj.updateDynamic("options")(options)
    if (path != null) __obj.updateDynamic("path")(path)
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction0(read))
    if (store != null) __obj.updateDynamic("store")(store)
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    __obj.asInstanceOf[IObservableOptions]
  }
}

