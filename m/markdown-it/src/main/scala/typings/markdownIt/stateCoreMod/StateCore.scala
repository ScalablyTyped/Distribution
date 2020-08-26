package typings.markdownIt.stateCoreMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateCore extends js.Object {
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
  implicit class StateCoreOps[Self <: StateCore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToken(
      value: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typings.markdownIt.tokenMod.^
        ]
    ): Self = this.set("Token", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineMode(value: Boolean): Self = this.set("inlineMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd(value: MarkdownIt): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: typings.markdownIt.tokenMod.^ *): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[typings.markdownIt.tokenMod.^]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
  
}

