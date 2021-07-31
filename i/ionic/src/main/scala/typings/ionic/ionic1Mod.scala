package typings.ionic

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.ionicStrings.ionic1
import typings.ionic.libProjectMod.Project
import typings.ionic.libProjectMod.ProjectDeps
import typings.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionic1Mod {
  
  @JSImport("ionic/lib/project/ionic1", "ERROR_INVALID_BOWER_JSON")
  @js.native
  val ERROR_INVALID_BOWER_JSON: /* "INVALID_BOWER_JSON" */ String = js.native
  
  @JSImport("ionic/lib/project/ionic1", "Ionic1Project")
  @js.native
  class Ionic1Project protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    var bowerJsonFile: js.UndefOr[BowerJson] = js.native
    
    def getFrameworkVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def loadBowerJson(): js.Promise[BowerJson] = js.native
    
    @JSName("type")
    val type_Ionic1Project: ionic1 = js.native
  }
  
  trait BowerJson extends StObject {
    
    var dependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    var devDependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    var name: String
  }
  object BowerJson {
    
    @scala.inline
    def apply(name: String): BowerJson = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BowerJson]
    }
    
    @scala.inline
    implicit class BowerJsonMutableBuilder[Self <: BowerJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
