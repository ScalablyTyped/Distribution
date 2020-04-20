package typings.markdownIt.stateCoreMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateCore extends js.Object {
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typings.markdownIt.tokenMod.^
  ]
  var env: js.Any
  var inlineMode: Boolean
  /**
    * link to parser instance
    */
  var md: MarkdownIt
  var src: String
  var tokens: js.Array[typings.markdownIt.tokenMod.^]
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
}

