package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.anon.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl/dist/style-spec", "ValidationError")
@js.native
open class ValidationError protected () extends StObject {
  def this(key: String, value: Any & Line, message: String) = this()
  def this(key: String, value: Any & Line, message: String, identifier: String) = this()
  
  var identifier: String = js.native
  
  var line: Double = js.native
  
  var message: String = js.native
}
