package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of sources that the user can search using the query API.
  */
@js.native
trait SchemaQuerySource extends js.Object {
  
  /**
    * Display name of the data source.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * List of all operators applicable for this source.
    */
  var operators: js.UndefOr[js.Array[SchemaQueryOperator]] = js.native
  
  /**
    * A short name or alias for the source.  This value can be used with the
    * &#39;source&#39; operator.
    */
  var shortName: js.UndefOr[String] = js.native
  
  /**
    * Name of the source
    */
  var source: js.UndefOr[SchemaSource] = js.native
}
object SchemaQuerySource {
  
  @scala.inline
  def apply(): SchemaQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuerySource]
  }
  
  @scala.inline
  implicit class SchemaQuerySourceOps[Self <: SchemaQuerySource] (val x: Self) extends AnyVal {
    
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
    def setOperatorsVarargs(value: SchemaQueryOperator*): Self = this.set("operators", js.Array(value :_*))
    
    @scala.inline
    def setOperators(value: js.Array[SchemaQueryOperator]): Self = this.set("operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
