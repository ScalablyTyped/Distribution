package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lunr", "generateStopWordFilter")
@js.native
object generateStopWordFilter extends js.Object {
  /**
    * lunr.generateStopWordFilter builds a stopWordFilter function from the provided
    * list of stop words.
    *
    * The built in lunr.stopWordFilter is built using this generator and can be used
    * to generate custom stopWordFilters for applications or non English languages.
    *
    * @param stopWords - The list of stop words
    * @see lunr.Pipeline
    * @see lunr.stopWordFilter
    */
  def apply(stopWords: js.Array[String]): PipelineFunction = js.native
}

