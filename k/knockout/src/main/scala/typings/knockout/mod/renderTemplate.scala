package typings.knockout.mod

import typings.knockout.knockoutStrings.ignoreTargetNode
import typings.knockout.knockoutStrings.replaceChildren
import typings.knockout.knockoutStrings.replaceNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "renderTemplate")
@js.native
object renderTemplate extends js.Object {
  def apply(template: String): String = js.native
  def apply(template: js.Function0[String | Node]): String = js.native
  def apply(template: Node): String = js.native
  def apply[T](
    template: String | Node | (js.Function0[String | Node]),
    dataOrBindingContext: js.UndefOr[T | BindingContext[T] | Null],
    options: js.UndefOr[TemplateOptions[T] | Null],
    targetNodeOrNodeArray: Node | js.Array[Node],
    renderMode: js.UndefOr[replaceChildren | replaceNode | ignoreTargetNode]
  ): Computed_[Unit] = js.native
  def apply[T](template: String, dataOrBindingContext: T): String = js.native
  def apply[T](template: String, dataOrBindingContext: T, options: TemplateOptions[T]): String = js.native
  def apply[T](template: String, dataOrBindingContext: js.UndefOr[scala.Nothing], options: TemplateOptions[T]): String = js.native
  def apply[T](template: String, dataOrBindingContext: Null, options: TemplateOptions[T]): String = js.native
  def apply[T](template: String, dataOrBindingContext: BindingContext[T]): String = js.native
  def apply[T](template: String, dataOrBindingContext: BindingContext[T], options: TemplateOptions[T]): String = js.native
  def apply[T](template: js.Function0[String | Node], dataOrBindingContext: T): String = js.native
  def apply[T](template: js.Function0[String | Node], dataOrBindingContext: T, options: TemplateOptions[T]): String = js.native
  def apply[T](
    template: js.Function0[String | Node],
    dataOrBindingContext: js.UndefOr[scala.Nothing],
    options: TemplateOptions[T]
  ): String = js.native
  def apply[T](template: js.Function0[String | Node], dataOrBindingContext: Null, options: TemplateOptions[T]): String = js.native
  def apply[T](template: js.Function0[String | Node], dataOrBindingContext: BindingContext[T]): String = js.native
  def apply[T](
    template: js.Function0[String | Node],
    dataOrBindingContext: BindingContext[T],
    options: TemplateOptions[T]
  ): String = js.native
  def apply[T](template: Node, dataOrBindingContext: T): String = js.native
  def apply[T](template: Node, dataOrBindingContext: T, options: TemplateOptions[T]): String = js.native
  def apply[T](template: Node, dataOrBindingContext: js.UndefOr[scala.Nothing], options: TemplateOptions[T]): String = js.native
  def apply[T](template: Node, dataOrBindingContext: Null, options: TemplateOptions[T]): String = js.native
  def apply[T](template: Node, dataOrBindingContext: BindingContext[T]): String = js.native
  def apply[T](template: Node, dataOrBindingContext: BindingContext[T], options: TemplateOptions[T]): String = js.native
}

