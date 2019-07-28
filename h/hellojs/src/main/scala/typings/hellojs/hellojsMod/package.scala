package typings.hellojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hellojsMod {
  type HelloJSResponseCallback = js.Function2[/* r */ js.Any, /* headers */ js.Any, Unit]
  type HelloJSUrlMappingFunction = js.Function2[/* p */ js.Any, /* callback */ js.Function1[/* url */ String, Unit], Unit]
}
