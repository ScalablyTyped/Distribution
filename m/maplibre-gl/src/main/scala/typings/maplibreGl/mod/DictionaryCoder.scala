package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DictionaryCoder")
@js.native
open class DictionaryCoder protected () extends StObject {
  def this(strings: js.Array[String]) = this()
  
  var _numberToString: js.Array[String] = js.native
  
  var _stringToNumber: StringDictionary[Double] = js.native
  
  def decode(n: Double): String = js.native
  
  def encode(string: String): Double = js.native
}
