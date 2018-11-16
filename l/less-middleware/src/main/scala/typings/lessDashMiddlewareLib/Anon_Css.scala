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

