package typings.graphql

import typings.graphql.astMod.Location
import typings.graphql.locationMod.SourceLocation
import typings.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/printLocation", JSImport.Namespace)
@js.native
object printLocationMod extends js.Object {
  def printLocation(location: Location): String = js.native
  def printSourceLocation(source: Source, sourceLocation: SourceLocation): String = js.native
}

