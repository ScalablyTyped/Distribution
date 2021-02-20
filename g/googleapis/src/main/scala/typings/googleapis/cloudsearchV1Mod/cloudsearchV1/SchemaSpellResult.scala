package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSpellResult extends StObject {
  
  /**
    * The suggested spelling of the query.
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}
object SchemaSpellResult {
  
  @scala.inline
  def apply(): SchemaSpellResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellResult]
  }
  
  @scala.inline
  implicit class SchemaSpellResultMutableBuilder[Self <: SchemaSpellResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestedQuery(value: String): Self = StObject.set(x, "suggestedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedQueryUndefined: Self = StObject.set(x, "suggestedQuery", js.undefined)
  }
}
