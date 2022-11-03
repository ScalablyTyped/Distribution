package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.vscode.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object l10n {
  
  @JSGlobal("vscode.l10n")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("vscode.l10n.bundle")
  @js.native
  val bundle: js.UndefOr[StringDictionary[String]] = js.native
  
  inline def t(message: String, args: (String | Double | Boolean)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(scala.List(message.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def t(message: String, args: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(message.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def t(options: Args): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSGlobal("vscode.l10n.uri")
  @js.native
  val uri: js.UndefOr[typings.vscode.mod.Uri] = js.native
}
