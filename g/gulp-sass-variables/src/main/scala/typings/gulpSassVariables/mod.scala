package typings.gulpSassVariables

import org.scalablytyped.runtime.StringDictionary
import typings.gulpSassVariables.mod.GulpSassVariables.VariableDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(variables: VariableDefinitions): Any = ^.asInstanceOf[js.Dynamic].apply(variables.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-sass-variables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object GulpSassVariables {
    
    type VariableDefinitions = StringDictionary[Any]
  }
}
