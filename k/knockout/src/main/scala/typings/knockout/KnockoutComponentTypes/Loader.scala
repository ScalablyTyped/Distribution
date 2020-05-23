package typings.knockout.KnockoutComponentTypes

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  /**
    * Define this if: you want to supply configurations programmatically based on names, e.g., to implement a naming convention.
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ String, 
      /* callback */ js.Function1[/* result */ ComponentConfig[ViewModel] | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to take control over how component configurations are interpreted, e.g., if you do not want to use the standard 'viewModel/template' pair format.
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* config */ ComponentConfig[ViewModel], 
      /* callback */ js.Function1[/* result */ Definition | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to use custom logic to supply DOM nodes for a given template configuration (e.g., using an ajax request to fetch a template by URL).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[Node] | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to use custom logic to supply a viewmodel factory for a given viewmodel configuration (e.g., integrating with a third-party module loader or dependency injection system).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadViewModel: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* viewModelConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  var suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
}

object Loader {
  @scala.inline
  def apply(
    getConfig: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig[ViewModel] | Null, Unit]) => Unit = null,
    loadComponent: (/* componentName */ String, /* config */ ComponentConfig[ViewModel], /* callback */ js.Function1[/* result */ Definition | Null, Unit]) => Unit = null,
    loadTemplate: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node] | Null, Unit]) => Unit = null,
    loadViewModel: (/* componentName */ String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, Unit]) => Unit = null,
    suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
  ): Loader = {
    val __obj = js.Dynamic.literal()
    if (getConfig != null) __obj.updateDynamic("getConfig")(js.Any.fromFunction2(getConfig))
    if (loadComponent != null) __obj.updateDynamic("loadComponent")(js.Any.fromFunction3(loadComponent))
    if (loadTemplate != null) __obj.updateDynamic("loadTemplate")(js.Any.fromFunction3(loadTemplate))
    if (loadViewModel != null) __obj.updateDynamic("loadViewModel")(js.Any.fromFunction3(loadViewModel))
    if (!js.isUndefined(suppressLoaderExceptions)) __obj.updateDynamic("suppressLoaderExceptions")(suppressLoaderExceptions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
}

