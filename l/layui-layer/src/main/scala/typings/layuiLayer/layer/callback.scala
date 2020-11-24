package typings.layuiLayer.layer

import typings.jquery.JQuery
import typings.layuiLayer.layuiLayerBooleans.`false`
import typings.std.HTMLElement
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("layer.callback")
@js.native
object callback extends js.Object {
  
  type Cancel = NonNullable[
    js.UndefOr[
      js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
    ]
  ]
  
  type End = NonNullable[js.UndefOr[js.Function0[Unit]]]
  
  type Prompt = js.Function3[/* value */ String, /* index */ Index, /* elem */ JQuery[HTMLElement], Unit]
  
  type Yes = NonNullable[
    js.UndefOr[js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], Unit]]
  ]
}
