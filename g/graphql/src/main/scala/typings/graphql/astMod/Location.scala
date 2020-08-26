package typings.graphql.astMod

import typings.graphql.anon.End
import typings.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/ast", "Location")
@js.native
class Location protected () extends js.Object {
  def this(startToken: Token, endToken: Token, source: Source) = this()
  /**
    * The character offset at which this Node ends.
    */
  val end: Double = js.native
  /**
    * The Token at which this Node ends.
    */
  val endToken: Token = js.native
  /**
    * The Source document the AST represents.
    */
  val source: Source = js.native
  /**
    * The character offset at which this Node begins.
    */
  val start: Double = js.native
  /**
    * The Token at which this Node begins.
    */
  val startToken: Token = js.native
  def toJSON(): End = js.native
}

