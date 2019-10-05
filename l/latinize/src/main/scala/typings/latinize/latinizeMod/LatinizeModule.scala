package typings.latinize.latinizeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("latinize", "LatinizeModule")
@js.native
object LatinizeModule extends js.Object {
  @js.native
  trait Latinize extends js.Object {
    var characters: StringDictionary[String] = js.native
    def apply(str: String): String = js.native
  }
  
}

