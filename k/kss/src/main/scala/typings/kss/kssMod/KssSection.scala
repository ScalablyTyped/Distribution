package typings.kss.kssMod

import typings.kss.kssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kss", "KssSection")
@js.native
class KssSection () extends js.Object {
  def this(data: js.Any) = this()
  def custom(name: String): js.Any = js.native
  def custom(name: String, value: js.Any): KssSection = js.native
  def customPropertyNames(): js.Array[String] = js.native
  def deprecated(): Boolean = js.native
  def deprecated(deprecated: Boolean): KssSection = js.native
  def depth(): Double = js.native
  def depth(depth: Double): KssSection = js.native
  def description(): String = js.native
  def description(description: String): KssSection = js.native
  def experimental(): Boolean = js.native
  def experimental(experimental: Boolean): KssSection = js.native
  def header(): String = js.native
  def header(header: String): KssSection = js.native
  def markup(): `false` | String = js.native
  def markup(markup: String): KssSection = js.native
  def modifiers(): js.Array[KssModifier] = js.native
  def modifiers(modifiers: js.Array[KssModifier]): KssSection = js.native
  def modifiers(modifiers: KssModifier): KssSection = js.native
  def modifiers(query: String): `false` | KssModifier = js.native
  def modifiers(query: Double): `false` | KssModifier = js.native
  def parameters(): js.Array[KssParameter] = js.native
  def parameters(parameters: js.Array[KssParameter]): KssSection = js.native
  def parameters(parameters: KssParameter): KssSection = js.native
  def parameters(query: String): `false` | KssParameter = js.native
  def parameters(query: Double): `false` | KssParameter = js.native
  def reference(): String = js.native
  def reference(reference: String): KssSection = js.native
  def referenceNumber(): String = js.native
  def referenceNumber(referenceNumber: String): KssSection = js.native
  def referenceURI(): String = js.native
  def referenceURI(referenceURI: String): KssSection = js.native
  def source(): Source = js.native
  def source(source: Source): KssSection = js.native
  def sourceFileName(): String = js.native
  def sourceLine(): String = js.native
  def styleGuide(): KssStyleguide = js.native
  def styleGuide(styleguide: KssStyleguide): KssSection = js.native
  def toJSON(): js.Any = js.native
  def weight(): Double = js.native
  def weight(weight: Double): KssSection = js.native
}

