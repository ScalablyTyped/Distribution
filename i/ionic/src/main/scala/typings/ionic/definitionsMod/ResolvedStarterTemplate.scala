package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedStarterTemplate
  extends StObject
     with BaseStarterTemplate {
  
  var archive: String
}
object ResolvedStarterTemplate {
  
  inline def apply(archive: String, name: String, projectType: ProjectType): ResolvedStarterTemplate = {
    val __obj = js.Dynamic.literal(archive = archive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedStarterTemplate]
  }
  
  extension [Self <: ResolvedStarterTemplate](x: Self) {
    
    inline def setArchive(value: String): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
  }
}
