package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Spell check result.
  */
trait SchemaSpellingCorrection extends StObject {
  
  /**
    * Indicates if the query was corrected by the spell checker.
    */
  var corrected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Correction output consisting of the corrected keyword string.
    */
  var correctedText: js.UndefOr[String] = js.undefined
}
object SchemaSpellingCorrection {
  
  inline def apply(): SchemaSpellingCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellingCorrection]
  }
  
  extension [Self <: SchemaSpellingCorrection](x: Self) {
    
    inline def setCorrected(value: Boolean): Self = StObject.set(x, "corrected", value.asInstanceOf[js.Any])
    
    inline def setCorrectedText(value: String): Self = StObject.set(x, "correctedText", value.asInstanceOf[js.Any])
    
    inline def setCorrectedTextUndefined: Self = StObject.set(x, "correctedText", js.undefined)
    
    inline def setCorrectedUndefined: Self = StObject.set(x, "corrected", js.undefined)
  }
}
