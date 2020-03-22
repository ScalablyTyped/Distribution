package typings.lunr.mod.Index

import org.scalablytyped.runtime.StringDictionary
import typings.lunr.mod.Pipeline
import typings.lunr.mod.TokenSet
import typings.lunr.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  /**
    * Document vectors keyed by document reference.
    */
  var documentVectors: StringDictionary[Vector]
  /**
    * The names of indexed document fields.
    */
  var fields: js.Array[String]
  /**
    * An index of term/field to document reference.
    */
  var invertedIndex: js.Object
  /**
    * The pipeline to use for search terms.
    */
  var pipeline: Pipeline
  /**
    * An set of all corpus tokens.
    */
  var tokenSet: TokenSet
}

object Attributes {
  @scala.inline
  def apply(
    documentVectors: StringDictionary[Vector],
    fields: js.Array[String],
    invertedIndex: js.Object,
    pipeline: Pipeline,
    tokenSet: TokenSet
  ): Attributes = {
    val __obj = js.Dynamic.literal(documentVectors = documentVectors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], invertedIndex = invertedIndex.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], tokenSet = tokenSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Attributes]
  }
}

