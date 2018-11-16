package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Location extends js.Object {
  /**
       * The character offset at which this Node ends.
       */
  val end: scala.Double
  /**
       * The Token at which this Node ends.
       */
  val endToken: Token
  /**
       * The Source document the AST represents.
       */
  val source: graphqlLib.languageSourceMod.Source
  /**
       * The character offset at which this Node begins.
       */
  val start: scala.Double
  /**
       * The Token at which this Node begins.
       */
  val startToken: Token
}

