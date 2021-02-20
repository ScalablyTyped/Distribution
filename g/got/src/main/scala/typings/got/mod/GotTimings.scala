package typings.got.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotTimings extends StObject {
  
  var connect: Double = js.native
  
  var end: Double = js.native
  
  var error: Double = js.native
  
  var lookup: Double = js.native
  
  var phases: GotTimingsPhases = js.native
  
  var response: Double = js.native
  
  var socket: Double = js.native
  
  var start: Double = js.native
  
  var upload: Double = js.native
}
object GotTimings {
  
  @scala.inline
  def apply(
    connect: Double,
    end: Double,
    error: Double,
    lookup: Double,
    phases: GotTimingsPhases,
    response: Double,
    socket: Double,
    start: Double,
    upload: Double
  ): GotTimings = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotTimings]
  }
  
  @scala.inline
  implicit class GotTimingsMutableBuilder[Self <: GotTimings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookup(value: Double): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhases(value: GotTimingsPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: Double): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
