package typings.graphql.languageLocationMod

import typings.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/location", "getLocation")
@js.native
object getLocation extends js.Object {
  def apply(source: Source, position: Double): SourceLocation = js.native
}

