package typings.ionic.anon

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicStrings.multiapp
import typings.ionic.libProjectMod.ProjectDetailsError
import typings.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ionic.ionic/lib/project.ProjectDetailsMultiAppResult & { readonly configPath :string} */
trait ProjectDetailsMultiAppRes
  extends StObject
     with ProjectDetailsResult {
  
  val configPath: String
  
  val context: multiapp
  
  val errors: js.Array[ProjectDetailsError]
  
  val id: js.UndefOr[String] = js.undefined
  
  val `type`: js.UndefOr[ProjectType] = js.undefined
}
object ProjectDetailsMultiAppRes {
  
  inline def apply(configPath: String, errors: js.Array[ProjectDetailsError]): ProjectDetailsMultiAppRes = {
    val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any], context = "multiapp", errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsMultiAppRes]
  }
  
  extension [Self <: ProjectDetailsMultiAppRes](x: Self) {
    
    inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    
    inline def setContext(value: multiapp): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[ProjectDetailsError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ProjectDetailsError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
