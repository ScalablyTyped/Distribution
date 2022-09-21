package typings.hoganJs

import typings.hoganJs.hoganJsBooleans.`false`
import typings.hoganJs.hoganJsBooleans.`true`
import typings.hoganJs.mod.SectionTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined hogan.js.hogan.js.HoganOptions & {  asString :false} */
  trait HoganOptionsasStringfalse extends StObject {
    
    var asString: js.UndefOr[Boolean] & `false`
    
    var delimiters: js.UndefOr[String] = js.undefined
    
    var disableLambda: js.UndefOr[Boolean] = js.undefined
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
  }
  object HoganOptionsasStringfalse {
    
    inline def apply(asString: js.UndefOr[Boolean] & `false`): HoganOptionsasStringfalse = {
      val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoganOptionsasStringfalse]
    }
    
    extension [Self <: HoganOptionsasStringfalse](x: Self) {
      
      inline def setAsString(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setDelimiters(value: String): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDisableLambda(value: Boolean): Self = StObject.set(x, "disableLambda", value.asInstanceOf[js.Any])
      
      inline def setDisableLambdaUndefined: Self = StObject.set(x, "disableLambda", js.undefined)
      
      inline def setSectionTags(value: js.Array[SectionTags]): Self = StObject.set(x, "sectionTags", value.asInstanceOf[js.Any])
      
      inline def setSectionTagsUndefined: Self = StObject.set(x, "sectionTags", js.undefined)
      
      inline def setSectionTagsVarargs(value: SectionTags*): Self = StObject.set(x, "sectionTags", js.Array(value*))
    }
  }
  
  /* Inlined hogan.js.hogan.js.HoganOptions & {  asString :true} */
  trait HoganOptionsasStringtrue extends StObject {
    
    var asString: js.UndefOr[Boolean] & `true`
    
    var delimiters: js.UndefOr[String] = js.undefined
    
    var disableLambda: js.UndefOr[Boolean] = js.undefined
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
  }
  object HoganOptionsasStringtrue {
    
    inline def apply(asString: js.UndefOr[Boolean] & `true`): HoganOptionsasStringtrue = {
      val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoganOptionsasStringtrue]
    }
    
    extension [Self <: HoganOptionsasStringtrue](x: Self) {
      
      inline def setAsString(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setDelimiters(value: String): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDisableLambda(value: Boolean): Self = StObject.set(x, "disableLambda", value.asInstanceOf[js.Any])
      
      inline def setDisableLambdaUndefined: Self = StObject.set(x, "disableLambda", js.undefined)
      
      inline def setSectionTags(value: js.Array[SectionTags]): Self = StObject.set(x, "sectionTags", value.asInstanceOf[js.Any])
      
      inline def setSectionTagsUndefined: Self = StObject.set(x, "sectionTags", js.undefined)
      
      inline def setSectionTagsVarargs(value: SectionTags*): Self = StObject.set(x, "sectionTags", js.Array(value*))
    }
  }
}
