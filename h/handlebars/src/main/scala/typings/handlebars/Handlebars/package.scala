package typings.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Handlebars {
  import org.scalablytyped.runtime.StringDictionary

  type HelperDeclareSpec = StringDictionary[HelperDelegate]
  type HelperDelegate = js.Function7[
    /* context */ js.UndefOr[js.Any], 
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    /* arg4 */ js.UndefOr[js.Any], 
    /* arg5 */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[HelperOptions], 
    js.Any
  ]
  type Template[T] = TemplateDelegate[T] | String
  type TemplateDelegate[T] = js.Function2[
    /* context */ T, 
    /* options */ js.UndefOr[typings.handlebars.Handlebars.RuntimeOptions], 
    String
  ]
}
