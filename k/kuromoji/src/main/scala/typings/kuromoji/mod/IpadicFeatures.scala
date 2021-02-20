package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpadicFeatures extends StObject {
  
  var basic_form: String = js.native
  
  var conjugated_form: String = js.native
  
  var conjugated_type: String = js.native
  
  var pos: String = js.native
  
  var pos_detail_1: String = js.native
  
  var pos_detail_2: String = js.native
  
  var pos_detail_3: String = js.native
  
  var pronunciation: js.UndefOr[String] = js.native
  
  var reading: js.UndefOr[String] = js.native
  
  var surface_form: String = js.native
  
  var word_id: Double = js.native
  
  var word_position: Double = js.native
  
  var word_type: String = js.native
}
object IpadicFeatures {
  
  @scala.inline
  def apply(
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
  implicit class IpadicFeaturesMutableBuilder[Self <: IpadicFeatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasic_form(value: String): Self = StObject.set(x, "basic_form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConjugated_form(value: String): Self = StObject.set(x, "conjugated_form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConjugated_type(value: String): Self = StObject.set(x, "conjugated_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos_detail_1(value: String): Self = StObject.set(x, "pos_detail_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos_detail_2(value: String): Self = StObject.set(x, "pos_detail_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos_detail_3(value: String): Self = StObject.set(x, "pos_detail_3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPronunciation(value: String): Self = StObject.set(x, "pronunciation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPronunciationUndefined: Self = StObject.set(x, "pronunciation", js.undefined)
    
    @scala.inline
    def setReading(value: String): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingUndefined: Self = StObject.set(x, "reading", js.undefined)
    
    @scala.inline
    def setSurface_form(value: String): Self = StObject.set(x, "surface_form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord_id(value: Double): Self = StObject.set(x, "word_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord_position(value: Double): Self = StObject.set(x, "word_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord_type(value: String): Self = StObject.set(x, "word_type", value.asInstanceOf[js.Any])
  }
}
