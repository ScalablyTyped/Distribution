package typings.jsonStableStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Comparator = js.Function2[
    /* a */ typings.jsonStableStringify.mod.Element, 
    /* b */ typings.jsonStableStringify.mod.Element, 
    scala.Double
  ]
  
  type Replacer = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
}
