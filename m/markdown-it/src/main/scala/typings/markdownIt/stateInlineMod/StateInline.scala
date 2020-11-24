package typings.markdownIt.stateInlineMod

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateInline extends js.Object {
  
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typings.markdownIt.tokenMod.^
  ] = js.native
  
  /**
    * Stores { start: end } pairs. Useful for backtrack
    * optimization of pairs parse (emphasis, strikes).
    */
  var cache: js.Any = js.native
  
  /**
    * List of emphasis-like delimiters for current tag
    */
  var delimiters: js.Array[Delimiter] = js.native
  
  var env: js.Any = js.native
  
  var level: Double = js.native
  
  var md: MarkdownIt = js.native
  
  var pending: String = js.native
  
  var pendingLevel: Double = js.native
  
  var pos: Double = js.native
  
  var posMax: Double = js.native
  
  /**
    * Push new token to "stream".
    * If pending text exists - flush it as text token
    */
  def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.tokenMod.^ = js.native
  
  // Stack of delimiter lists for upper level tags
  // _prev_delimiters: StateInline.Delimiter[][];
  /**
    * Flush pending text
    */
  def pushPending(): typings.markdownIt.tokenMod.^ = js.native
  
  /**
    * Scan a sequence of emphasis-like markers, and determine whether
    * it can start an emphasis sequence or end an emphasis sequence.
    *
    * @param start position to scan from (it should point at a valid marker);
    * @param canSplitWord determine if these markers can be found inside a word
    */
  def scanDelims(start: Double, canSplitWord: Boolean): Scanned = js.native
  
  var src: String = js.native
  
  var tokens: js.Array[typings.markdownIt.tokenMod.^] = js.native
  
  var tokens_meta: js.Array[TokenMata | Null] = js.native
}
object StateInline {
  
  @scala.inline
  def apply(
    Token: Instantiable3[
      /* type */ String, 
      /* tag */ String, 
      /* nesting */ Nesting, 
      typings.markdownIt.tokenMod.^
    ],
    cache: js.Any,
    delimiters: js.Array[Delimiter],
    env: js.Any,
    level: Double,
    md: MarkdownIt,
    pending: String,
    pendingLevel: Double,
    pos: Double,
    posMax: Double,
    push: (String, String, Nesting) => typings.markdownIt.tokenMod.^,
    pushPending: () => typings.markdownIt.tokenMod.^,
    scanDelims: (Double, Boolean) => Scanned,
    src: String,
    tokens: js.Array[typings.markdownIt.tokenMod.^],
    tokens_meta: js.Array[TokenMata | Null]
  ): StateInline = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingLevel = pendingLevel.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], posMax = posMax.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), pushPending = js.Any.fromFunction0(pushPending), scanDelims = js.Any.fromFunction2(scanDelims), src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], tokens_meta = tokens_meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInline]
  }
  
  @scala.inline
  implicit class StateInlineOps[Self <: StateInline] (val x: Self) extends AnyVal {
    
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
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimitersVarargs(value: Delimiter*): Self = this.set("delimiters", js.Array(value :_*))
    
    @scala.inline
    def setDelimiters(value: js.Array[Delimiter]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd(value: MarkdownIt): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: String): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingLevel(value: Double): Self = this.set("pendingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosMax(value: Double): Self = this.set("posMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: (String, String, Nesting) => typings.markdownIt.tokenMod.^): Self = this.set("push", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPushPending(value: () => typings.markdownIt.tokenMod.^): Self = this.set("pushPending", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanDelims(value: (Double, Boolean) => Scanned): Self = this.set("scanDelims", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: typings.markdownIt.tokenMod.^ *): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[typings.markdownIt.tokenMod.^]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens_metaVarargs(value: (TokenMata | Null)*): Self = this.set("tokens_meta", js.Array(value :_*))
    
    @scala.inline
    def setTokens_meta(value: js.Array[TokenMata | Null]): Self = this.set("tokens_meta", value.asInstanceOf[js.Any])
  }
}
