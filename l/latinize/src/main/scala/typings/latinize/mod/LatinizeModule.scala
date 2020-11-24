package typings.latinize.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("latinize", "LatinizeModule")
@js.native
object LatinizeModule extends js.Object {
  
  @js.native
  trait Latinize extends js.Object {
    
    def apply(str: String): String = js.native
    
    var characters: StringDictionary[String] = js.native
  }
}
