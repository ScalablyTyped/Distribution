package typings.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateCoreMod {
  
  @JSImport("markdown-it/lib/rules_core/state_core", JSImport.Namespace)
  @js.native
  class ^ protected () extends StateCore {
    def this(src: String, md: MarkdownIt, env: js.Any) = this()
  }
  
  @js.native
  trait StateCore extends StObject {
    
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typings.markdownIt.tokenMod.^
      ] = js.native
    
    var env: js.Any = js.native
    
    var inlineMode: Boolean = js.native
    
    /**
      * link to parser instance
      */
    var md: MarkdownIt = js.native
    
    var src: String = js.native
    
    var tokens: js.Array[typings.markdownIt.tokenMod.^] = js.native
  }
  object StateCore {
    
    @scala.inline
    def apply(
      Token: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typings.markdownIt.tokenMod.^
        ],
      env: js.Any,
      inlineMode: Boolean,
      md: MarkdownIt,
      src: String,
      tokens: js.Array[typings.markdownIt.tokenMod.^]
    ): StateCore = {
      val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], inlineMode = inlineMode.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateCore]
    }
    
    @scala.inline
    implicit class StateCoreMutableBuilder[Self <: StateCore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineMode(value: Boolean): Self = StObject.set(x, "inlineMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: MarkdownIt): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(
        value: Instantiable3[
              /* type */ String, 
              /* tag */ String, 
              /* nesting */ Nesting, 
              typings.markdownIt.tokenMod.^
            ]
      ): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: js.Array[typings.markdownIt.tokenMod.^]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensVarargs(value: typings.markdownIt.tokenMod.^ *): Self = StObject.set(x, "tokens", js.Array(value :_*))
    }
  }
}
