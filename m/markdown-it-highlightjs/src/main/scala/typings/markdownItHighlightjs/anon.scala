package typings.markdownItHighlightjs

import org.scalablytyped.runtime.StringDictionary
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
    var register: js.UndefOr[
        StringDictionary[
          js.Function1[
            /* hljs */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HLJSApi */ Any
            ], 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Language */ Any
          ]
        ]
      ] = js.undefined
  }
  object Auto {
    
    inline def apply(): Auto = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Auto]
    }
    
    extension [Self <: Auto](x: Self) {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setRegister(
        value: StringDictionary[
              js.Function1[
                /* hljs */ js.UndefOr[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HLJSApi */ Any
                ], 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Language */ Any
              ]
            ]
      ): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    }
  }
}
