package typings
package lessDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Css extends js.Object {
  /**
    * Function that modifies the compiled css output before being stored.
    */
  var css: js.UndefOr[
    js.Function2[
      /* css */ java.lang.String, 
      /* req */ expressLib.expressMod.eNs.Request, 
      java.lang.String
    ]
  ] = js.undefined
}

object Anon_Css {
  @scala.inline
  def apply(
    css: js.Function2[
      /* css */ java.lang.String, 
      /* req */ expressLib.expressMod.eNs.Request, 
      java.lang.String
    ] = null
  ): Anon_Css = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css)
    __obj.asInstanceOf[Anon_Css]
  }
}

