package typings
package hellojsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hellojsMod {
  type HelloJSResponseCallback = js.Function2[/* r */ js.Any, /* headers */ js.Any, scala.Unit]
  type HelloJSUrlMappingFunction = js.Function2[
    /* p */ js.Any, 
    /* callback */ js.Function1[/* url */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
}
