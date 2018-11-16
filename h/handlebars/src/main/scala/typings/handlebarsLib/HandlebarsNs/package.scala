package typings
package handlebarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HandlebarsNs {
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
  type Template[T] = TemplateDelegate[T] | java.lang.String
  type TemplateDelegate[T] = js.Function2[/* context */ T, /* options */ js.UndefOr[RuntimeOptions], java.lang.String]
}
