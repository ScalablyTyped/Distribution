package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Ajax
// #region Ajax
trait AjaxSettings[TContext]
  extends jqueryLib.JQueryNs.AjaxNs.AjaxSettingsBase[TContext] {
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

