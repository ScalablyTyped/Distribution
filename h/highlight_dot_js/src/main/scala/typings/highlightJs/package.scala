package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AutoHighlightResult = typings.highlightJs.HighlightResult

type KeywordData = js.Tuple2[java.lang.String, scala.Double]

type KeywordDict = typings.std.Record[java.lang.String, typings.highlightJs.KeywordData]

type LanguageFn = js.Function1[/* hljs */ js.UndefOr[typings.highlightJs.HLJSApi], typings.highlightJs.Language]

type ModeCallback = js.Function2[
/* match */ typings.std.RegExpMatchArray, 
/* response */ typings.highlightJs.CallbackResponse, 
scala.Unit]
