package typings.graphql.languageAstMod

import typings.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * The character offset at which this Node ends.
    */
  val end: Double
  /**
    * The Token at which this Node ends.
    */
  val endToken: Token
  /**
    * The Source document the AST represents.
    */
  val source: Source
  /**
    * The character offset at which this Node begins.
    */
  val start: Double
  /**
    * The Token at which this Node begins.
    */
  val startToken: Token
}

object Location {
  @scala.inline
  def apply(end: Double, endToken: Token, source: Source, start: Double, startToken: Token): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], endToken = endToken.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startToken = startToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

