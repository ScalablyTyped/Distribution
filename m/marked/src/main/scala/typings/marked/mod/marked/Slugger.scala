package typings.marked.mod.marked

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "marked.Slugger")
@js.native
open class Slugger () extends StObject {
  
  var seen: StringDictionary[Double] = js.native
  
  def slug(value: String): String = js.native
  def slug(value: String, options: SluggerOptions): String = js.native
}
