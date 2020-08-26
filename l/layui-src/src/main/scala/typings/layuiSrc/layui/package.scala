package typings.layuiSrc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object layui {
  type LayerCallbackCancel = scala.Null | (js.Function2[
    /* index */ scala.Double, 
    /* layero */ typings.jquery.JQuery[typings.std.HTMLElement], 
    scala.Boolean | scala.Unit
  ])
  type LayerCallbackEnd = scala.Null | js.Function0[scala.Unit]
  type LayerCallbackFull = scala.Null | (js.Function1[/* layero */ typings.jquery.JQuery[typings.std.HTMLElement], scala.Unit])
  type LayerCallbackMin = scala.Null | (js.Function1[/* layero */ typings.jquery.JQuery[typings.std.HTMLElement], scala.Unit])
  type LayerCallbackPrompt = scala.Null | (js.Function3[
    /* value */ java.lang.String, 
    /* index */ scala.Double, 
    /* elem */ typings.jquery.JQuery[typings.std.HTMLElement], 
    scala.Unit
  ])
  type LayerCallbackRestore = scala.Null | (js.Function1[/* layero */ typings.jquery.JQuery[typings.std.HTMLElement], scala.Unit])
  type LayerCallbackSuccess = scala.Null | (js.Function2[
    /* layero */ typings.jquery.JQuery[typings.std.HTMLElement], 
    /* index */ scala.Double, 
    scala.Unit
  ])
  type LayerCallbackYes = scala.Null | (js.Function2[
    /* index */ scala.Double, 
    /* layero */ typings.jquery.JQuery[typings.std.HTMLElement], 
    scala.Boolean | scala.Unit
  ])
  type Laytpl = js.Function1[/* tpl */ java.lang.String, typings.layuiSrc.layui.TplObject]
}
