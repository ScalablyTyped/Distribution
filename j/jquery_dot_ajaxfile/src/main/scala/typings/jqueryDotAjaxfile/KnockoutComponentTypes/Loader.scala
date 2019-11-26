package typings.jqueryDotAjaxfile.KnockoutComponentTypes

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ String, 
      /* callback */ js.Function1[/* result */ ComponentConfig, Unit], 
      Unit
    ]
  ] = js.undefined
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* config */ ComponentConfig, 
      /* callback */ js.Function1[/* result */ Definition, Unit], 
      Unit
    ]
  ] = js.undefined
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[Node], Unit], 
      Unit
    ]
  ] = js.undefined
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
    getConfig: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig, Unit]) => Unit = null,
    loadComponent: (/* componentName */ String, /* config */ ComponentConfig, /* callback */ js.Function1[/* result */ Definition, Unit]) => Unit = null,
    loadTemplate: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node], Unit]) => Unit = null,
    loadViewModel: (/* componentName */ String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, Unit]) => Unit = null,
    suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
  ): Loader = {
    val __obj = js.Dynamic.literal()
    if (getConfig != null) __obj.updateDynamic("getConfig")(js.Any.fromFunction2(getConfig))
    if (loadComponent != null) __obj.updateDynamic("loadComponent")(js.Any.fromFunction3(loadComponent))
    if (loadTemplate != null) __obj.updateDynamic("loadTemplate")(js.Any.fromFunction3(loadTemplate))
    if (loadViewModel != null) __obj.updateDynamic("loadViewModel")(js.Any.fromFunction3(loadViewModel))
    if (!js.isUndefined(suppressLoaderExceptions)) __obj.updateDynamic("suppressLoaderExceptions")(suppressLoaderExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
}

