package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object htmlMod {
  
  type Handler = js.Function2[/* index */ scala.Double, /* element */ typings.k6.htmlMod.Element, scala.Unit]
  
  type Mapper = js.Function2[/* index */ scala.Double, /* element */ typings.k6.htmlMod.Element, js.Any]
  
  type Tester = js.Function2[/* index */ scala.Double, /* element */ typings.k6.htmlMod.Element, scala.Boolean]
}
