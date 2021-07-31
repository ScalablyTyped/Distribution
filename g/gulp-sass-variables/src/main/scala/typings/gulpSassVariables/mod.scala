package typings.gulpSassVariables

import org.scalablytyped.runtime.StringDictionary
import typings.gulpSassVariables.mod.GulpSassVariables.VariableDefinitions
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(variables: VariableDefinitions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(variables.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-sass-variables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object GulpSassVariables {
    
    type VariableDefinitions = StringDictionary[js.Any]
  }
}
