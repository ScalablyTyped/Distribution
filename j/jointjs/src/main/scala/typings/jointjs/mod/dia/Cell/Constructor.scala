package typings.jointjs.mod.dia.Cell

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jointjs.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor[T /* <: Model[_, ModelSetOptions] */]
  extends Instantiable0[T]
     with Instantiable1[/* opt */ Id, T] {
  def define(`type`: String): Constructor[T] = js.native
  def define(
    `type`: String,
    defaults: js.UndefOr[scala.Nothing],
    protoProps: js.UndefOr[scala.Nothing],
    staticProps: js.Any
  ): Constructor[T] = js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any): Constructor[T] = js.native
  def define(`type`: String, defaults: js.UndefOr[scala.Nothing], protoProps: js.Any, staticProps: js.Any): Constructor[T] = js.native
  def define(`type`: String, defaults: js.Any): Constructor[T] = js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.UndefOr[scala.Nothing], staticProps: js.Any): Constructor[T] = js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[T] = js.native
  def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[T] = js.native
}

