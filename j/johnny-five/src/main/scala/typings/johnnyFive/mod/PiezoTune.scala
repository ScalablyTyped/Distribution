package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PiezoTune extends StObject {
  
  var beats: js.UndefOr[Double] = js.undefined
  
  var song: String | (js.Array[js.Tuple2[/* frequency */ String | Null, /* duration */ Double]])
  
  var tempo: js.UndefOr[Double] = js.undefined
}
object PiezoTune {
  
  inline def apply(song: String | (js.Array[js.Tuple2[/* frequency */ String | Null, /* duration */ Double]])): PiezoTune = {
    val __obj = js.Dynamic.literal(song = song.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiezoTune]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PiezoTune] (val x: Self) extends AnyVal {
    
    inline def setBeats(value: Double): Self = StObject.set(x, "beats", value.asInstanceOf[js.Any])
    
    inline def setBeatsUndefined: Self = StObject.set(x, "beats", js.undefined)
    
    inline def setSong(value: String | (js.Array[js.Tuple2[/* frequency */ String | Null, /* duration */ Double]])): Self = StObject.set(x, "song", value.asInstanceOf[js.Any])
    
    inline def setSongVarargs(value: (js.Tuple2[/* frequency */ String | Null, /* duration */ Double])*): Self = StObject.set(x, "song", js.Array(value*))
    
    inline def setTempo(value: Double): Self = StObject.set(x, "tempo", value.asInstanceOf[js.Any])
    
    inline def setTempoUndefined: Self = StObject.set(x, "tempo", js.undefined)
  }
}
