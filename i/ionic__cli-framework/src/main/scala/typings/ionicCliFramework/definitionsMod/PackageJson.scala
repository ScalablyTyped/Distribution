package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJson extends StObject {
  
  var bin: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var dependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var devDependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var scripts: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var version: String
}
object PackageJson {
  
  @scala.inline
  def apply(name: String, version: String): PackageJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson]
  }
  
  @scala.inline
  implicit class PackageJsonMutableBuilder[Self <: PackageJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDevDependencies(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripts(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
