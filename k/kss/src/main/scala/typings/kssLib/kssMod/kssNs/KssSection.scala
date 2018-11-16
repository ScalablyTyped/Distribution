package typings
package kssLib.kssMod.kssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KssSection extends js.Object {
  def custom(name: java.lang.String): js.Any = js.native
  def custom(name: java.lang.String, value: js.Any): KssSection = js.native
  def customPropertyNames(): js.Array[java.lang.String] = js.native
  def deprecated(): scala.Boolean = js.native
  def deprecated(deprecated: scala.Boolean): KssSection = js.native
  def depth(): scala.Double = js.native
  def depth(depth: scala.Double): KssSection = js.native
  def description(): java.lang.String = js.native
  def description(description: java.lang.String): KssSection = js.native
  def experimental(): scala.Boolean = js.native
  def experimental(experimental: scala.Boolean): KssSection = js.native
  def header(): java.lang.String = js.native
  def header(header: java.lang.String): KssSection = js.native
  def markup(): kssLib.kssLibNumbers.`false` | java.lang.String = js.native
  def markup(markup: java.lang.String): KssSection = js.native
  def modifiers(): js.Array[KssModifier] = js.native
  def modifiers(modifiers: js.Array[KssModifier]): KssSection = js.native
  def modifiers(modifiers: KssModifier): KssSection = js.native
  def modifiers(query: java.lang.String): kssLib.kssLibNumbers.`false` | KssModifier = js.native
  def modifiers(query: scala.Double): kssLib.kssLibNumbers.`false` | KssModifier = js.native
  def parameters(): js.Array[KssParameter] = js.native
  def parameters(parameters: js.Array[KssParameter]): KssSection = js.native
  def parameters(parameters: KssParameter): KssSection = js.native
  def parameters(query: java.lang.String): kssLib.kssLibNumbers.`false` | KssParameter = js.native
  def parameters(query: scala.Double): kssLib.kssLibNumbers.`false` | KssParameter = js.native
  def reference(): java.lang.String = js.native
  def reference(reference: java.lang.String): KssSection = js.native
  def referenceNumber(): java.lang.String = js.native
  def referenceNumber(referenceNumber: java.lang.String): KssSection = js.native
  def referenceURI(): java.lang.String = js.native
  def referenceURI(referenceURI: java.lang.String): KssSection = js.native
  def source(): Source = js.native
  def source(source: Source): KssSection = js.native
  def sourceFileName(): java.lang.String = js.native
  def sourceLine(): java.lang.String = js.native
  def styleGuide(): KssStyleguide = js.native
  def styleGuide(styleguide: KssStyleguide): KssSection = js.native
  def toJSON(): js.Any = js.native
  def weight(): scala.Double = js.native
  def weight(weight: scala.Double): KssSection = js.native
}

