package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.lead
import typings.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier extends StObject {
  
  var identifier: VisitorIdentifier = js.native
  
  var `type`: lead = js.native
}
object Identifier {
  
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: lead): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: VisitorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: lead): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
