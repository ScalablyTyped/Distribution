package typings.linkifyjs

import typings.linkifyjs.linkifyjsMod.LinkifyOptions
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linkifyjs/element", JSImport.Namespace)
@js.native
object elementMod extends js.Object {
  def default(element: HTMLElement): HTMLElement = js.native
  def default(element: HTMLElement, options: LinkifyOptions): HTMLElement = js.native
  def default(element: HTMLElement, options: LinkifyOptions, doc: HTMLDocument): HTMLElement = js.native
  def linkifyElement(element: HTMLElement): HTMLElement = js.native
  def linkifyElement(element: HTMLElement, options: LinkifyOptions): HTMLElement = js.native
  def linkifyElement(element: HTMLElement, options: LinkifyOptions, doc: HTMLDocument): HTMLElement = js.native
}

