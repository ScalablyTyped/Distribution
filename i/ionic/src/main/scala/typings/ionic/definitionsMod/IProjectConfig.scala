package typings.ionic.definitionsMod

import typings.ionic.anon.RecordHookNamestringArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProjectConfig
  extends StObject
     with ProjectFile {
  
  val hooks: js.UndefOr[RecordHookNamestringArray] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  val integrations: ProjectIntegrations
  
  var name: String
  
  var root: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[ProjectType] = js.undefined
}
object IProjectConfig {
  
  inline def apply(integrations: ProjectIntegrations, name: String): IProjectConfig = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProjectConfig] (val x: Self) extends AnyVal {
    
    inline def setHooks(value: RecordHookNamestringArray): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIntegrations(value: ProjectIntegrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
