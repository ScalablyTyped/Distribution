package typings.marked.mod

import org.scalablytyped.runtime.StringDictionary
import typings.marked.anon.Href
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokensList
  extends StObject
     with Array[Token] {
  
  var links: StringDictionary[Href] = js.native
}
