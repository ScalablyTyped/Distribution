package typings.atJupyterlabDocumentsearch.libTokensMod

import typings.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProvider
import typings.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProviderConstructor
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchProviderRegistry extends js.Object {
  /**
    * Signal that emits when a new search provider has been registered
    * or removed.
    */
  var changed: ISignal[ISearchProviderRegistry, Unit]
  /**
    * Returns a matching provider for the widget.
    *
    * @param widget - The widget to search over.
    * @returns the search provider, or undefined if none exists.
    */
  def getProviderForWidget(widget: js.Any): js.UndefOr[ISearchProvider[_]]
  /**
    * Add a provider to the registry.
    *
    * @param key - The provider key.
    * @returns A disposable delegate that, when disposed, deregisters the given search provider
    */
  def register(key: String, provider: ISearchProviderConstructor[_]): IDisposable
}

object ISearchProviderRegistry {
  @scala.inline
  def apply(
    changed: ISignal[ISearchProviderRegistry, Unit],
    getProviderForWidget: js.Any => js.UndefOr[ISearchProvider[_]],
    register: (String, ISearchProviderConstructor[_]) => IDisposable
  ): ISearchProviderRegistry = {
    val __obj = js.Dynamic.literal(changed = changed, getProviderForWidget = js.Any.fromFunction1(getProviderForWidget), register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[ISearchProviderRegistry]
  }
}

