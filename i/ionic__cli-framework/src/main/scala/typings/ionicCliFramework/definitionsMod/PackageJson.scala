package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageJson extends js.Object {
  
  var bin: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var dependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var devDependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var main: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var scripts: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var version: String = js.native
}
object PackageJson {
  
  @scala.inline
  def apply(name: String, version: String): PackageJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson]
  }
  
  @scala.inline
  implicit class PackageJsonOps[Self <: PackageJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBin(value: StringDictionary[js.UndefOr[String]]): Self = this.set("bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBin: Self = this.set("bin", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[js.UndefOr[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDevDependencies(value: StringDictionary[js.UndefOr[String]]): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setScripts(value: StringDictionary[js.UndefOr[String]]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
  }
}
