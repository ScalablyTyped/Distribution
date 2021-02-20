package typings.ionic.definitionsMod

import typings.ionic.anon.RecordHookNamestringArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProjectConfig extends ProjectFile {
  
  val hooks: js.UndefOr[RecordHookNamestringArray] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  val integrations: ProjectIntegrations = js.native
  
  var name: String = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ProjectType] = js.native
}
object IProjectConfig {
  
  @scala.inline
  def apply(integrations: ProjectIntegrations, name: String): IProjectConfig = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectConfig]
  }
  
  @scala.inline
  implicit class IProjectConfigMutableBuilder[Self <: IProjectConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
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
