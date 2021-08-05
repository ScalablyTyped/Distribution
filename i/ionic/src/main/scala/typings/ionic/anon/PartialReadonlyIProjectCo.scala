package typings.ionic.anon

import typings.ionic.definitionsMod.ProjectIntegrations
import typings.ionic.definitionsMod.ProjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.IProjectConfig>> */
trait PartialReadonlyIProjectCo extends StObject {
  
  var hooks: js.UndefOr[RecordHookNamestringArray] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var integrations: js.UndefOr[ProjectIntegrations] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[ProjectType] = js.undefined
}
object PartialReadonlyIProjectCo {
  
  inline def apply(): PartialReadonlyIProjectCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyIProjectCo]
  }
  
  extension [Self <: PartialReadonlyIProjectCo](x: Self) {
    
    inline def setHooks(value: RecordHookNamestringArray): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIntegrations(value: ProjectIntegrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
