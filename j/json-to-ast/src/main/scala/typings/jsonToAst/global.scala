package typings.jsonToAst

import typings.jsonToAst.mod.Options
import typings.jsonToAst.mod.ValueNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def jsonToAst(json: String): ValueNode = js.Dynamic.global.applyDynamic("jsonToAst")(json.asInstanceOf[js.Any]).asInstanceOf[ValueNode]
  inline def jsonToAst(json: String, settings: Options): ValueNode = (js.Dynamic.global.applyDynamic("jsonToAst")(json.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[ValueNode]
}
