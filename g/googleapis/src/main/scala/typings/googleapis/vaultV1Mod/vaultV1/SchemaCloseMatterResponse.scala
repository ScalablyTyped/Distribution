package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a CloseMatterRequest.
  */
@js.native
trait SchemaCloseMatterResponse extends StObject {
  
  /**
    * The updated matter, with state CLOSED.
    */
  var matter: js.UndefOr[SchemaMatter] = js.native
}
object SchemaCloseMatterResponse {
  
  @scala.inline
  def apply(): SchemaCloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloseMatterResponse]
  }
  
  @scala.inline
  implicit class SchemaCloseMatterResponseMutableBuilder[Self <: SchemaCloseMatterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatter(value: SchemaMatter): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
