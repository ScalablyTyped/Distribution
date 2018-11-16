package typings
package i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object I18NextXhrBackendNs {
  type AjaxRequestCallback = js.Function2[/* response */ java.lang.String, /* x */ stdLib.XMLHttpRequest, scala.Unit]
  type LoadCallback = js.Function2[
    /* error */ js.Any, 
    /* result */ java.lang.String | i18nextDashXhrDashBackendLib.i18nextDashXhrDashBackendLibNumbers.`false`, 
    scala.Unit
  ]
  type LoadPathOption = java.lang.String | (js.Function2[
    /* lngs */ js.Array[java.lang.String], 
    /* namespaces */ js.Array[java.lang.String], 
    java.lang.String
  ])
}
