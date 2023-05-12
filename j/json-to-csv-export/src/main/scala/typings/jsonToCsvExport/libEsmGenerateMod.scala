package typings.jsonToCsvExport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmGenerateMod {
  
  @JSImport("json-to-csv-export/lib/esm/generate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def csvGenerate(data: js.Array[Any], headers: js.Array[String], delimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("csvGenerate")(data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def csvGenerate(data: js.Array[Any], headers: Unit, delimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("csvGenerate")(data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def csvGenerateRow(row: Any, headerKeys: js.Array[String], delimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("csvGenerateRow")(row.asInstanceOf[js.Any], headerKeys.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
}
