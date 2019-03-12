package typings
package knockoutLib.KnockoutComponentTypesNs

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
      /* componentName */ java.lang.String, 
      /* callback */ js.Function1[/* result */ ComponentConfig | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to take control over how component configurations are interpreted, e.g., if you do not want to use the standard 'viewModel/template' pair format.
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ java.lang.String, 
      /* config */ ComponentConfig, 
      /* callback */ js.Function1[/* result */ Definition | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to use custom logic to supply DOM nodes for a given template configuration (e.g., using an ajax request to fetch a template by URL).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ java.lang.String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[stdLib.Node] | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to use custom logic to supply a viewmodel factory for a given viewmodel configuration (e.g., integrating with a third-party module loader or dependency injection system).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadViewModel: js.UndefOr[
    js.Function3[
      /* componentName */ java.lang.String, 
      /* viewModelConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var suppressLoaderExceptions: js.UndefOr[scala.Boolean] = js.undefined
}

object Loader {
  @scala.inline
  def apply(
    getConfig: (/* componentName */ java.lang.String, /* callback */ js.Function1[/* result */ ComponentConfig | scala.Null, scala.Unit]) => scala.Unit = null,
    loadComponent: (/* componentName */ java.lang.String, /* config */ ComponentConfig, /* callback */ js.Function1[/* result */ Definition | scala.Null, scala.Unit]) => scala.Unit = null,
    loadTemplate: (/* componentName */ java.lang.String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[stdLib.Node] | scala.Null, scala.Unit]) => scala.Unit = null,
    loadViewModel: (/* componentName */ java.lang.String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, scala.Unit]) => scala.Unit = null,
    suppressLoaderExceptions: js.UndefOr[scala.Boolean] = js.undefined
  ): Loader = {
    val __obj = js.Dynamic.literal()
    if (getConfig != null) __obj.updateDynamic("getConfig")(js.Any.fromFunction2(getConfig))
    if (loadComponent != null) __obj.updateDynamic("loadComponent")(js.Any.fromFunction3(loadComponent))
    if (loadTemplate != null) __obj.updateDynamic("loadTemplate")(js.Any.fromFunction3(loadTemplate))
    if (loadViewModel != null) __obj.updateDynamic("loadViewModel")(js.Any.fromFunction3(loadViewModel))
    if (!js.isUndefined(suppressLoaderExceptions)) __obj.updateDynamic("suppressLoaderExceptions")(suppressLoaderExceptions)
    __obj.asInstanceOf[Loader]
  }
}

