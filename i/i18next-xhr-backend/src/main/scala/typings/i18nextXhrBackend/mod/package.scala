package typings.i18nextXhrBackend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AjaxRequestCallback = js.Function2[/* response */ java.lang.String, /* x */ typings.std.XMLHttpRequest, scala.Unit]
  
  type LoadPathOption = java.lang.String | (js.Function2[
    /* lngs */ js.Array[java.lang.String], 
    /* namespaces */ js.Array[java.lang.String], 
    java.lang.String
  ])
}
