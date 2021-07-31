package typings.jsonParseHelpfulerror

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-parse-helpfulerror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parse(
    text: String,
    reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
