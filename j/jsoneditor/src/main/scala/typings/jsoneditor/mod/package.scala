package typings.jsoneditor.mod

import typings.jsoneditor.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AutoCompleteCompletion = Null | js.Array[String] | Options

type AutoCompleteGetOptions = js.Function4[
/* text */ String, 
/* path */ JSONPath, 
/* input */ AutoCompleteElementType, 
/* editor */ JSONEditor, 
AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]]

type JSONPath = js.Array[String | Double]

type NodeValue = String | Boolean | Double | Null
