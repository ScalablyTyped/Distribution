package typings.graphql.languageMod

import typings.graphql.languageSourceMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language", "Source")
@js.native
class Source protected ()
  extends typings.graphql.languageSourceMod.Source {
  def this(body: String) = this()
  def this(body: String, name: String) = this()
  def this(body: String, name: String, locationOffset: Location) = this()
}

