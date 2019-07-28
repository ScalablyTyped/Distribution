package typings.graphql.graphqlMod

import typings.graphql.languageSourceMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "Source")
@js.native
class Source protected ()
  extends typings.graphql.languageMod.Source {
  def this(body: String) = this()
  def this(body: String, name: String) = this()
  def this(body: String, name: String, locationOffset: Location) = this()
}

