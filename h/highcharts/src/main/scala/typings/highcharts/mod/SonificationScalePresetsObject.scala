package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Preset scales for pitch mapping.
  */
trait SonificationScalePresetsObject extends StObject {
  
  /**
    * Dorian scale
    */
  var dorian: js.Array[Double]
  
  /**
    * Harmonic minor scale
    */
  var harmonicMinor: js.Array[Double]
  
  /**
    * Lydian scale
    */
  var lydian: js.Array[Double]
  
  /**
    * Major (ionian) scale
    */
  var major: js.Array[Double]
  
  /**
    * Major pentatonic scale
    */
  var majorPentatonic: js.Array[Double]
  
  /**
    * Minor scale (aeolian)
    */
  var minor: js.Array[Double]
  
  /**
    * Minor pentatonic scale
    */
  var minorPentatonic: js.Array[Double]
  
  /**
    * Mixolydian scale
    */
  var mixolydian: js.Array[Double]
  
  /**
    * Phrygian scale
    */
  var phrygian: js.Array[Double]
}
object SonificationScalePresetsObject {
  
  inline def apply(
    dorian: js.Array[Double],
    harmonicMinor: js.Array[Double],
    lydian: js.Array[Double],
    major: js.Array[Double],
    majorPentatonic: js.Array[Double],
    minor: js.Array[Double],
    minorPentatonic: js.Array[Double],
    mixolydian: js.Array[Double],
    phrygian: js.Array[Double]
  ): SonificationScalePresetsObject = {
    val __obj = js.Dynamic.literal(dorian = dorian.asInstanceOf[js.Any], harmonicMinor = harmonicMinor.asInstanceOf[js.Any], lydian = lydian.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], majorPentatonic = majorPentatonic.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], minorPentatonic = minorPentatonic.asInstanceOf[js.Any], mixolydian = mixolydian.asInstanceOf[js.Any], phrygian = phrygian.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonificationScalePresetsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationScalePresetsObject] (val x: Self) extends AnyVal {
    
    inline def setDorian(value: js.Array[Double]): Self = StObject.set(x, "dorian", value.asInstanceOf[js.Any])
    
    inline def setDorianVarargs(value: Double*): Self = StObject.set(x, "dorian", js.Array(value*))
    
    inline def setHarmonicMinor(value: js.Array[Double]): Self = StObject.set(x, "harmonicMinor", value.asInstanceOf[js.Any])
    
    inline def setHarmonicMinorVarargs(value: Double*): Self = StObject.set(x, "harmonicMinor", js.Array(value*))
    
    inline def setLydian(value: js.Array[Double]): Self = StObject.set(x, "lydian", value.asInstanceOf[js.Any])
    
    inline def setLydianVarargs(value: Double*): Self = StObject.set(x, "lydian", js.Array(value*))
    
    inline def setMajor(value: js.Array[Double]): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorPentatonic(value: js.Array[Double]): Self = StObject.set(x, "majorPentatonic", value.asInstanceOf[js.Any])
    
    inline def setMajorPentatonicVarargs(value: Double*): Self = StObject.set(x, "majorPentatonic", js.Array(value*))
    
    inline def setMajorVarargs(value: Double*): Self = StObject.set(x, "major", js.Array(value*))
    
    inline def setMinor(value: js.Array[Double]): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorPentatonic(value: js.Array[Double]): Self = StObject.set(x, "minorPentatonic", value.asInstanceOf[js.Any])
    
    inline def setMinorPentatonicVarargs(value: Double*): Self = StObject.set(x, "minorPentatonic", js.Array(value*))
    
    inline def setMinorVarargs(value: Double*): Self = StObject.set(x, "minor", js.Array(value*))
    
    inline def setMixolydian(value: js.Array[Double]): Self = StObject.set(x, "mixolydian", value.asInstanceOf[js.Any])
    
    inline def setMixolydianVarargs(value: Double*): Self = StObject.set(x, "mixolydian", js.Array(value*))
    
    inline def setPhrygian(value: js.Array[Double]): Self = StObject.set(x, "phrygian", value.asInstanceOf[js.Any])
    
    inline def setPhrygianVarargs(value: Double*): Self = StObject.set(x, "phrygian", js.Array(value*))
  }
}
