package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ErrorEvent")
@js.native
open class ErrorEvent () extends MapboxEvent[Unit] {
  
  var error: js.Error = js.native
  
  @JSName("type")
  var type_ErrorEvent: error = js.native
}
