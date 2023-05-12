package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import typings.khanacademySimpleMarkdown.distMod.^
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.Capture
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: Exports = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[Exports]
inline def default_=(x: Exports): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])

type ASTNode = SingleASTNode | js.Array[SingleASTNode]

type ArrayNodeOutput[Result] = js.Function3[
/* node */ js.Array[SingleASTNode], 
/* nestedOutput */ Output[Result], 
/* state */ State, 
Result]

type Attr = js.UndefOr[String | Double | Boolean | Null]

type HtmlNodeOutput = NodeOutput[String]

type HtmlOutput = Output[String]

type NodeOutput[Result] = js.Function3[/* node */ SingleASTNode, /* nestedOutput */ Output[Result], /* state */ State, Result]

type Output[Result] = js.Function2[/* node */ ASTNode, /* state */ js.UndefOr[State | Null], Result]

type ParseFunction = js.Function3[
/* capture */ Capture, 
/* nestedParse */ Parser, 
/* state */ State, 
UnTypedASTNode | ASTNode]

type Parser = js.Function2[/* source */ String, /* state */ js.UndefOr[State | Null], js.Array[SingleASTNode]]

type ReactElement = typings.react.mod.ReactElement

type ReactElements = ReactNode

type ReactNodeOutput = NodeOutput[ReactElements]

type ReactOutput = Output[ReactElements]

type SingleNodeParseFunction = js.Function3[/* capture */ Capture, /* nestedParse */ Parser, /* state */ State, UnTypedASTNode]

type UnTypedASTNode = StringDictionary[Any]
