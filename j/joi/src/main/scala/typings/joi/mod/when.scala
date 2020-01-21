package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("joi", "when")
@js.native
object when extends js.Object {
  def apply(ref: String, options: WhenOptions): AlternativesSchema = js.native
  def apply(ref: Reference, options: WhenOptions): AlternativesSchema = js.native
  def apply(ref: Schema, options: WhenSchemaOptions): AlternativesSchema = js.native
}

