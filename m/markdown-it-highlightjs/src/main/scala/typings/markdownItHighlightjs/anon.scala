package typings.markdownItHighlightjs

import org.scalablytyped.runtime.StringDictionary
import typings.highlightJs.HLJSApi
import typings.highlightJs.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Auto extends StObject {
    
    /**
      * Whether to automatically detect language if not specified.
      */
    var auto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to add the `hljs` class to raw code blocks (not fenced blocks).
      */
    var code: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to highlight inline code.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Register other languages which are not included in the standard pack.
      */
    var register: js.UndefOr[StringDictionary[js.Function1[/* hljs */ js.UndefOr[HLJSApi], Language]]] = js.undefined
  }
  object Auto {
    
    @scala.inline
    def apply(): Auto = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Auto]
    }
    
    @scala.inline
    implicit class AutoMutableBuilder[Self <: Auto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      @scala.inline
      def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setRegister(value: StringDictionary[js.Function1[/* hljs */ js.UndefOr[HLJSApi], Language]]): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    }
  }
}
