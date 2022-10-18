package typings.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.libTokenMod.Nesting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesCoreStateCoreMod {
  
  @JSImport("markdown-it/lib/rules_core/state_core", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StateCore {
    def this(src: String, md: MarkdownIt, env: Any) = this()
    
    /* CompleteClass */
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typings.markdownIt.libTokenMod.^
      ] = js.native
    
    /* CompleteClass */
    var env: Any = js.native
    
    /* CompleteClass */
    var inlineMode: Boolean = js.native
    
    /**
      * link to parser instance
      */
    /* CompleteClass */
    var md: MarkdownIt = js.native
    
    /* CompleteClass */
    var src: String = js.native
    
    /* CompleteClass */
    var tokens: js.Array[typings.markdownIt.libTokenMod.^] = js.native
  }
  
  trait StateCore extends StObject {
    
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typings.markdownIt.libTokenMod.^
      ]
    
    var env: Any
    
    var inlineMode: Boolean
    
    /**
      * link to parser instance
      */
    var md: MarkdownIt
    
    var src: String
    
    var tokens: js.Array[typings.markdownIt.libTokenMod.^]
  }
  object StateCore {
    
    inline def apply(
      Token: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typings.markdownIt.libTokenMod.^
        ],
      env: Any,
      inlineMode: Boolean,
      md: MarkdownIt,
      src: String,
      tokens: js.Array[typings.markdownIt.libTokenMod.^]
    ): StateCore = {
      val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], inlineMode = inlineMode.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateCore]
    }
    
    extension [Self <: StateCore](x: Self) {
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setInlineMode(value: Boolean): Self = StObject.set(x, "inlineMode", value.asInstanceOf[js.Any])
      
      inline def setMd(value: MarkdownIt): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setToken(
        value: Instantiable3[
              /* type */ String, 
              /* tag */ String, 
              /* nesting */ Nesting, 
              typings.markdownIt.libTokenMod.^
            ]
      ): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[typings.markdownIt.libTokenMod.^]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: typings.markdownIt.libTokenMod.^ *): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
