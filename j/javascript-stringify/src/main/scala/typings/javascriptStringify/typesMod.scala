package typings.javascriptStringify

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("javascript-stringify/dist/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  type Next = js.Function2[/* value */ js.Any, /* key */ js.UndefOr[PropertyKey], js.UndefOr[String]]
  
  type ToString = js.Function4[
    /* value */ js.Any, 
    /* space */ String, 
    /* next */ Next, 
    /* key */ js.UndefOr[PropertyKey], 
    js.UndefOr[String]
  ]
}
