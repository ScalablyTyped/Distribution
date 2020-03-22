package typings.lunr.mod.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single clause in a {@link lunr.Query} contains a term and details on how to
  * match that term against a {@link lunr.Index}.
  */
trait Clause extends js.Object {
  /** Any boost that should be applied when matching this clause. */
  var boost: Double
  /** Whether the term should have fuzzy matching applied, and how fuzzy the match should be. */
  var editDistance: Double
  /** The fields in an index this clause should be matched against. */
  var fields: js.Array[String]
  var term: String
  /** Whether the term should be passed through the search pipeline. */
  var usePipeline: Boolean
  /** Whether the term should have wildcards appended or prepended. */
  var wildcard: Double
}

object Clause {
  @scala.inline
  def apply(
    boost: Double,
    editDistance: Double,
    fields: js.Array[String],
    term: String,
    usePipeline: Boolean,
    wildcard: Double
  ): Clause = {
    val __obj = js.Dynamic.literal(boost = boost.asInstanceOf[js.Any], editDistance = editDistance.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], usePipeline = usePipeline.asInstanceOf[js.Any], wildcard = wildcard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Clause]
  }
}

