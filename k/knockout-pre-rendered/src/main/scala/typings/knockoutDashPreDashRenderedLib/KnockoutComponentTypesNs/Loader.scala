package typings
package knockoutDashPreDashRenderedLib.KnockoutComponentTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ java.lang.String, 
      /* callback */ js.Function1[/* result */ ComponentConfig, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ java.lang.String, 
      /* config */ ComponentConfig, 
      /* callback */ js.Function1[/* result */ Definition, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ java.lang.String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[stdLib.Node], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
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

