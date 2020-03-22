package typings.layuiLayer.layer

import typings.jquery.JQuery_
import typings.layuiLayer.layuiLayerBooleans.`false`
import typings.std.HTMLElement
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("layer.callback")
@js.native
object callback extends js.Object {
  type Cancel = NonNullable[
    js.UndefOr[
      js.Function2[/* index */ Index, /* layero */ JQuery_[HTMLElement], `false` | Unit]
    ]
  ]
  type End = NonNullable[js.UndefOr[js.Function0[Unit]]]
  type Prompt = js.Function3[/* value */ String, /* index */ Index, /* elem */ JQuery_[HTMLElement], Unit]
  type Yes = NonNullable[
    js.UndefOr[js.Function2[/* index */ Index, /* layero */ JQuery_[HTMLElement], Unit]]
  ]
}

