package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import typings.khanacademySimpleMarkdown.anon.Dictkey
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.MatchFunction
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exports extends StObject {
  
  def ReactMarkdown(props: Dictkey): ReactElement = js.native
  
  def anyScopeRegex(regex: js.RegExp): MatchFunction = js.native
  
  def blockRegex(regex: js.RegExp): MatchFunction = js.native
  
  def defaultBlockParse(source: String): js.Array[SingleASTNode] = js.native
  def defaultBlockParse(source: String, state: State): js.Array[SingleASTNode] = js.native
  
  val defaultHtmlOutput: HtmlOutput = js.native
  
  def defaultImplicitParse(source: String): js.Array[SingleASTNode] = js.native
  def defaultImplicitParse(source: String, state: State): js.Array[SingleASTNode] = js.native
  
  def defaultInlineParse(source: String): js.Array[SingleASTNode] = js.native
  def defaultInlineParse(source: String, state: State): js.Array[SingleASTNode] = js.native
  
  def defaultRawParse(source: String): js.Array[SingleASTNode] = js.native
  def defaultRawParse(source: String, state: State): js.Array[SingleASTNode] = js.native
  
  val defaultReactOutput: ReactOutput = js.native
  
  val defaultRules: DefaultRules = js.native
  
  def htmlFor(arg1: HtmlNodeOutput): HtmlOutput = js.native
  
  def htmlTag(tagName: String, content: String): String = js.native
  def htmlTag(tagName: String, content: String, attributes: Null, isClosed: Boolean): String = js.native
  def htmlTag(tagName: String, content: String, attributes: Unit, isClosed: Boolean): String = js.native
  def htmlTag(tagName: String, content: String, attributes: Partial[Record[Any, js.UndefOr[Attr | Null]]]): String = js.native
  def htmlTag(
    tagName: String,
    content: String,
    attributes: Partial[Record[Any, js.UndefOr[Attr | Null]]],
    isClosed: Boolean
  ): String = js.native
  
  def inlineRegex(regex: js.RegExp): MatchFunction = js.native
  
  def markdownToHtml(source: String): String = js.native
  def markdownToHtml(source: String, state: State): String = js.native
  
  def markdownToReact(source: String): ReactElements = js.native
  def markdownToReact(source: String, state: State): ReactElements = js.native
  
  def outputFor[Rule](rules: OutputRules[Rule], param: /* keyof Rule */ String): Output[Any] = js.native
  def outputFor[Rule](rules: OutputRules[Rule], param: /* keyof Rule */ String, defaultState: State): Output[Any] = js.native
  
  def parseBlock(parse: Parser, content: String, state: State): ASTNode = js.native
  
  def parseInline(parse: Parser, content: String, state: State): ASTNode = js.native
  
  def parserFor(rules: ParserRules): Parser = js.native
  def parserFor(rules: ParserRules, defaultState: State): Parser = js.native
  
  def preprocess(source: String): String = js.native
  
  def reactElement(`type`: String, key: String, props: StringDictionary[Any]): ReactElement = js.native
  def reactElement(`type`: String, key: Null, props: StringDictionary[Any]): ReactElement = js.native
  
  def reactFor(arg1: ReactNodeOutput): ReactOutput = js.native
  
  def ruleOutput[Rule](rules: OutputRules[Rule], param: /* keyof Rule */ String): NodeOutput[Any] = js.native
  
  def sanitizeText(text: Attr): String = js.native
  
  def sanitizeUrl(): js.UndefOr[String | Null] = js.native
  def sanitizeUrl(url: String): js.UndefOr[String | Null] = js.native
  
  def unescapeUrl(url: String): String = js.native
}
