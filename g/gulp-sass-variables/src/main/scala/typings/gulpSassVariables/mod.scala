package typings.gulpSassVariables

import org.scalablytyped.runtime.StringDictionary
import typings.gulpSassVariables.mod.GulpSassVariables.VariableDefinitions
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-sass-variables", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-sass-variables", JSImport.Namespace)
  @js.native
  def apply(variables: VariableDefinitions): ReadWriteStream = js.native
  
  object GulpSassVariables {
    
    type VariableDefinitions = StringDictionary[js.Any]
  }
}
