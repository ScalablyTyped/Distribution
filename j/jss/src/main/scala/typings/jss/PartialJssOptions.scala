package typings.jss

import typings.jss.mod.CreateGenerateIdOptions
import typings.jss.mod.CreateGenerateId_
import typings.jss.mod.GenerateId
import typings.jss.mod.InsertionPoint
import typings.jss.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jss.jss.JssOptions> */
trait PartialJssOptions extends js.Object {
  var Renderer: js.UndefOr[AnonInstantiable] = js.undefined
  var createGenerateId: js.UndefOr[CreateGenerateId_] = js.undefined
  var id: js.UndefOr[CreateGenerateIdOptions] = js.undefined
  var insertionPoint: js.UndefOr[InsertionPoint] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
}

object PartialJssOptions {
  @scala.inline
  def apply(
    Renderer: AnonInstantiable = null,
    createGenerateId: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId = null,
    id: CreateGenerateIdOptions = null,
    insertionPoint: InsertionPoint = null,
    plugins: js.Array[Plugin] = null
  ): PartialJssOptions = {
    val __obj = js.Dynamic.literal()
    if (Renderer != null) __obj.updateDynamic("Renderer")(Renderer.asInstanceOf[js.Any])
    if (createGenerateId != null) __obj.updateDynamic("createGenerateId")(js.Any.fromFunction1(createGenerateId))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertionPoint != null) __obj.updateDynamic("insertionPoint")(insertionPoint.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialJssOptions]
  }
}

