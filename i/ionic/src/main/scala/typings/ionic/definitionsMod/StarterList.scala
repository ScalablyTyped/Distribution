package typings.ionic.definitionsMod

import typings.ionic.anon.IdName
import typings.ionic.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarterList extends StObject {
  
  var integrations: js.Array[IdName] = js.native
  
  var starters: js.Array[Type] = js.native
}
object StarterList {
  
  @scala.inline
  def apply(integrations: js.Array[IdName], starters: js.Array[Type]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterList]
  }
  
  @scala.inline
  implicit class StarterListMutableBuilder[Self <: StarterList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntegrations(value: js.Array[IdName]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationsVarargs(value: IdName*): Self = StObject.set(x, "integrations", js.Array(value :_*))
    
    @scala.inline
    def setStarters(value: js.Array[Type]): Self = StObject.set(x, "starters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartersVarargs(value: Type*): Self = StObject.set(x, "starters", js.Array(value :_*))
  }
}
