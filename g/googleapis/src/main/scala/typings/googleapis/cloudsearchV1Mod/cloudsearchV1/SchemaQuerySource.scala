package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of sources that the user can search using the query API.
  */
@js.native
trait SchemaQuerySource extends StObject {
  
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
  implicit class SchemaQuerySourceMutableBuilder[Self <: SchemaQuerySource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setOperators(value: js.Array[SchemaQueryOperator]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    @scala.inline
    def setOperatorsVarargs(value: SchemaQueryOperator*): Self = StObject.set(x, "operators", js.Array(value :_*))
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
