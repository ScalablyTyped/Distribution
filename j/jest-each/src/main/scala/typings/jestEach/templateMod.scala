package typings.jestEach

import typings.jestEach.bindMod.EachTests
import typings.jestTypes.globalMod.Row
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("jest-each/build/table/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(title: String, headings: Headings, row: Row): EachTests = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], headings.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[EachTests]
  
  inline def getPath[Obj /* <: Template */](obj: Obj, path: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getPath[Obj /* <: Template */, A /* <: /* keyof Obj */ String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */](obj: Obj, path: js.Tuple2[A, B]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B] */ js.Any]
  inline def getPath[Obj /* <: Template */, A /* <: /* keyof Obj */ String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */, C /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B] */ js.Any */](obj: Obj, path: js.Tuple3[A, B, C]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C] */ js.Any]
  inline def getPath[Obj /* <: Template */, A /* <: /* keyof Obj */ String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */, C /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B] */ js.Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B][C] */ js.Any */](obj: Obj, path: js.Tuple4[A, B, C, D]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C][D] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C][D] */ js.Any]
  inline def getPath[Obj /* <: Template */, A /* <: /* keyof Obj */ String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */, C /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B] */ js.Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B][C] */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B][C][D] */ js.Any */](obj: Obj, path: js.Tuple5[A, B, C, D, E]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C][D][E] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C][D][E] */ js.Any]
  
  inline def getPath_Obj_TemplateA_String[Obj /* <: Template */, A /* <: /* keyof Obj */ String */](obj: Obj, path: js.Array[A]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Obj[A] */ js.Any]
  
  type Headings = js.Array[String]
  
  type Template = Record[String, js.Any]
}
