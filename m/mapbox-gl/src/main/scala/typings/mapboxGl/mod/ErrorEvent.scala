package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.error
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ErrorEvent")
@js.native
class ErrorEvent () extends MapboxEvent[Unit] {
  
  var error: Error = js.native
  
  @JSName("type")
  var type_ErrorEvent: error = js.native
}
