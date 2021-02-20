package typings.latinize

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.latinize.mod.LatinizeModule.Latinize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("latinize", JSImport.Namespace)
  @js.native
  val ^ : Latinize = js.native
  
  object LatinizeModule {
    
    @js.native
    trait Latinize extends StObject {
      
      def apply(str: String): String = js.native
      
      var characters: StringDictionary[String] = js.native
    }
  }
  
  type _To = Latinize
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Latinize = ^
}
