package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpellingCorrection extends StObject {
  
  /**
    * Indicates if the query was corrected by the spell checker.
    */
  var corrected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Corrected output with html tags to highlight the corrected words. Corrected words are called out with the "*...*" html tags. For example, the user input query is "software enginear", where the second word, "enginear," is incorrect. It should be "engineer". When spelling correction is enabled, this value is "software *engineer*".
    */
  var correctedHtml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Correction output consisting of the corrected keyword string.
    */
  var correctedText: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpellingCorrection {
  
  inline def apply(): SchemaSpellingCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellingCorrection]
  }
  
  extension [Self <: SchemaSpellingCorrection](x: Self) {
    
    inline def setCorrected(value: Boolean): Self = StObject.set(x, "corrected", value.asInstanceOf[js.Any])
    
    inline def setCorrectedHtml(value: String): Self = StObject.set(x, "correctedHtml", value.asInstanceOf[js.Any])
    
    inline def setCorrectedHtmlNull: Self = StObject.set(x, "correctedHtml", null)
    
    inline def setCorrectedHtmlUndefined: Self = StObject.set(x, "correctedHtml", js.undefined)
    
    inline def setCorrectedNull: Self = StObject.set(x, "corrected", null)
    
    inline def setCorrectedText(value: String): Self = StObject.set(x, "correctedText", value.asInstanceOf[js.Any])
    
    inline def setCorrectedTextNull: Self = StObject.set(x, "correctedText", null)
    
    inline def setCorrectedTextUndefined: Self = StObject.set(x, "correctedText", js.undefined)
    
    inline def setCorrectedUndefined: Self = StObject.set(x, "corrected", js.undefined)
  }
}
