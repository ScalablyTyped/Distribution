package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySource extends js.Object {
  
  /** Display name of the data source. */
  var displayName: js.UndefOr[String] = js.native
  
  /** List of all operators applicable for this source. */
  var operators: js.UndefOr[js.Array[QueryOperator]] = js.native
  
  /** A short name or alias for the source. This value can be used with the 'source' operator. */
  var shortName: js.UndefOr[String] = js.native
  
  /** Name of the source */
  var source: js.UndefOr[Source] = js.native
}
object QuerySource {
  
  @scala.inline
  def apply(): QuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySource]
  }
  
  @scala.inline
  implicit class QuerySourceOps[Self <: QuerySource] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setOperatorsVarargs(value: QueryOperator*): Self = this.set("operators", js.Array(value :_*))
    
    @scala.inline
    def setOperators(value: js.Array[QueryOperator]): Self = this.set("operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
