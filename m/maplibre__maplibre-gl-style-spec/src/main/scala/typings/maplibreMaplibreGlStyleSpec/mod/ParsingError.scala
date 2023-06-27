package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "ParsingError")
@js.native
open class ParsingError protected () extends StObject {
  def this(error: js.Error) = this()
  
  var error: js.Error = js.native
  
  var line: Double = js.native
  
  var message: String = js.native
}
