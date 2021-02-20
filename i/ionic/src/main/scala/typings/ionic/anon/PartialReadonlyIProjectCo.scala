package typings.ionic.anon

import typings.ionic.definitionsMod.ProjectIntegrations
import typings.ionic.definitionsMod.ProjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.IProjectConfig>> */
@js.native
trait PartialReadonlyIProjectCo extends StObject {
  
  var hooks: js.UndefOr[RecordHookNamestringArray] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var integrations: js.UndefOr[ProjectIntegrations] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ProjectType] = js.native
}
object PartialReadonlyIProjectCo {
  
  @scala.inline
  def apply(): PartialReadonlyIProjectCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyIProjectCo]
  }
  
  @scala.inline
  implicit class PartialReadonlyIProjectCoMutableBuilder[Self <: PartialReadonlyIProjectCo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: RecordHookNamestringArray): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIntegrations(value: ProjectIntegrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
