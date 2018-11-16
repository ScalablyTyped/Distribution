package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TransportNs {
  type SuccessCallback = js.Function4[
    /* status */ scala.Double, 
    /* statusText */ jqueryLib.JQueryNs.AjaxNs.TextStatus, 
    /* responses */ js.UndefOr[jqueryLib.JQueryNs.PlainObject[js.Any]], 
    /* headers */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
