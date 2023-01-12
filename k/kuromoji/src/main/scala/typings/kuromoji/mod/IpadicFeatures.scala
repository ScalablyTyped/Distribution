package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpadicFeatures extends StObject {
  
  var basic_form: String
  
  var conjugated_form: String
  
  var conjugated_type: String
  
  var pos: String
  
  var pos_detail_1: String
  
  var pos_detail_2: String
  
  var pos_detail_3: String
  
  var pronunciation: js.UndefOr[String] = js.undefined
  
  var reading: js.UndefOr[String] = js.undefined
  
  var surface_form: String
  
  var word_id: Double
  
  var word_position: Double
  
  var word_type: String
}
object IpadicFeatures {
  
  inline def apply(
    basic_form: String,
    conjugated_form: String,
    conjugated_type: String,
    pos: String,
    pos_detail_1: String,
    pos_detail_2: String,
    pos_detail_3: String,
    surface_form: String,
    word_id: Double,
    word_position: Double,
    word_type: String
  ): IpadicFeatures = {
    val __obj = js.Dynamic.literal(basic_form = basic_form.asInstanceOf[js.Any], conjugated_form = conjugated_form.asInstanceOf[js.Any], conjugated_type = conjugated_type.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], pos_detail_1 = pos_detail_1.asInstanceOf[js.Any], pos_detail_2 = pos_detail_2.asInstanceOf[js.Any], pos_detail_3 = pos_detail_3.asInstanceOf[js.Any], surface_form = surface_form.asInstanceOf[js.Any], word_id = word_id.asInstanceOf[js.Any], word_position = word_position.asInstanceOf[js.Any], word_type = word_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpadicFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpadicFeatures] (val x: Self) extends AnyVal {
    
    inline def setBasic_form(value: String): Self = StObject.set(x, "basic_form", value.asInstanceOf[js.Any])
    
    inline def setConjugated_form(value: String): Self = StObject.set(x, "conjugated_form", value.asInstanceOf[js.Any])
    
    inline def setConjugated_type(value: String): Self = StObject.set(x, "conjugated_type", value.asInstanceOf[js.Any])
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPos_detail_1(value: String): Self = StObject.set(x, "pos_detail_1", value.asInstanceOf[js.Any])
    
    inline def setPos_detail_2(value: String): Self = StObject.set(x, "pos_detail_2", value.asInstanceOf[js.Any])
    
    inline def setPos_detail_3(value: String): Self = StObject.set(x, "pos_detail_3", value.asInstanceOf[js.Any])
    
    inline def setPronunciation(value: String): Self = StObject.set(x, "pronunciation", value.asInstanceOf[js.Any])
    
    inline def setPronunciationUndefined: Self = StObject.set(x, "pronunciation", js.undefined)
    
    inline def setReading(value: String): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
    
    inline def setReadingUndefined: Self = StObject.set(x, "reading", js.undefined)
    
    inline def setSurface_form(value: String): Self = StObject.set(x, "surface_form", value.asInstanceOf[js.Any])
    
    inline def setWord_id(value: Double): Self = StObject.set(x, "word_id", value.asInstanceOf[js.Any])
    
    inline def setWord_position(value: Double): Self = StObject.set(x, "word_position", value.asInstanceOf[js.Any])
    
    inline def setWord_type(value: String): Self = StObject.set(x, "word_type", value.asInstanceOf[js.Any])
  }
}
