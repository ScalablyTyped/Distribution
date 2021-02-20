package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceUpdateDocOptions extends StObject {
  
  var body: js.UndefOr[String] = js.native
}
object PersistenceUpdateDocOptions {
  
  @scala.inline
  def apply(): PersistenceUpdateDocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceUpdateDocOptions]
  }
  
  @scala.inline
  implicit class PersistenceUpdateDocOptionsMutableBuilder[Self <: PersistenceUpdateDocOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
