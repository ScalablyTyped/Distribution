package typings.lunr.mod.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single clause in a {@link lunr.Query} contains a term and details on how to
  * match that term against a {@link lunr.Index}.
  */
@js.native
trait Clause extends js.Object {
  
  /** Any boost that should be applied when matching this clause. */
  var boost: Double = js.native
  
  /** Whether the term should have fuzzy matching applied, and how fuzzy the match should be. */
  var editDistance: Double = js.native
  
  /** The fields in an index this clause should be matched against. */
  var fields: js.Array[String] = js.native
  
  var term: String = js.native
  
  /** Whether the term should be passed through the search pipeline. */
  var usePipeline: Boolean = js.native
  
  /** Whether the term should have wildcards appended or prepended. */
  var wildcard: Double = js.native
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
  
  @scala.inline
  implicit class ClauseOps[Self <: Clause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoost(value: Double): Self = this.set("boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditDistance(value: Double): Self = this.set("editDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePipeline(value: Boolean): Self = this.set("usePipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcard(value: Double): Self = this.set("wildcard", value.asInstanceOf[js.Any])
  }
}
