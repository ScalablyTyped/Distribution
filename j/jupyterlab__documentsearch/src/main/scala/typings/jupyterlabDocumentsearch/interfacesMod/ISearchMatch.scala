package typings.jupyterlabDocumentsearch.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchMatch extends js.Object {
  /**
    * Column location of match
    */
  var column: Double
  /**
    * Fragment containing match
    */
  val fragment: String
  /**
    * Index among the other matches
    */
  var index: Double
  /**
    * Line number of match
    */
  var line: Double
  /**
    * Text of the exact match itself
    */
  val text: String
}

object ISearchMatch {
  @scala.inline
  def apply(column: Double, fragment: String, index: Double, line: Double, text: String): ISearchMatch = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMatch]
  }
}

