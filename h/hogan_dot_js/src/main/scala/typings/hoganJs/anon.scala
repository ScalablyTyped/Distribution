package typings.hoganJs

import typings.hoganJs.mod.SectionTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined hogan.js.hogan.js.HoganOptions & {  asString :false} */
  trait HoganOptionsasStringfalse extends StObject {
    
    var asString: js.UndefOr[Boolean] = js.undefined
    
    var delimiters: js.UndefOr[String] = js.undefined
    
    var disableLambda: js.UndefOr[Boolean] = js.undefined
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
  }
  object HoganOptionsasStringfalse {
    
    inline def apply(): HoganOptionsasStringfalse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoganOptionsasStringfalse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HoganOptionsasStringfalse] (val x: Self) extends AnyVal {
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
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
    
    var asString: js.UndefOr[Boolean] = js.undefined
    
    var delimiters: js.UndefOr[String] = js.undefined
    
    var disableLambda: js.UndefOr[Boolean] = js.undefined
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
  }
  object HoganOptionsasStringtrue {
    
    inline def apply(): HoganOptionsasStringtrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoganOptionsasStringtrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HoganOptionsasStringtrue] (val x: Self) extends AnyVal {
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
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
