package typings.hoganJs

import typings.hoganJs.hoganJsBooleans.`false`
import typings.hoganJs.hoganJsBooleans.`true`
import typings.hoganJs.mod.SectionTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined hogan.js.hogan.js.HoganOptions & {  asString :false} */
  @js.native
  trait HoganOptionsasStringfalse extends StObject {
    
    var asString: js.UndefOr[Boolean] with `false` = js.native
    
    var delimiters: js.UndefOr[String] = js.native
    
    var disableLambda: js.UndefOr[Boolean] = js.native
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.native
  }
  object HoganOptionsasStringfalse {
    
    @scala.inline
    def apply(asString: js.UndefOr[Boolean] with `false`): HoganOptionsasStringfalse = {
      val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoganOptionsasStringfalse]
    }
    
    @scala.inline
    implicit class HoganOptionsasStringfalseMutableBuilder[Self <: HoganOptionsasStringfalse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsString(value: js.UndefOr[Boolean] with `false`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiters(value: String): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDisableLambda(value: Boolean): Self = StObject.set(x, "disableLambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLambdaUndefined: Self = StObject.set(x, "disableLambda", js.undefined)
      
      @scala.inline
      def setSectionTags(value: js.Array[SectionTags]): Self = StObject.set(x, "sectionTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionTagsUndefined: Self = StObject.set(x, "sectionTags", js.undefined)
      
      @scala.inline
      def setSectionTagsVarargs(value: SectionTags*): Self = StObject.set(x, "sectionTags", js.Array(value :_*))
    }
  }
  
  /* Inlined hogan.js.hogan.js.HoganOptions & {  asString :true} */
  @js.native
  trait HoganOptionsasStringtrue extends StObject {
    
    var asString: js.UndefOr[Boolean] with `true` = js.native
    
    var delimiters: js.UndefOr[String] = js.native
    
    var disableLambda: js.UndefOr[Boolean] = js.native
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.native
  }
  object HoganOptionsasStringtrue {
    
    @scala.inline
    def apply(asString: js.UndefOr[Boolean] with `true`): HoganOptionsasStringtrue = {
      val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoganOptionsasStringtrue]
    }
    
    @scala.inline
    implicit class HoganOptionsasStringtrueMutableBuilder[Self <: HoganOptionsasStringtrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsString(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiters(value: String): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDisableLambda(value: Boolean): Self = StObject.set(x, "disableLambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLambdaUndefined: Self = StObject.set(x, "disableLambda", js.undefined)
      
      @scala.inline
      def setSectionTags(value: js.Array[SectionTags]): Self = StObject.set(x, "sectionTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionTagsUndefined: Self = StObject.set(x, "sectionTags", js.undefined)
      
      @scala.inline
      def setSectionTagsVarargs(value: SectionTags*): Self = StObject.set(x, "sectionTags", js.Array(value :_*))
    }
  }
}
