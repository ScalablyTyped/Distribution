package typings
package jqueryLib.JQueryNs.AjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// Writable properties on XMLHttpRequest
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'> ]:? std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'>[P]} */ trait XHRFields extends js.Object {
  var msCaching: js.UndefOr[java.lang.String] = js.undefined
}

object XHRFields {
  @scala.inline
  def apply(msCaching: java.lang.String = null): XHRFields = {
    val __obj = js.Dynamic.literal()
    if (msCaching != null) __obj.updateDynamic("msCaching")(msCaching)
    __obj.asInstanceOf[XHRFields]
  }
}

