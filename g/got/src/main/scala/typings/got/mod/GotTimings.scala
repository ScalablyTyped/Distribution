package typings.got.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotTimings extends StObject {
  
  var connect: Double
  
  var end: Double
  
  var error: Double
  
  var lookup: Double
  
  var phases: GotTimingsPhases
  
  var response: Double
  
  var socket: Double
  
  var start: Double
  
  var upload: Double
}
object GotTimings {
  
  inline def apply(
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
  
  extension [Self <: GotTimings](x: Self) {
    
    inline def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLookup(value: Double): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    inline def setPhases(value: GotTimingsPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: Double): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
