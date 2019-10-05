package typings.lovefield.lovefieldMod.schema

import typings.lovefield.lovefieldMod.PredicateProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends PredicateProvider {
  def as(name: String): Column = js.native
  def getName(): String = js.native
  def getNormalizedName(): String = js.native
}

