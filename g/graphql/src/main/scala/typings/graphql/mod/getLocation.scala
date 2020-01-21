package typings.graphql.mod

import typings.graphql.locationMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getLocation")
@js.native
object getLocation extends js.Object {
  def apply(source: typings.graphql.sourceMod.Source, position: Double): SourceLocation = js.native
}

